<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리</title>
</head>
<body>
	<!-- jsp 파일에서 서버에 요청하는 경우는 상대 경로를 이용하지 않는 것이 좋습니다.
     css 나 js 의 링크 그리고 이미지 나 동영상 및 사운드의 링크도 동일한 방법으로 설정-->
	<a href="${pageContext.request.contextPath}/user/register">회원가입</a><br/>
	
</body>
</html>


