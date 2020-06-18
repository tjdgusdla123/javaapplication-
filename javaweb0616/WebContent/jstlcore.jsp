<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- jstl core 기능 사용을 위한 라이브러리 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 변수 생성 -->
<c:set var="score" value="87" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Core</title>
</head>
<body>
	<!-- score 라는 속성 출력 -->
	점수:${score}
	<br />

	<c:set var="id" value="ggangpae1" />
	<!-- id 가 있으면 로그아웃 없으면 로그인을 출력 -->
	<c:if test="${id == null}">
		로그인
	</c:if>
	<c:if test="${id != null}">
		${id} 로그아웃
	</c:if>

	<!-- 위와 동일한 처리를 c:choose로 처리 -->
	<c:choose>
		<c:when test="${id == null}">
			로그인
		</c:when>
		<c:otherwise>
			로그아웃
		</c:otherwise>
	</c:choose>

	<br /> 수량:
	<select name="count">
		<c:forEach begin="1" end="10" var="num">
			<option value="${num}">${num}</option>
		</c:forEach>
	</select>

	<%
		String[] ar = { "Call By Value", "Call By Reference" };
		request.setAttribute("ar", ar);
	%>

	<br />
	<select name="variablepassing">
		<c:forEach var="item" items="${ar}">
			<option value="${item}">${item}</option>
		</c:forEach>
	</select>

	<%@ page import="java.util.*"%>
	<%
		Map<String, Object> map1 = new HashMap<>();
		map1.put("team", "KIA");
		map1.put("player", "양현종");

		Map<String, Object> map2 = new HashMap<>();
		map2.put("team", "OB");
		map2.put("player", "권혁");

		List<Map<String, Object>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);

		request.setAttribute("list", list);
	%>

	<table border="1">
		<tr>
			<th>팀</th>
			<th>선수</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td>${item.team}</td>
				<td>${item.player}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>



