<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="${pageContext.request.contextPath}/member/js/register.js"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap"rel="stylesheet">
<link rel="stylesheet"href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
	<!-- ajax로 요청하는 경우에는 method가 필요없음 id 만 설정 - 웹 만 할 때는 method를 post로 설정
           입력하는 폼에 파일이 존재하는 경우는 enctype을 설정해야 합니다.설정안하면 파일 업로드 안됨-->

	<form id="registerform">
		<h2 align="center">회원가입</h2>
		<div align="center" id="msg"></div>
		<ul>
			<li><label for="membermail">이메일</label> 
			<input type="text"name="membermail" id="membermail" class="textinput" placeholder="이메일 주소를 입력하세요" />
				<div id="membermailmsg"></div></li>
			
			<li><label for="memberpassword">비밀번호</label> <input
				type="password" name="memberpassword" id="memberpassword"  class="textinput"
				placeholder="비밀번호를 입력하세요" maxlength="4" />
				<div id="memberpasswordmsg"></div></li>

			<li><label for="memberpassword1">비밀번호확인</label> <input
				type="password" name="memberpassword1" id="memberpassword1"  class="textinput"
				placeholder="한번더입력해주세요"  maxlength="4" /><br /></li>
			
			<il> <label for="membernickname">닉네임</label> <input type="text"  class="textinput" placeholder="닉네임을입력하세요"
				name=membernickname id="membernickname" />
			<div id="membernicknamemsg"></div>
			</il>

			 <li>
				<label for="memberphonenumber">전화번호</label>
			<input type="text" name=memberphonenumber id="memberphonenumber" class="textinput" placeholder="전화번호를입력하세요" />
			<div id="mememberphonenumbermsg"></div></li>
           
                	<li class="buttons">
			<input type="button" value="회원가입" id="registerbtn" />
			<input type="button" value="메인으로" id="mainbtn" />
			<input type="button" value="로그인" id="loginbtn" />
			</li>
		</ul>
	</form>
</body>
</html>