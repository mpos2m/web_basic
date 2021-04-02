package chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/WithLabel")
public class WithLabelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String subject = request.getParameter("subject");
		String[] gubun = request.getParameterValues("gubun");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<h2>수강과목</h2>");
		String t = null;
		
		if(subject.equals("eng")) {
			t = "영어";
		}else if(subject.equals("ch")) {
			t = "중국어";
		}else {
			t="일어";
		}
		out.println(t);
		
		out.println("<h2>수강 분야</h2>");
		
		String[]g = null;
		for(String gubuns :gubun) {
			if(gubuns.equals("grm")) {
				out.println("문법");
			}
			if(gubuns.equals("wr")) {
				out.println("작문");
			}
			if(gubuns.equals("rd")) {
				out.println("독해");
			}
			out.println(g);
		}
		
		out.println("</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
