package chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/JoinForm")
public class JoinFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String blog = request.getParameter("blog");
		String member = request.getParameter("member");
		String stuffs = request.getParameter("stuffs");
		String satis = request.getParameter("satis");
		String subject = request.getParameter("subject");
		String[] mailings = request.getParameterValues("mailings");
		String timestart = request.getParameter("timestart");
		String timeend = request.getParameter("timeend");
		String start = request.getParameter("start");
		String end = request.getParameter("end");
		
		PrintWriter out = response.getWriter();
		if(pass1.equals(pass2)) {
			out.println("<html>");
			out.println("<h2>가입정보</h2>");
			out.printf("아이디 : %s<br>", id);
			out.printf("비밀번호 : %s<br>", pass1);
			out.printf("이름 :%s<br>", name);
			out.printf("이메일 :%s<br>", email);
			out.printf("휴대전화 :%s<br>", phone);
			out.printf("블로그/홈페이지 :%s<br>", blog);
			out.printf("참여인원 %s명, 지원물품 %s개, 희망단계 %s<br>", member, stuffs, satis);
			
			String s = null;
			if(subject.equals("speaking")) {
				s = "회화";
			}else if(subject.equals("grammar")) {
				s = "문법";
			}else {
				s= "작문";
			}
			out.printf("신청과목 : %s <br>", s);
			
			
			out.println(Arrays.toString(mailings));
			out.print("<br>");
			out.printf("시작날짜 : %s 종료날짜 : %s<br>", start,end);
			out.printf("시작시간 : %s 종료시간 : %s<br>", timestart,timeend);
			
			
			out.println("</html>");
		}else if(pass1 != pass2){
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
