var mainbtn = document.getElementById("mainbtn");
var loginbtn = document.getElementById("loginbtn");

var registerform = document.getElementById("registerform");

var membermail = document.getElementById("membermail");
var memberpassword = document.getElementById("memberpassword");
var memberpassword1 = document.getElementById("memberpassword1");
var membernickname = document.getElementById("membernickname");
var msg = document.getElementById("msg");



function readURL(input) {
	if (input.files && input.files[0]) {
		var filename = input.files[0].name;

		var reader = new FileReader();

		reader.addEventListener("load", function(e) {
			document.getElementById('img').src = e.target.result;
		});

		reader.readAsDataURL(input.files[0]);
	}
}

/* 버튼을 눌렀을 때 다른 곳으로 이동 */
mainbtn.addEventListener("click", function(event) {
	location.href = "../index.jsp";
});

loginbtn.addEventListener("click", function(event) {
	location.href = "login.jsp";
});

/* 폼의 데이터를 전송할 때 데이터 유효성 검사 */
registerform
		.addEventListener(
				"submit",
				function(event) {
					msg.innerHTML = '';
					var flag = false;
					if (membermail.value.trim().length < 1) {
						msg.innerHTML = '이메일은 필수 입력입니다.<br/>';
						flag = true;
					} else {
						//정규식을 이용한 유효성 검사
						//정규식은 문자열의 패턴을 만드는 객체
						var membermailRegExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
						if (!membermailRegExp.test(membermail.value.trim())) {
							msg.innerHTML = '잘못된 이메일 형식입니다.<br/>';
							flag = true;
						}
					}

					if (memberpassword.value.trim().length < 1) {
						msg.innerHTML += '비밀번호는 필수 입력입니다.<br/>';
						flag = true;
					} else {
						var pwRegExp = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=]).*$/;
						if (pwRegExp.test(memberpassword.value.trim())) {
							msg.innerHTML = '비밀번호는 숫자와 영문 대소문자 그리고 특수문자가 포함되어야 합니다.<br/>';
							
							flag = true;
						} else {
							if (memberpassword.value.trim() !== memberpassword1.value.trim()) {
								msg.innerHTML += '2개의 비밀번호는 같아야 합니다.<br/>';
								flag = true;
							}
						}
					}

					if (membernickname.value.trim().length < 1) {
						msg.innerHTML += '별명은 필수 입력입니다.<br/>';
						flag = true;
					} else {
						var membernicknameRegExp = /^[a-zA-z가-힣0-9]{2,5}$/;
						if (!membernicknameRegExp.test(membernickname.value.trim())) {
							msg.innerHTML = '닉네임은 영문 한글 숫자로 2자 이상 5자 이하이어야 합니다.<br/>';
							flag = true;
						}
					}
					if (flag == true) {
						event.preventDefault();
					}
				});
