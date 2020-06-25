package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import service.StorebasicinfoService;
import service.StorebasicinfoServiceImpl;


@WebServlet("/Storebasicinfo/*")
public class StorebasicinfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//서비스 인스턴스 참조 변수
	private  StorebasicinfoService  storebasicinfoService;
	
    
    public StorebasicinfoController() {
        super();
        storebasicinfoService = StorebasicinfoServiceImpl.sharedInstance();
       
    }

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
