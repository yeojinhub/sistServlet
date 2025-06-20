<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%
	// session 존재하는 값 얻기
	String name = (String)session.getAttribute("name");

	if(name == null){
		// sessionㅓ에 값이 없다면 페이지 이동
		response.sendRedirect("http://192.168.10.85/jsp_prj/day0501/use_session_a.jsp");
		// early return 꼭 써줘야함
		return;
	} // end if
%>