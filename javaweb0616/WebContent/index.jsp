<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션과 쿠기</title>
</head>
<body>
   <%
   //쿠키를 전부 가져오기
   Cookie [] cookies = request.getCookies();
   
   //id와 idsave 체크를 위한 변수
   String id = "";
   String idsave = "";
   
   //쿠기가 존재하는 경우에만
   if(cookies != null){
	   //모든 쿠키를 순회
	   for(Cookie cookie : cookies){
		   //쿠키 확인
		   if(cookie.getName().equals("id")){
			   id =cookie.getValue();
			   idsave= "checked";
			   break;
		   }
	   }
   }
   %>
        <%
               //세션에 nickname 값을 가져와서 변수에 저장
               //세션에 저장된 상태가 아니면 null
        String nickname = (String)session.getAttribute("nickname");
           
        %>
         <% if(nickname==null){%>
	<form action="login.jsp" method="post">
		아이디<input type="text" name="id" value='<%=id %>' required="required" size="40" /><br />
		
		비밀번호<input type="password" name="pw" required="required" size="40" /><br />
		
		<input type="checkbox" name="idsave" value="save"<%=idsave %> />아이디 저장 <br />
		
		<input type="submit" value="로그인" /><br />
	</form>
           
           <%}else{ %>
           <%=nickname%>님 환영합니다.<br/>
           <a href="logout.jsp">로그아웃</a>
           <%} %>
</body>
</html>