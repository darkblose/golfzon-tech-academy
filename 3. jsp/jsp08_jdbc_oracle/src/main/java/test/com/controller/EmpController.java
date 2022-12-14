package test.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import test.com.model.EmpDAO;
import test.com.model.EmpDAOimpl;
import test.com.model.EmpVO;

/**
 * Servlet implementation class EmpController
 */
@WebServlet({"/e_selectAll.do","/e_selectAll_join.do"
	,"/e_insert.do","/e_insertOK.do",
	"/json_dept_id.do","/json_job_id.do"})
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpDAO dao = new EmpDAOimpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpController() {
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
		
		if(sPath.equals("/e_selectAll.do")) {
			
			List<EmpVO> vos = dao.selectAll();
			System.out.println("vos.size():"+vos.size());
			
			request.setAttribute("vos", vos);
			
			request.getRequestDispatcher("emp/selectAll.jsp")
								.forward(request, response);
		}else if(sPath.equals("/e_selectAll_join.do")) {
			
			List<EmpVO> vos = dao.selectAll_join();
			System.out.println("vos.size():"+vos.size());
			
			request.setAttribute("vos", vos);
			
			request.getRequestDispatcher("emp/selectAll_join.jsp")
								.forward(request, response);
		}else if(sPath.equals("/e_insert.do")) {
			
			request.getRequestDispatcher("emp/insert.jsp")
								.forward(request, response);
		}else if(sPath.equals("/e_insertOK.do")) {
			
			String fname = request.getParameter("first_name");
			String lname = request.getParameter("last_name");
			String sal = request.getParameter("salary");
			String job = request.getParameter("job_id");
			String dept = request.getParameter("department_id");
			
			EmpVO vo = new EmpVO();
			vo.setFirst_name(fname);
			vo.setLast_name(lname);
			vo.setSalary(Integer.parseInt(sal));
			vo.setJob_id(job);
			vo.setDepartment_id(dept);
			
			int result = dao.insert(vo);	
			if(result==1)
				response.sendRedirect("e_selectAll.do");
			else 
				response.sendRedirect("e_insert.do");
		}else if(sPath.equals("/json_dept_id.do")) {
			
			List<Integer> dept_ids = dao.selectDeptID();
			System.out.println(dept_ids);
			
			PrintWriter out = response.getWriter();
			out.print(dept_ids.toString());

		}else if(sPath.equals("/json_job_id.do")) {
			
			List<String> job_ids = dao.selectJobID();
			System.out.println(job_ids);
//			String txt = "[";
//			for (int i=0;i<job_ids.size();i++) {
//				txt += "\""+job_ids.get(i)+"\"";
//				if(i<job_ids.size()-1)txt += ",";
//			}
//			txt += "]";
			
			//simple-json.jar ?????????????????????
			JSONArray arr = new JSONArray();
			arr.addAll(job_ids);
			PrintWriter out = response.getWriter();
			out.print(arr);
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
