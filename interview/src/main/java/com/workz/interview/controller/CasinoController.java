package com.workz.interview.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workz.interview.dto.CasinoDto;

@Component
@RequestMapping("/casino")
public class CasinoController {
	
	public CasinoController() {
   System.out.println("created" + this.getClass().getSimpleName());
	}
	@PostMapping
	public String onCasino(CasinoDto casinoDto, Model model)
	{
		System.out.println("running onCasino" +casinoDto );
		model.addAttribute("name",casinoDto.getName());
		model.addAttribute("cruise",casinoDto.getCruise());
		model.addAttribute("entryFees",casinoDto.getEntryFee());
		model.addAttribute("freeFood",casinoDto.getFreeFood());
		
		
		return "CasinoSuccess.jsp";
	}

}
