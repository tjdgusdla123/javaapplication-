package service;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.json.JSONObject;
import org.mindrot.jbcrypt.BCrypt;

import dao.MemberinfotblDao;
import domain.Memberinfotbl;

//User의 요청을 처리할 메소드를 구현할 클래스
public class MemberinfotblServiceImpl implements MemberinfotblService {

	private MemberinfotblDao memberinfotblDao;

	private MemberinfotblServiceImpl() {
		// Dao 인스턴스를 생성
		memberinfotblDao = MemberinfotblDao.sharedInstance();

	}

	private static MemberinfotblService memberinfotblService;

	public static MemberinfotblService sharedInstance() {
		if (memberinfotblService == null) {
			memberinfotblService = new MemberinfotblServiceImpl();
		}
		return memberinfotblService;
	}

	@Override
	public void membermailCheck(HttpServletRequest request, HttpServletResponse response) {
		// System.out.println("서비스까지 요청 도달");
		// 1.파라미터 읽기
		try {
			request.setCharacterEncoding("utf-8");
		} catch (Exception e) {
			System.out.println("Servic-emembermailCheck:" + e.getMessage());
			e.printStackTrace();
		}
		String membermail = request.getParameter("membermail");
		// 2.별도의 작업을 수행해야 하면 처리
		// 암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		// 업무처리에 필요한 알고리즘

		// 3.DAO 작업이 필요하면 호출할 DAO 메소드의 매개변수를 생성

		// 4.DAO의 메소드를 호출해서 결과를 변수에 저장
		boolean result = memberinfotblDao.membermailCheck(membermail);

		// 5.단순 웹 페이지를 위한 서버의 경우는 결과들을 request 나
		// session에 저장
		// REST API 서버의 경우는 JSONObject 클래스의 객체를
		// 만들어서 저장한 후 request에 저장합니다.
		// 웹 페이지를 위한 로그인의 경우에만 session에 저장하던지
		// 데이터베이스에 로그인 여부를 저장해 놓습니다.
		JSONObject object = new JSONObject();
		object.put("result", result);

		// request에 저장
		request.setAttribute("result", object);
	}

	@Override
	public void membernicknameCheck(HttpServletRequest request, HttpServletResponse response) {
		// 1.파라미터 읽기
		try {
			request.setCharacterEncoding("utf-8");
		} catch (Exception e) {
			System.out.println("Service-membernicknameCheck:" + e.getMessage());
			e.printStackTrace();
		}
		String membernickname = request.getParameter("membernickname");
		// 2.별도의 작업을 수행해야 하면 처리
		// 암호화, 파일 업로드, 파라미터를 다른 자료형으로 변환
		// 업무처리에 필요한 알고리즘

		// 3.DAO 작업이 필요하면 호출할 DAO 메소드의 매개변수를 생성

		// 4.DAO의 메소드를 호출해서 결과를 변수에 저장
		boolean result = memberinfotblDao.membernicknameCheck(membernickname);

		// 5.단순 웹 페이지를 위한 서버의 경우는 결과들을 request 나
		// session에 저장
		// REST API 서버의 경우는 JSONObject 클래스의 객체를
		// 만들어서 저장한 후 request에 저장합니다.
		// 웹 페이지를 위한 로그인의 경우에만 session에 저장하던지
		// 데이터베이스에 로그인 여부를 저장해 놓습니다.
		JSONObject object = new JSONObject();
		object.put("result", result);

		// request에 저장
		request.setAttribute("result", object);

		// 기억해야 할 것은 파라미터 이름(nickname)
		// 결과를 저장할 때 사용한 속성이름과 데이터
		// request 나 session에 저장한 이름

	}

	@Override
	public void register(HttpServletRequest request, HttpServletResponse response) {

		try {
			// 파라미터 읽기
			// 파라미터 이름이 register.jsp 파일에 있는 form 안에 있는
			// 요소들의 name 과 일치
			request.setCharacterEncoding("utf-8");
			String membermail = request.getParameter("membermail");
			String memberpassword = request.getParameter("memberpassword");
			String membernickname = request.getParameter("membernickname");
			// 파일은 Part로 읽어냅니다.
			Part part = request.getPart("image");
			// 파일명 가져오기
			// content-disposition 이라는 헤더의 값 이용
			String contentDisposition = part.getHeader("content-disposition");
			// form-data;image;"파일명" 의 형태의 문자열에서
			// 파일명만 가져오기

			// ;으로 분리
			String[] splitStr = contentDisposition.split(";");
			// 첫번째 " 와 마지막 "의 위치를 찾음
			int first = splitStr[2].indexOf("\"");
			int last = splitStr[2].lastIndexOf("\"");
			// 위치를 가지고 부분 문자열을 가져오기
			String uploadFileName = splitStr[2].substring(first + 1, last);

			String image = null;
			// 위의 파일명에 내용이 없으면 파일을 선택하지 않은 것입니다.
			if (uploadFileName != null && uploadFileName.length() != 0) {
				// 확장자 추출하기
				String[] imsi = uploadFileName.split("\\.");
				String ext = imsi[imsi.length - 1];

				// 새로운 파일명 만들기
				image = UUID.randomUUID() + "." + ext;
				// 파일 업로드
				File f = new File("C:\\Users\\30410\\upload" + image);
				part.write(image);
			}

			// DAO 파라미터 만들기
			Memberinfotbl memberinfotbl = new Memberinfotbl();
			memberinfotbl.setMembermail(membermail);
			// user.setPassword(password);
			// 암호화 해서 저장
			memberinfotbl.setMemberpassword(BCrypt.hashpw(memberpassword, BCrypt.gensalt()));
			memberinfotbl.setMembernickname(membernickname);
			

			
			// Dao 메소드 호출
			int result = memberinfotblDao.register(memberinfotbl);

			// 결과를 저장
			JSONObject object = new JSONObject();
			if (result > 0) {
				object.put("result", true);
			} else {
				object.put("result", false);
			}

			request.setAttribute("result", object);

		} catch (Exception e) {
			System.out.println("service:" + e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public void login(HttpServletRequest request, HttpServletResponse response) {
		// 1.파라미터 읽기
		try {
			request.setCharacterEncoding("utf-8");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		String membermail = request.getParameter("membermail");
		String memberpassword = request.getParameter("memberpassword");
		 System.out.println("membermail:" + membermail);
		 System.out.println("memberpassword:" + memberpassword);

		// 2.필요한 처리

		// 3.DAO 메소드를 호출해야 하면 DAO 메소드의 매개변수를 생성

		// 4.DAO 메소드를 호출해서 결과를 저장
		Memberinfotbl memberinfotbl = memberinfotblDao.login(membermail);
		// 5.결과를 가지고 필요한 처리를 수행
		if (memberinfotbl != null) {
			// 비밀번호 확인
			if (BCrypt.checkpw(memberpassword, memberinfotbl.getMemberpassword())) {
				// 비밀번호가 일치하는 경우 - 비밀번호는 삭제
				memberinfotbl.setMemberpassword(null);
			} else {
				// 비밀번호가 틀린 경우 user == null
				memberinfotbl = null;
			}
		}

		JSONObject object = new JSONObject();
		if (memberinfotbl != null) {
			object.put("membermail", memberinfotbl.getMembermail());
			object.put("membernickname", memberinfotbl.getMembernickname());

		} else {
			object = null;
		}
		// 6.요청 처리 결과를 저장
		request.getSession().setAttribute("result", object);
	}

	

	}

