package com.xworkz.jsp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1, urlPatterns = "/msg")
public class FavPersonServlet extends HttpServlet {
	
	public FavPersonServlet() {
System.out.println("creted constructor"+ this.getClass().getSimpleName());
	
	}
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Running dopost in Mesageservlet ");

String fName =req.getParameter("fName");
String lName =req.getParameter("lName");
String gender =req.getParameter("gender");
String reason =req.getParameter("reason");
String address =req.getParameter("address");

 
System.out.println(fName);
System.out.println(lName);
System.out.println(gender);
System.out.println(reason);
System.out.println(address);

       RequestDispatcher dispatcher= req.getRequestDispatcher("display.jsp");
       req.setAttribute("fName", fName);
       req.setAttribute("lName", lName);
       req.setAttribute("gender", gender);
       req.setAttribute("reason", reason);
       req.setAttribute("adress", address);
//       String temp="Favourite person ";
//       System.out.println("Dispaying in jsp"+temp);
//       req.setAttribute("person", temp);
       dispatcher.forward(req, resp);
 }
 
}
