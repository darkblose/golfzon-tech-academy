package test.com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.com.model.MemberVO;

/**
 * Servlet implementation class IndexController
 */
@WebServlet({"/m_insert.do","/m_insertOK.do"
	,"/m_update.do","/m_updateOK.do"
	,"/m_delete.do","/m_deleteOK.do","/m_selectAll.do"
	,"/m_selectOne.do","/m_searchList.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sPath = request.getServletPath();
		
		System.out.print("doGet():");
		System.out.println(sPath);
		if(sPath.equals("/m_insert.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("member/insert.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_selectAll.do")) {
			
			List<MemberVO> vos = new ArrayList<MemberVO>();
			for (int i = 0; i < 10; i++) {
				MemberVO vo = new MemberVO();
				vo.setNum(i+1);
				vo.setId("admin"+(i+1));
				vo.setPw("hi121"+(i+1));
				vo.setName("kim"+(i+1));
				vo.setTel("010"+(i+1));
				vos.add(vo);
			}
			request.setAttribute("vos", vos);
			
			RequestDispatcher rd = request.getRequestDispatcher("member/selectAll.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_update.do")) {
			System.out.println(request.getParameter("num"));

			MemberVO vo2 = new MemberVO();
			vo2.setNum(2);
			vo2.setId("admin22");
			vo2.setPw("hi12122");
			vo2.setName("kim22");
			vo2.setTel("01022");
			request.setAttribute("vo2", vo2);
			
			RequestDispatcher rd = request.getRequestDispatcher("member/update.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_delete.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("member/delete.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_selectOne.do")) {
			
			System.out.println(request.getParameter("num"));
			
			MemberVO vo2 = new MemberVO();
			vo2.setNum(2);
			vo2.setId("admin22");
			vo2.setPw("hi12122");
			vo2.setName("kim22");
			vo2.setTel("01022");
			request.setAttribute("vo2", vo2);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("member/selectOne.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_searchList.do")) {
			System.out.println(request.getParameter("searchKey"));
			System.out.println(request.getParameter("searchWord"));

			List<MemberVO> vos = new ArrayList<MemberVO>();
			for (int i = 0; i < 10; i+=2) {
				MemberVO vo = new MemberVO();
				vo.setNum(i+1);
				vo.setId("admin"+(i+1));
				vo.setPw("hi121"+(i+1));
				vo.setName("kim"+(i+1));
				vo.setTel("010"+(i+1));
				vos.add(vo);
			}
			request.setAttribute("vos", vos);
			
			RequestDispatcher rd = request.getRequestDispatcher("member/selectAll.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/m_insertOK.do")) {
			response.sendRedirect("m_insert.do");
		}else if(sPath.equals("/m_deleteOK.do")) {
			System.out.println(request.getParameter("num"));
			
			response.sendRedirect("m_selectAll.do");
		}
		
		
		
		
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String sPath = request.getServletPath();
		
		System.out.print("doPost():");
		System.out.println(sPath);
		if(sPath.equals("/m_insertOK.do")) {
			
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));
			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("tel"));
			
			response.sendRedirect("m_selectAll.do");
		}else if(sPath.equals("/m_updateOK.do")) {
			
			System.out.println(request.getParameter("num"));
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));
			System.out.println(request.getParameter("name"));
			System.out.println(request.getParameter("tel"));
			
			response.sendRedirect("m_selectOne.do?num="+request.getParameter("num"));
		}
		
	}//end doPost

}
