var loginform = document.getElementById("loginform");

var membermail = document.getElementById("membermail");
var memberpassword = document.getElementById("memberpassword");

var msg = document.getElementById("msg");

loginform
		.addEventListener(
				"submit",
				function(event) {
					msg.innerHTML = '';
					var flag = false;
					if (membermail.value.trim().length < 1) {
						msg.innerHTML = '이메일은 필수 입력입니다.<br/>';
						flag = true;
					} else {
						var membermailRegExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
						if (!membermailRegExp.test(membermail.value.trim())) {
							msg.innerHTML = '잘못된 이메일 형식입니다.<br/>';
							flag = true;
						}
					}
					if (memberpassword.value.trim().length < 1) {
						msg.innerHTML += '비밀번호는 필수 입력입니다.<br/>';
						flag = true;
					}

					if (flag == true) {
						event.preventDefault();
					}
				});
