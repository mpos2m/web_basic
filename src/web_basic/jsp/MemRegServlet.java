package web_basic.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_03/memReg")
public class MemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service()" + request.getMethod());
//		
//		PrintWriter out = response.getWriter();
//		if(request.getMethod().equals("GET")) {
//			doGet(request, response);
//			
//		}else {
//			doPost(request, response);
//		}
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);

	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		if (request.getMethod().equalsIgnoreCase("GET")) {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			out.println("이름 = " + name);
		} else {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			String phone = request.getParameter("phone");
			String hobby = request.getParameter("hobby");
			out.printf("이름 = %s 주소 = %s 휴대전화 = %s 취미 = %s", name, addr, phone, hobby);
		}
		
	}

}
