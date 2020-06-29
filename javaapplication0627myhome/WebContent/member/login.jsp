<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script src="${pageContext.request.contextPath}/member/login.js"></script>
<script src="${pageContext.request.contextPath}/member/login.css"></script>

<script>

</script>
</head>
<body>
<!--  action: 처리할 서버의 url method:전송방식(get,post) enctype:file이 존재하는 경우만 multipart/form-data
최근에는 조회를 제외하고 action을 설정하지 않고 method는 post로 설정해서 get 과post로 구분 -->
<form method="post">
       닉네임:<input type="text" id="membernickname" neme="membernickname"/><br/>
       비밀번호:<input type="memberpassword" neme="memberpasswor"/><br/>
       <!-- 하나의 서버로 여러 디바이스 요청을 처리하는 rest api 서버를 이용하는 경우에는 submit 대신에
       button을 만들어서 버튼을 누르면ajax로 요청을 처리 bootstrap같은 자바스크립트 라이브러리를 이용하게 되면
       button을 만들면 자동으로 submit을 만드는 경우가 있습니다. 그런 경우에는 버튼을 form 외부에 생성 -->
       <input type ="button" value="로그인" id="loginbtn"/>
       <input type ="button" value="회원가입" id="registerbtn"/>
       <input type ="button" value="메인" id="mainbtn"/>
       
</form>

</body>
</html>