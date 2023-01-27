package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns="/series")
public class WebSeriesServlet extends HttpServlet {
	
	public WebSeriesServlet() {
System.out.println("created "+ this.getClass().getSimpleName());
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget in WebSeriesServlet ");
		
		String name= req.getParameter("name");
		String language= req.getParameter("language");
		String episodes= req.getParameter("episodes");
		String ott= req.getParameter("ott");
		String budget= req.getParameter("budget");
   
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer= resp.getWriter();
		writer.print("WebSeries name"+name+"is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		writer.print("text/html");
		
	}
	@Override
	public void destroy() {
System.out.println("running destroy  in WebSeries");
	
	}
}
