<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

<title>회원가입</title>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/register.css">
</head>
<body>
	<form method="post" action="register.jsp" id="registerform" >
		<h2 align ="center">회원가입</h2>
		<div align="center" id="msg"></div>
		<ul>
			<li>
				<label for="membermail">이메일</label> 
				<input type="text" id="membermail" name="membermail" class="textinput" placeholder="이메일 주소를 입력하세요" />
			</li>
			<li>
				<label for="memberpassword">비밀번호</label> 
				<input type="password" id="memberpassword" name="memberpassword" class="textinput" placeholder="비밀번호를 입력하세요"  maxlength="4"/>
			</li>
			<li>
				<label for="memberpassword1">비밀번호확인</label> 
				<input type="password" id="memberpassword1" class="textinput"  placeholder="비밀번호확인" maxlength="4"/>
			</li>

	         <li>
				<label for="userpw1">전화번호</label> 
				<input type="text" id="userpw1" class="textinput" placeholder="전화번호를입력하세요" />
			</li>
			<li>
				<label for="membernickname">닉네임</label> 
				<input type="text" id="membernickname" class="textinput" placeholder="닉네임을입력하세요" />
				<button >중복확인</button><br/>
			</li>
			

						<li class="buttons">
				<input type="submit" value="회원가입" /> 
				<input type="button" value="메인" id="mainbtn" /> 
				<input type="button" value="로그인" id="loginbtn" />
			</li>
		</ul>
	</form>
</body>
<script src="js/register.js"></script>
</html>
			
