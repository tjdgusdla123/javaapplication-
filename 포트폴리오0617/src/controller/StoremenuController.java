package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.StoremenuService;
import service.StoremenuServiceImpl;


@WebServlet("/Storemenu/*")
public class StoremenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private StoremenuService storemenuService;
    public StoremenuController() {
        super();
        storemenuService = StoremenuServiceImpl.sharedInstance();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
