package com.xworkz.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1, urlPatterns = "/conc")
public class ContactServlet extends HttpServlet {
	
	public ContactServlet() {
	    System.out.println("created"+this.getClass().getSimpleName());

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comments=req.getParameter("comments");

	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobile);
	System.out.println(comments);
	
	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1>");

	if(name.length()>3 && email.length()>5 && mobile.length()>5 && comments.length()>5 ) {
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
	writer.print("<a href=\"contact.html\">Sign up for contact</a>");
	writer.print("</body>");
	writer.print("</html>");

resp.setContentType("text/html");
	    
	
	
}


}
