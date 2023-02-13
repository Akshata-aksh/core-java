package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.service.EggService;



@Controller
@RequestMapping("/")

public class EggController {

	@Autowired
	private EggService eggService;
	
	public EggController() {
System.out.println("created"+ this.getClass().getSimpleName());
}
	
	
	@GetMapping("/egg")
	public String onBekary(EggDto eggDto, Model model) {
		model.addAttribute("bdto", eggDto);
		boolean save = this.eggService.validateAndSave(eggDto);
		System.out.println(save);
		return "Egg"; 
		}
}
