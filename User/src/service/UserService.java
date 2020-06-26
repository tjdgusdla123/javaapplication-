package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//User 에 대한 처리를 하기 위한 메소드 선언을 위한 인터페이스
//메뉴판과 유사한 역할을 수행합니다.
public interface UserService {
	public void emailCheck(
		HttpServletRequest request, 
		HttpServletResponse response);
	public void nicknameCheck(
		HttpServletRequest request, 
		HttpServletResponse response);
	public void register(
			HttpServletRequest request, 
			HttpServletResponse response);
}
