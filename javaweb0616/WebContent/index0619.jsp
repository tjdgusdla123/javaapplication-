<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JavaWebApplication 1일차</h3>

	<ul>
		<li><a href="datadisplay.jsp">자료구조</a></li>
		<li><a href="declare.jsp">Quick Sort</a></li>
		<li><a href="first.jsp">first.jsp</a></li>
		<li><a href="random.jsp">랜덤한 숫자 생성</a></li>
	</ul>
	
	<h3>JavaWebApplication 2일차</h3>
	<ul>
		<li><a href="inputparameter.html">파라미터 입력</a></li>
		<li><a href="process1.jsp">파라미터 읽기</a></li>
		<li><a href="requestinfo.jsp">클라이언트 정보</a></li>
		<li><a href="process2.jsp">폼의 파라미터 읽기</a></li>
		<li><a href="application.jsp">application 객체</a></li>
		<li><a href="read/process.jsp">process</a></li>
		<li><a href="read/input.jsp">요청 페이지</a></li>
		<li><a href="read/output.jsp">OOP</a></li>
	</ul>
	
	<h3>JavaWebApplication 3일차</h3>

	<ul>
		<li><a href="insert/input.jsp">(1)입력</a></li>
		<li><a href="insert/process.jsp">(2)process비지니스로직수행</a></li>
		<li><a href="insert/output.jsp">(3)결과 출력</a></li>	
		<li><a href="index.jsp">(1)index.jsp 파일을 만들고 로그인 화면 생성</a></li>
			<li><a href="login.jsp">(2)login.jsp 파일에서 로그인을 처리</a></li>
			<li><a href="loginresult.jsp">(3)loginresult.jsp 파일을 생성하고 결과를 출력</a></li>
		<li><a href="loginresult.jsp">(4)logout.jsp 파일을 생성하고 로그아웃 처리를 작성</a></li>	
		
	</ul>
	
	<h3>JavaWebApplication 4일차</h3>

	<ul>
	    <li><a href="test.jsp">(1)test에러메시지출력하면</a></li>
		<li><a href="error/viewerrormessage.jsp">(2)page 별 에러 페이지 지정</a></li>
		<li><a href="error/error404">(3)xml파일에작성한 예외처리</a></li>
	<li><a href="input0618.jsp">(1)EL단순출력</a></li>
	<li><a href="process0618.jsp">(2)EL덧셈비지니스로직수행</a></li>
	<li><a href="output0618.jsp">(3)EL덧셈결과</a></li>
	<li><a href="path.jsp">(1)경로 출력</a></li>
	<li><a href="attriutecreate.jsp">(2)파일을 만들어서 데이터를 생성한후 출력하는 곳으로 포워딩</a></li>
	<li><a href="attributedisplay.jsp">(3)EL을이용한 파일을 출력</a></li>
	<li><a href="jstlcore.jsp">(1)JSTLCore 이용해서 출력</a></li>

	</ul>
		<h3>JavaWebApplication 5일차</h3>
		<ul>
           <li> <a href="${pageContext.request.contextPath}/authentication/main">model2 디렉토리 패턴을 이용한 페이지 이동</a></li>
	    <li> jsp 파일에는 EL 과 JSTL을 이용해서 출력하는 코드만 작성하고 처리 작업은 Servlet 과 Java 클래스를 이용하는 형태로 코딩하는 것을 권장하는데 이 방식을 Model2 라고 합니다.</li>
	</ul>

</body>
</html>