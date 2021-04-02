package chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/Order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
				
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String text = request.getParameter("text");
		String[] coffee = request.getParameterValues("coffee");
		String amount1 = request.getParameter("amount1");
		String amount2 = request.getParameter("amount2");
		String amount3 = request.getParameter("amount3");
		
		out.print("<html>");
		out.print("<h2>개인정보</h2><br>");
		out.printf("이름 : %s<br>", name);
		out.printf("연락처 : %s<br>", tel);
		out.print("<h2>배송지 정보</h2><br>");
		out.printf("주소 : %s<br>", address);
		out.printf("전화번호 : %s<br>", phone);
		out.printf("메모 : %s<br>", text);
		out.print("<h2>주문정보</h2><br>");
		
		for(String test : coffee) {
			if(test.equals("1")) {
				out.printf("괴테말라 안티구아(100g) = %s개<br>", amount1);
			}
			if(test.equals("2")) {
				out.printf("인도네시아 만델링(100g) = %s개<br>", amount2);
			}
			if(test.equals("3")) {
				out.printf("탐라는도다(블렌딩)(100g) = %s개<br>", amount3);
			}
		}
		
		
		
		out.print("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
