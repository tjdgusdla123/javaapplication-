<%@page import="domain.Memberinfotbl"%>
<%@page import="dao.MemberinfotblDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>

<title>ToDoList</title>

</head>
<!-- 문서의 구조를 만드는 것이 HTML -->
<body>
             
		<%
//dao.MemberinfotblDao memberinfotblDao = MemberinfotblDao.sharedInstance();
//Memberinfotbl memberinfotbl = new Memberinfotbl();
//memberinfotbl.setMembermail("dkxkgh98@naver.con");
//memberinfotbl.setMemberpassword("123456");
//dao.MemberinfotblDao memberinfotblDao =dao.MemberinfotblDao.sharedInstance();
//System.out.println(memberinfotblDao.MembermailCheck("dsa"));

%>


		<jsp:forward page="memberinfotbl/main"></jsp:forward>
	
</body>
</html>
