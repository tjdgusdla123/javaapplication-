<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"">

<title>메인</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <h1 style="text-align: center">안녕하세요</h1>
	<h1 style="text-align: center">스마트 오더입니다.</h1>
	 <ul>
		<a href="${pageContext.request.contextPath}/memberinfotbl/register">회원가입</a><br>
		<c:if test="${result == null}">
		<li><a href="${pageContext.request.contextPath}/memberinfotbl/login">로그인입장</a></li>
		</c:if>
	<c:if test="${result != null}">
		<li><a href="${pageContext.request.contextPath}/memberinfotbl/logout">로그아웃</a></li>
		</c:if>
			<li><a href="${pageContext.request.contextPath}/memberinfotbl/nonmember">비회원입장</a></li>
	</ul>




     
</body>
</html>