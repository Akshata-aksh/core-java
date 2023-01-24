package com.xworkz.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1, urlPatterns="/call")
public class Chair extends HttpServlet{
	
	public Chair() {

	System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("get from chair");
    String data="displaying doGet method";
    PrintWriter writer = resp.getWriter();
    writer.print(data);
    resp.setContentType("text/plain");
    
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("post from chair");
    String data="displaying doPost method";
    PrintWriter writer = resp.getWriter();
    writer.print(data);
    resp.setContentType("text/plain");
    
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("delete from chair");
    String data="displaying doDelete method";
    PrintWriter write = resp.getWriter();
    write.print(data);
    resp.setContentType("text/plain");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("put from chair");
	String data = "displaying doPut method";
	PrintWriter write = resp.getWriter();
    write.print(data);
    resp.setContentType("text/plain");
	
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from chair");
		String data = "displaying doHead method";
		PrintWriter write = resp.getWriter();
	    write.print(data);
	    resp.setContentType("text/plain");		
	
	}

	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from chair");
		String data = "displaying doOptions method";
		PrintWriter write = resp.getWriter();
	    write.print(data);
	    resp.setContentType("text/plain");		
	
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from chair");
		String data = "displaying doTrace method";
		PrintWriter write = resp.getWriter();
	    write.print(data);
	    resp.setContentType("text/plain");		
	
	}

	
}
