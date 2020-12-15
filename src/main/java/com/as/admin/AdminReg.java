package com.as.admin;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.as.user.LoginProcess;

@WebServlet("/AdminReg")
public class AdminReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  	 PrintWriter out = response.getWriter();
	  	 String email = request.getParameter("email");
	     String pass = request.getParameter("pass");
	     String fname = request.getParameter("fname");
	     String lname = request.getParameter("lname");
	     String age = request.getParameter("age");
	     String  mobile = request.getParameter("mobile");
	     
	     
	     if( pass.trim().isEmpty() || fname.trim().isEmpty() ||  lname.trim().isEmpty() ||  age.trim().isEmpty() || mobile.trim().isEmpty() ) {
	  	   out.println("Fields should not be empty");
	  	   request.getRequestDispatcher("/AdminReg.html").include(request, response);
	  	   }
	     
	     else {
	     LoginProcess.addReg(email, pass, fname, lname, age,mobile);
	      out.println("Reg successfully");
	      RequestDispatcher rd = request.getRequestDispatcher("/admin/aview.html"); //2.doubt - without rd var not wrking
	      rd.include(request, response);
	     }
	
   }
	  
	  
}


