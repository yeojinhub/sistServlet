package day0424;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 1. HttpServlet 을 상속.(내가 만든 클래스가 웹서비스 할 수 있음)
 */
@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {
	
	@Override
	public void init() {
		System.out.println("초기화 method");
	} //init
	
	@Override
	public void destroy() {
		System.out.println("객체가 죽었음");
	} //destroy
	
	/**
	 * 2. 요청 방식(GET,POST)을 처리할 수 있는 method를 Override
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request+" / "+response);
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
		out.println("<script type='text/javascript'>");
		out.println("function call(){");
		out.println("alert(name+'님 안녕하세요?');");
		out.println("} //call");
		out.println("</script>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>Hello Servlet</strong>");
		
		String name="이여진";
		out.print("<marquee scrollalmount='10'>");
		out.print(name);
		out.println("님 안녕하세요?</marquee>");
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		out.print("<div>오늘은");
		out.print(sdf.format(new Date()));
		out.println("입니다.</div>");
		out.print("<input type='button' value='클릭' onclick='call(\"");
		out.print(name);
		out.println("\")'/>");
		out.println("</body>");
		out.println("</html>");
	} //doGet

} //class
