package com.xworkz.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=2, urlPatterns = "/service")
public class LocationServlet extends HttpServlet {
	
	public LocationServlet() {
    System.out.println("created"+this.getClass().getSimpleName());
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String startPoint=req.getParameter("startPoint");
		String destination=req.getParameter("destination");
		String gender=req.getParameter("gender");

	
	System.out.println(name);
	System.out.println(email);
	System.out.println(startPoint);
	System.out.println(destination);
	System.out.println(gender);
	
	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");

	if(name.length()>3 && email.length()>5 && startPoint.length()>5 && destination.length()>5 && gender.length()> 5) {
		writer.print("<span style='color:green'>");
        writer.print("Sign in successfully");
        writer.print("</span");
		
	}else {
		writer.print("<span style='color:red'>");
		writer.print("failed to sign in");
		writer.print("</span> ");

	}
	writer.print("<h1>");
	writer.print("<a href=\"index.html\">Home page</a>");
	writer.print("<br>");
	writer.print("<a href=\\\"location.html\\\">Sign up for location</a>");
	writer.print("</body>");
	writer.print("</html>");

resp.setContentType("text/html");
	    
	
	
}
	
	
}