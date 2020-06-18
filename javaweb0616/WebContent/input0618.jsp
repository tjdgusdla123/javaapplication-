<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>덧셈</title>
<style>

</style>
<script>
          //스크립트 사용시 위에 작성하면 스크립트는 위에서부터 읽어내려가기 때문에 밑에있는 것들을 사용할 수 없다.
          //그래서 로드를 꼭하고 해야한다.아래사용시 로드하지 않고 그냥 사용가능하다.
         window.addEventListener("load",function(event){
	//스크립트 내용
	
	//폼의 유효성 검사
	var num1 = document.getElementById("num1")
	var num2 = document.getElementById("num2")
	var myform = document.getElementById("myform")
	
	//myform의 데이터를 전송할려고 할 때
	myform.addEventListener("submit", function(event){
			//데이터 의 유효성 검사를 수행
			//유효성 검사에 실패하면 - 
			//event.preventDefalut() 를 호출하면
			//form의 데이터가 전송되지 않음
	});
});
</script>
</head>
<body> 
<form action="process0618.jsp" method="get" id="myform">

   숫자1:<input type="text" id="num1" name="num1"/> <br/>
  
   숫자2:<input type="text" id="num2" name="num2"/> <br/>
   
   <input type="submit" value="전송"/>


</form>

</body>
</html>