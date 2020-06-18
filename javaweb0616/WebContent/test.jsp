<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 에러가 발생한 경우 보여질 페이지 설정 -->
    <%@ page errorPage="/error/viewerrormessage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외처리</title>
</head>
<body>
         name : <%=request.getParameter("name").toUpperCase() %>
</body>
</html>