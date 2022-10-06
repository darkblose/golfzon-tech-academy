package test.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexController
 */
@WebServlet({"/index.do","/logout.do",
	"/login.do","/loginOK.do"})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("doGet:" + sPath);
		if (sPath.equals("/index.do")) {
			
			ServletContext app = request.getServletContext();
			System.out.println(app.getRealPath("board"));		

			app.setAttribute("player_name", "King1004");
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}else if (sPath.equals("/login.do")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}else if (sPath.equals("/logout.do")) {
			
			HttpSession session = request.getSession();
			session.removeAttribute("user_id");
			
			response.sendRedirect("index.do");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("doPost:" + sPath);
		if (sPath.equals("/loginOK.do")) {
			System.out.println(request.getParameter("id"));
			System.out.println(request.getParameter("pw"));
			
			String user_id = request.getParameter("id");
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60);
			session.setAttribute("user_id", user_id);
			
			response.sendRedirect("b_selectAll.do");
		}
	}

}
