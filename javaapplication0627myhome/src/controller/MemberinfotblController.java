package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberinfotblService;
import service.MemberinfotblServiceImpl;

@WebServlet({ "/index.html", "/memberinfotbl/*" })
public class MemberinfotblController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 서비스 인스턴스 참조 변수
	private MemberinfotblService memberinfotblService;

	public MemberinfotblController() {
		super();

		memberinfotblService = MemberinfotblServiceImpl.sharedInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		String command = requestURI.substring(contextPath.length());

		String method = request.getMethod();
		// 요청을 맞게 작성했는지 확인
		// 완성되면 주석 처리
		System.out.println("UserController요청도달" + command);

		if (command.equals("/index.html")) {
			response.sendRedirect("./");
		}
		// 단순 페이지 이동은 포워딩
		else if (command.equals("/memberinfotbl/main")) {
			System.out.println("UserController-main" + command);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/main.jsp");
			dispatcher.forward(request, response);

		} else if (command.equals("/memberinfotbl/register") && method.equals("GET")) {
			System.out.println("UserController-register" + command);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/register.jsp");
			dispatcher.forward(request, response);

		} else if (command.equals("/memberinfotbl/register") && method.equals("POST")) {
			System.out.println("UserController-register" + command);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/registerresult.jsp");
			dispatcher.forward(request, response);

		} else if (command.equals("/memberinfotbl/Membermailcheck")) {
			System.out.println("UserController-Membermailcheck요청 도달" + command);
			memberinfotblService.membermailCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/membermailcheck.jsp");
			dispatcher.forward(request, response);

		} else if (command.equals("/memberinfotbl/Membernicknamecheck")) {
			System.out.println("UserController-Membermailcheck요청 도달" + command);
			memberinfotblService.membermailCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/membernicknamecheck.jsp");
			dispatcher.forward(request, response);

		} else if (command.equals("/memberinfotbl/login") && method.equals("GET")) {
			System.out.println("UserController-login요청 도착" + command);
			memberinfotblService.membermailCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/login.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/user/login") && method.equals("POST")) {
			System.out.println("UserController-loginresult요청 도착" + command);
			// 로그인 처리를 위한 서비스 메소드 호출
			memberinfotblService.login(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/loginresult.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
