package com.xworkz.fooditem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fooditem.dto.InterviewDto;

@Component
@RequestMapping("/attend")
public class InterviewComponent {
   public InterviewComponent() {
	// TODO Auto-generated constructor stub

	System.out.println("created"+this.getClass().getSimpleName());
}
@PostMapping
public String onAttend(InterviewDto dto) {
	System.out.println("Running onAnttend");
	System.out.println("Dto is"+dto);
	return "interview.jsp";
}
}