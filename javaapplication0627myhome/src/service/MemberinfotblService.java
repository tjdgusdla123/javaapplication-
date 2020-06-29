package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//memberinfotbl 에 대한 처리를 하기 위한 메소드 선언을 위한 인터페이스 메뉴판과 유사한 역할을 수행합니다.

public interface MemberinfotblService {
	
	    // email 중복 검사를 위한 메소드
		public void membermailCheck(HttpServletRequest request, HttpServletResponse response);

		// nickname 중복 검사를 위한 메소드
		public void membernicknameCheck(HttpServletRequest request, HttpServletResponse response);

		// 회원가입을 위한 메소드
		public void register(HttpServletRequest request, HttpServletResponse response);

		// 로그인을 위한 메소드
		public void login(HttpServletRequest request, HttpServletResponse response);
	
	}