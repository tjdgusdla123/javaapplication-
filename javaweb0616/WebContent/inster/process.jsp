<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1.파라미터 읽기
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String nickname = request.getParameter("nickname");

	
	//2.business logic을 수행하고 결과를 생성
	boolean result = true;
	
	//오늘날짜를 문자열로 만들기
	java.util.Calendar calendar = 
		new java.util.GregorianCalendar();
	java.sql.Date today = 
		new java.sql.Date(calendar.getTimeInMillis());
	String filename = today.toString();
	
	//insert의 경로 가져오기
	String filepath = 
		application.getRealPath("/insert");
	
	String logfile = 
		filepath + "/" + filename + ".txt";
	
	//현재 프로젝트의 insert 디렉토리에 오늘날짜.txt
	//파일에 email, password, nickname을 기록
	java.io.PrintWriter pw = 
		new java.io.PrintWriter(
			new java.io.OutputStreamWriter(
				new java.io.FileOutputStream(
					logfile, true)));
	
	//3.결과를 저장하고 결과 페이지로 이동
%>



