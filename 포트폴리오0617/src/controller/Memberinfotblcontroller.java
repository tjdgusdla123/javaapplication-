package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberinfotblService;
import service.MemberinfotblServiceImpl;

@WebServlet("/Memberinfotbl/*")
public class Memberinfotblcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    //서비스 인스턴스 참조 변수
	private MemberinfotblService memberinfotblService;
    public Memberinfotblcontroller() {
        super();
       
        memberinfotblService =MemberinfotblServiceImpl.sharedInstance();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
