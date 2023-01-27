package com.xworkz.hospitalsrvlt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup=1, urlPatterns="/patient")
public class HospitalServlet extends HttpServlet {
	
	public HospitalServlet() {
System.out.println("created "+this.getClass().getSimpleName());
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
		System.out.println("Running doget in HospitalServlet ");
 
		String name= req.getParameter("name");
		String language= req.getParameter("language");
		String age = req.getParameter("age");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String phonenumber=req.getParameter("phonenumber");
		String blood =req.getParameter("blood");
		String taluk=req.getParameter("taluk");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		String email = req.getParameter("email");
		String date=req.getParameter("date");
		String hight=req.getParameter("hight");
		String weight=req.getParameter("weight");
		String accnumber=req.getParameter("accnumber");
		String pincode=req.getParameter("pincode");
		String address=req.getParameter("address");
		String disease=req.getParameter("disease");
		String qualification=req.getParameter("qualification");
		String job=req.getParameter("job");
		
		System.out.println(name);
		System.out.println(language);
		System.out.println(age);
		System.out.println(dob);
		System.out.println(gender);
		System.out.println(phonenumber);
		System.out.println(blood);
		System.out.println(taluk);
		System.out.println(district);
		System.out.println(state);
		System.out.println(country);
		System.out.println(email);
		System.out.println(date);
		System.out.println(hight);
		System.out.println(weight);
		System.out.println(accnumber);
		System.out.println(pincode);
		System.out.println(address);
		System.out.println(qualification);
		System.out.println(job);
		System.out.println(disease);
		
		PrintWriter writer= resp.getWriter();
		writer.print("Hospital name " + name + " is sent success");
		writer.print("Hospital language " + language + " is sent success");
		writer.print("Hospital age " + age + " is sent success");
		writer.print("Hospital dob " + dob +  " is sent success");
		writer.print("Hospital gender " + gender + " is sent success");
		writer.print("Hospital phonenumber " + phonenumber + " is sent success");
		writer.print("Hospital blood " + blood + " is sent success");
		writer.print("Hospital taluk " + taluk + " is sent success");
		writer.print("Hospital district " + district + " is sent success");
		writer.print("Hospital state " + state + " is sent success");
		writer.print("Hospital country " + country  + " is sent success");
		writer.print("Hospital email " + email + " is sent success");
		writer.print("Hospital date " + date +  " is sent success");
		writer.print("Hospital hight " + hight + " is sent success");
		writer.print("Hospital weight " + weight + " is sent success");
		writer.print("Hospital accnumber " + accnumber + " is sent success");
		writer.print("Hospital pincode " + pincode + " is sent success");
		writer.print("Hospital qualification " + qualification + " is sent success");
		writer.print("Hospital job " + job +" is sent success");
		writer.print("Hospital disease " + disease + " is sent success");

		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		writer.print("text/html");
		
	}
	@Override
	public void destroy() {
System.out.println("running destroy  in Hospital");
	
	}
		

	}
	


