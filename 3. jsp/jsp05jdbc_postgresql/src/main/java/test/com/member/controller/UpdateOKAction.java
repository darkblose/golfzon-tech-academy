package test.com.member.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import test.com.member.model.MemberDAO;
import test.com.member.model.MemberDAOimpl;
import test.com.member.model.MemberVO;

public class UpdateOKAction {
	
	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String num = null;
		String id = null;
		String pw = null;
		String name = null;
		String tel = null;
		String img_name = null;
		long checkFileSize = 0;
		
		String dir_path = 
				request.getServletContext()
				.getRealPath("/upload");
		System.out.println(dir_path);

		
		int fileSizeMax = 1024 * 1024 * 100;

		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);

		if(isMultipartContent) {
			DiskFileItemFactory factory = 
					new DiskFileItemFactory();
			factory.setSizeThreshold(fileSizeMax);
			
			ServletFileUpload sfu = 
					new ServletFileUpload(factory);
			sfu.setFileSizeMax(fileSizeMax);//파일 사이즈 제한

			
			
			try {
				List<FileItem> items = 
						sfu.parseRequest(request);
				for (FileItem item : items) {
					if (item.isFormField()) { //num,pw,name,tel 받기
						if(item.getFieldName().equals("num")) {
							num = item.getString("UTF-8");
						}
						if(item.getFieldName().equals("id")) {
							id = item.getString("UTF-8");
						}
						if(item.getFieldName().equals("pw")) {
							pw = item.getString("UTF-8");
						}
						if(item.getFieldName().equals("name")) {
							name = item.getString("UTF-8");
						}
						if(item.getFieldName().equals("tel")) {
							tel = item.getString("UTF-8");
						}

					}else {
//						System.out.println("파일의 키 : " + item.getFieldName());
//						System.out.println("파일 파일명 : " + item.getName());
//						System.out.println("파일 컨텐츠 타입 : " + item.getContentType());
//						System.out.println("파일 사이즈  : " + item.getSize());
						checkFileSize = item.getSize();
						if(checkFileSize==0)
							response.sendRedirect("m_update.do?num=" + num);
						else{
							img_name = FilenameUtils.getName(item.getName());
							img_name = id+"_"+img_name;
							File saveFile = new File(dir_path, img_name);
							
							try {
								item.write(saveFile);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}

					}//end else


				}//end for << items
			} catch (FileUploadException e) {
				e.printStackTrace();
			}


		}//end if << isMultilpart
		System.out.println("num:"+num);
		System.out.println("pw:"+pw);
		System.out.println("name:"+name);
		System.out.println("tel:"+tel);
		System.out.println("img_name:"+img_name);
		
		if(checkFileSize!=0) {
			MemberVO vo = new MemberVO();
			vo.setNum(Integer.parseInt(num));
			vo.setPw(pw);
			vo.setName(name);
			vo.setTel(tel);
			vo.setImg_name(img_name);
			
			MemberDAO dao = new MemberDAOimpl();
			int result = dao.update(vo);
			System.out.println("result:"+result);
			
			if(result==1)
				response.sendRedirect("m_selectOne.do?num=" + num);
			else
				response.sendRedirect("m_update.do?num=" + num);
			
		}//end if << checkFileSize
		
	}//end execute

}//end class
