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

@WebServlet({ "/index.html", "/memberinfotbl/*"})
public class Memberinfotblcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //서비스 인스턴스 참조 변수
	private MemberinfotblService memberinfotblService;
    public Memberinfotblcontroller() {
        super();
       
        memberinfotblService = MemberinfotblServiceImpl.sharedInstance();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			System.out.println("UserController-main");
			RequestDispatcher dispatcher = request.getRequestDispatcher("../user/main.jsp");
			dispatcher.forward(request, response);
	
		}else if (command.equals("/memberinfotbl/register")) {
			System.out.println("UserController-/user/register"+"요청");
			RequestDispatcher dispatcher = request.getRequestDispatcher("../user/register.jsp");
			dispatcher.forward(request, response);			
		} 
		else if (command.equals("/memberinfotbl/Membermailcheck")) {
			 System.out.println("UserController요청 도달");
			 memberinfotblService.membermailCheck(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("../user/membermailcheck.jsp");
			dispatcher.forward(request, response);
			System.out.println("UserController요청 끝남");
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	}

