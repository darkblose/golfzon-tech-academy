package test.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet({"/jq13_temp.do","/jq16_temp.do"})
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet....");

		String sPath = request.getServletPath();
		System.out.println(sPath);
		
		if(sPath.equals("/jq13_temp.do")) {
			System.out.println(request.getParameter("num"));
			
			String txt = "<h2>jQuery and AJAX is FUN!!!</h2>\r\n"
					+ "<p id=\"p1\">This is some text in a paragraph.</p>";
			response.getWriter().append(txt);
		}else if(sPath.equals("/jq16_temp.do")) {
			System.out.println(request.getParameter("num"));
			
			String txt = "{\"name\":\"kim\",\"age\":33}";
			response.getWriter().append(txt);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost....");
		doGet(request, response);
	}

}
