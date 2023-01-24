package com.xworkz.tetra1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=6, urlPatterns="/smart")

public class LaptopServlet extends HttpServlet {
	
	public LaptopServlet() {
System.out.println("created"+this.getClass().getSimpleName());
}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("Running LaptopServlet in server");	
    }
	
}
