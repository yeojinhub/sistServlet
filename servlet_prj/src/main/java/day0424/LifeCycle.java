package day0424;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@SuppressWarnings("serial")
public class LifeCycle extends HttpServlet {
	
	@Override
	public void init() {
		System.out.println("init, 최초 접속자에 의해 한번만 호출 : 생성자의 코드작성");
	} //init
	
	@Override
	public void destroy() {
		System.out.println("destroy, WAS가 정상종료되어 Servlet 소멸될 때 가장 마지막에 호출");
	} //destroy
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println
		("doGet, doPost, service 모든 접속자에 의해 여러번 호출"
		+request.getRemoteAddr());
	} //doGet

} //class
