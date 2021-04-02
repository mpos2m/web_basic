package chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/FormTag")
public class FormTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String pass =request.getParameter("pass");
		String color = request.getParameter("color");
		String subject = request.getParameter("subject");
		String menu = request.getParameter("menu");
		String notice = request.getParameter("notice");
		String text = notice.replace("\r\n", "<br>");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<h2>수강 신청정보</h2>");
		out.printf("아이디 : %s<br>", id);
		out.printf("비밀번호 : %s<br>", pass);
		out.printf("선택한 색상 : %s<br>", color);
		
		if(subject.equals("archi")) {
			subject = "건축공학과" + "(" + subject + ")";
		}
		if(subject.equals("mechanic")) {
			subject = "기계공학과" + "(" + subject + ")";
		}
		if(subject.equals("indust")) {
			subject = "산업공학과" + "(" + subject + ")";
		}
		if(subject.equals("elec")) {
			subject = "전기전자공학과" + "(" + subject + ")";
		}
		if(subject.equals("computer")) {
			subject = "컴퓨터공학과" + "(" + subject + ")";
		}
		if(subject.equals("chemicel")) {
			subject = "화학공학과" + "(" + subject + ")";
		}
		out.printf("선택한 학과 : %s<br>", subject);
		
		if(menu.equals("grammar")) {
			menu = "문법" + "(" + menu + ")";
		}
		if(menu.equals("voca")) {
			menu = "어휘" + "(" + menu + ")";
		}
		if(menu.equals("speaking")) {
			menu = "회화" + "(" + menu + ")";
		}
		if(menu.equals("listening")) {
			menu = "리스닝" + "(" + menu + ")";
		}
		if(menu.equals("news")) {
			menu = "뉴스청취" + "(" + menu + ")";
		}
		out.printf("수강과목 : %s<br>" , menu);
		
		out.printf("메모 %s<br>", text);
		
		
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
