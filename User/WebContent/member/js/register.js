//스크립트 링크가 body 위에 있다면 window의 load 이벤트 안에 작성
window.addEventListener('load', function(event){
	//id를 가지고 필요한 객체들을 찾아오기
	var registerform = document.getElementById("registerform");
	var msg = document.getElementById("msg");
	var email = document.getElementById("email");
	var emailmsg = document.getElementById("emailmsg");
	
	var password = document.getElementById("password");
	var password1 = document.getElementById("password1");
	var passwordmsg = document.getElementById("passwordmsg");
	
	var nickname = document.getElementById("nickname");
	var nicknamemsg = document.getElementById("nicknamemsg");
	
	var image = document.getElementById("image");
	var registerbtn = document.getElementById("registerbtn");
	var mainbtn = document.getElementById("mainbtn");
	var loginbtn = document.getElementById("loginbtn");
	
	//mainbtn을 클릭하면 메인 화면으로 이동
	mainbtn.addEventListener("click", function(event){
		location.href = "../";
	});
	
	//loginbtn을 클릭하면 login 으로 이동하도록 작성
	loginbtn.addEventListener("click", function(event){
		location.href = "login";
	});
	
	//email 중복검사 통과 여부를 저장할 변수
	var emailcheck = false;
	
	//email을 작성하고 포커스가 떠나면 중복검사를 수행
	email.addEventListener("focusout", function(event){
		if(email.value.trim().length == 0){
			emailmsg.innerHTML = "이메일을 입력하고 넘어가세요!!";
			emailmsg.style.color = 'red';
			//검사하지 않도록 리턴
			return;
		}
		//ajax 요청 객체를 생성
		var request = new XMLHttpRequest();
		//요청 생성
		request.open('get', 
			'emailcheck' + '?' + 'email=' + email.value, true);
		//요청을 전송
		request.send('');
		//결과를 받기 위한 부분 생성
		request.addEventListener('load', function(event){
			//결과를 파싱
			var data = JSON.parse(event.target.responseText);
			if(data.result == true){
				emailmsg.innerHTML = "사용 가능한 이메일";
				emailmsg.style.color = "blue";
				//email 중복 검사를 통과했다고 표시
				emailcheck = true;
			}else{
				emailmsg.innerHTML = "사용 중 인 이메일";
				emailmsg.style.color = "red";
				//email 중복 검사를 통과 못했다고 표시
				emailcheck = false;
			}
		})
	});
	
	//닉네임 중복 검사 통과여부를 저장할 변수
	var nicknamecheck = false;
	
	//닉네임을 작성하고 포커스를 옮길 때
	nickname.addEventListener(
			"focusout", function(event){
		//입력한 내용이 없을 때는 검사하지 않음
		if(nickname.value.trim().length < 1){
			nicknamemsg.innerHTML = "닉네임을 입력하세요";
			nicknamemsg.style.color = 'red';
			nicknamecheck = false;
			return;
		}
		
		var request = new XMLHttpRequest();
		request.open('get',
			'nicknamecheck?nickname='+nickname.value,
			true);
		request.send('');
		//데이터를 가져왔을 때 호출될 메소드를 설정
		request.addEventListener(
			'load', function(event){
			var data = 
				JSON.parse(event.target.responseText);
			if(data.result == true){
				//메시지 출력
				nicknamemsg.innerHTML = '사용 가능한 별명';
				nicknamemsg.style.color = 'green';
				//표시
				nicknamecheck = true;
				
			}else{
				//메시지 출력
				nicknamemsg.innerHTML = '이미 사용 중 인  별명';
				nicknamemsg.style.color = 'red';
				//표시
				nicknamecheck = false;
			}
		});
		
	});
	
	//회원가입 버튼을 누르면
	registerbtn.addEventListener('click', function(event){
		//폼의 데이터를 전송할 때는 유효성 검사를 해주어야 합니다.
		//필수 항목 검사, 형식에 맞는지, 값의 제한이 있는 경우 그 값인지 등
		if(email.value.trim().length < 1){
			emailmsg.innerHTML = "이메일은 필수 항목";
			emailmsg.style.color = "red";
			return;
		}
		//형식 검사 - 정규식을 이용
		var emailRegExp = 
			/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		if(emailRegExp.test(email.value) == false){
			emailmsg.innerHTML = "이메일 형식에 맞지 않습니다.";
			emailmsg.style.color = "red";
			return;
		}
		
		if(emailcheck == false){
			emailmsg.innerHTML = "이미 가입된 이메일입니다.";
			emailmsg.style.color = "red";
			return;
		}
		if(nicknamecheck == false){
			nicknamemsg.innerHTML = "사용 중인 닉네임입니다.";
			nicknamemsg.style.color = "red";
			return;
		}
		
		//ajax 요청
		var request = new XMLHttpRequest();
		request.open('post', 'register', true);
		//폼의 데이터 생성
		var formData = new FormData(registerform)
		//폼의 데이터를 전송
		request.send(formData);
		//데이터를 전송하고 결과를 받아왔을 때 
		request.addEventListener('load', function(event){
			//alert(event.target.responseText);
			
			//JSON 파싱 - 결과를 사용하기 위해서
			var data = 
				JSON.parse(event.target.responseText);
			if(data.result == true){
				//메인으로 이동
				location.href = "../";
			}
		})
	});
	
});



