package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;

@WebServlet({ "/index.html", "/user/*" })
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;

	public UserController() {
		super();
		userService = UserServiceImpl.sharedInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());

		String method = request.getMethod();

		// 요청을 맞게 작성했는지 확인
		// 완성되면 주석 처리
		System.out.println("요청 주소:" + command);

		if (command.equals("/index.html")) {
			response.sendRedirect("./");
		}
		// 단순 페이지 이동은 포워딩
		else if (command.equals("/user/main")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/main.jsp");
			dispatcher.forward(request, response);
		} else if (command.equals("/user/register")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/register.jsp");
			dispatcher.forward(request, response);
		
		} else if (command.equals("/user/emailcheck")) {
			 System.out.println("요청 도달");
			userService.emailCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/emailcheck.jsp");
			dispatcher.forward(request, response);
			System.out.println("요청 끝남");
	
		} else if (command.equals("/user/nicknamecheck")) {
			userService.nicknameCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../member/nicknamecheck.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
