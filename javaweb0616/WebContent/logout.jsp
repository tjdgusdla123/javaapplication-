<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
       <%
       //세션을 초기화
       session.invalidate();
       //메인 페이지로 이동
       response.sendRedirect("index.jsp");
       %>
</body>
</html>