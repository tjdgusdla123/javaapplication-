package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import dao.MemberinfotblDao;
//User의 요청을 처리할 메소드를 구현할 클래스
public class MemberinfotblServiceImpl implements MemberinfotblService{

	private	MemberinfotblDao memberinfotblDao;
	
	private MemberinfotblServiceImpl() {
		//Dao 인스턴스를 생성
		memberinfotblDao = MemberinfotblDao.sharedInstance();
		
	}
	
	private static MemberinfotblService memberinfotblService;
	
	public static MemberinfotblService sharedInstance() {
		if(memberinfotblService == null) {
			memberinfotblService = new MemberinfotblServiceImpl();
		}
		return memberinfotblService;
	}

	@Override
	public void membermailCheck(HttpServletRequest request, HttpServletResponse response) {
		 System.out.println("UserServiceImpl메일도착 요청 도달");
			// 1.파라미터 읽기
			try {
				request.setCharacterEncoding("utf-8");
			} catch (Exception e) {
				System.out.println("ServiceImpl메일체크:" + e.getMessage());
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
			System.out.println("ServiceImpl메일체크:"+object);
			// request에 저장
			request.setAttribute("result", object);
			System.out.println("ServiceImpl메일체크:"+object);
		}

	@Override
	public void membernicknameCheck(HttpServletRequest request, HttpServletResponse response) {
		 System.out.println("UserServiceImpl-membernicknameCheck 요청 도달");
			// 1.파라미터 읽기
			try {
				request.setCharacterEncoding("utf-8");
			} catch (Exception e) {
				System.out.println("ServiceImpl-membernicknameCheck:" + e.getMessage());
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
			System.out.println("ServiceImpl-membernickname:"+object);
			// request에 저장
			request.setAttribute("result", object);
			System.out.println("ServiceImpl-membernickname:"+object);
		}
	}
		
	
		
	