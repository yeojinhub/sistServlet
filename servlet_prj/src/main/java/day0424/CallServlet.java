package day0424;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CallServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 3. 응답 방식 설정(MIME-type 설정: web.xml 참조)
		response.setContentType("text/html; charset=UTF-8");
		
		// 4. 출력 스트림 얻기
		PrintWriter out = response.getWriter();
		
		// 5. 접속자에게 제공할 내용을 작성
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>타이틀</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>Get방식의 요청에 대한 응답</strong><br>");
		out.println("<a href='javascript:history.back()'>뒤로</a><br>");
		out.println("</body>");
		out.println("</html>");
		
	} //doGet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 3. 응답 방식 설정(MIME-type 설정: web.xml 참조)
		response.setContentType("text/html; charset=UTF-8");
		
		// 4. 출력 스트림 얻기
		PrintWriter out = response.getWriter();
		
		// 5. 접속자에게 제공할 내용을 작성
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>타이틀</title>");
		out.println("<meta charset='UTF-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>Get방식의 요청에 대한 응답</strong><br>");
		out.println("<a href='javascript:history.back()'>뒤로</a><br>");
		out.println("</body>");
		out.println("</html>");
	} //doPost

} //class
