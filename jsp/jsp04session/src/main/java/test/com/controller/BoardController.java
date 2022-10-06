package test.com.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.com.model.BoardVO;

/**
 * Servlet implementation class IndexController
 */
@WebServlet({"/b_insert.do","/b_insertOK.do",
	"/b_update.do","/b_updateOK.do",
	"/b_delete.do","/b_deleteOK.do",
	"/b_selectAll.do","/b_selectOne.do",
	"/b_searchList.do"})
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("doGet:"+sPath);
		if(sPath.equals("/b_insert.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("board/insert.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/b_insertOK.do")) {
			response.sendRedirect("b_insert.do");
		}else if(sPath.equals("/b_selectAll.do")) {
			
//			List<BoardVO> vos = dao.selectAll();
			List<BoardVO> vos = new ArrayList<BoardVO>();
			
			for (int i = 0; i < 10; i++) {
				BoardVO vo2 = new BoardVO();
				vo2.setNum(i+1);
				vo2.setTitle("title"+(i+1));
				vo2.setContent("content"+(i+1));
				vo2.setWriter("writer"+(i+1));
				vo2.setWdate(new Timestamp(System.currentTimeMillis()));
				vos.add(vo2);
			}
			
			request.setAttribute("vos", vos);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("board/selectAll.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/b_update.do")) {
			if(request.getParameter("num") != null) {
				String num = request.getParameter("num");
				System.out.println(num);
				
//				BoardVO vo = new BoardVO();
//				vo.setNum(Integer.parseInt(num));
				
//				BoardVO vo2 = dao.selectOne(vo);
				BoardVO vo2 = new BoardVO();
				vo2.setNum(Integer.parseInt(num));
				vo2.setTitle("title2");
				vo2.setContent("content2");
				vo2.setWriter("writer2");
				
				request.setAttribute("vo2", vo2);
				
				RequestDispatcher rd = request.getRequestDispatcher("board/update.jsp");
				rd.forward(request, response);
			}else {
				response.sendRedirect("b_selectAll.do");
			}
		}else if(sPath.equals("/b_delete.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("board/delete.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/b_selectOne.do")) {
			
			if(request.getParameter("num") != null) {
				String num = request.getParameter("num");
				System.out.println(num);
				
//				BoardVO vo = new BoardVO();
//				vo.setNum(Integer.parseInt(num));
				
//				BoardVO vo2 = dao.selectOne(vo);
				BoardVO vo2 = new BoardVO();
				vo2.setNum(Integer.parseInt(num));
				vo2.setTitle("title2");
				vo2.setContent("content2");
				vo2.setWriter("writer2");
				vo2.setWdate(new Timestamp(System.currentTimeMillis()));
				
				request.setAttribute("vo2", vo2);
				
				RequestDispatcher rd = request.getRequestDispatcher("board/selectOne.jsp");
				rd.forward(request, response);
			}else {
				response.sendRedirect("b_selectAll.do");
			}
			
			
			
		}else if(sPath.equals("/b_searchList.do")) {
			
			System.out.println(request.getParameter("searchKey"));
			System.out.println(request.getParameter("searchWord"));
			
//			List<BoardVO> vos = dao.searchList(searchKey,searchWord);
			List<BoardVO> vos = new ArrayList<BoardVO>();
			
			for (int i = 0; i < 5; i++) {
				BoardVO vo2 = new BoardVO();
				vo2.setNum(i+1);
				vo2.setTitle("title"+(i+1));
				vo2.setContent("content"+(i+1));
				vo2.setWriter("writer"+(i+1));
				vo2.setWdate(new Timestamp(System.currentTimeMillis()));
				vos.add(vo2);
			}
			
			request.setAttribute("vos", vos);
			
			RequestDispatcher rd = request.getRequestDispatcher("board/selectAll.jsp");
			rd.forward(request, response);
		}else if(sPath.equals("/b_deleteOK.do")) {
			
			String num = request.getParameter("num");
			System.out.println(num);
			
			response.sendRedirect("b_selectAll.do");
		}
		
		
		
		
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sPath = request.getServletPath();
		System.out.println("doPost:"+sPath);
		if(sPath.equals("/b_insertOK.do")) {
			
			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("content"));
			System.out.println(request.getParameter("writer"));
			
			
			response.sendRedirect("b_selectAll.do");
		}else if(sPath.equals("/b_updateOK.do")) {
			String num = request.getParameter("num");
			System.out.println(num);
			System.out.println(request.getParameter("title"));
			System.out.println(request.getParameter("content"));
			System.out.println(request.getParameter("writer"));
			
			//int result = dao.update(vo);
			
			response.sendRedirect("b_selectAll.do");
		}
		
		
	}//end doPost

}
