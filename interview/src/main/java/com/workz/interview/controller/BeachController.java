package com.workz.interview.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.workz.interview.dto.BeachDto;

@Component
@RequestMapping("/water")
public class BeachController {
    public BeachController() {
    	System.out.println("created" + this.getClass().getSimpleName());
	}
    @PostMapping
    public String happy(BeachDto beachDto, Model model) {
    	System.out.println("running the happy "+beachDto);
    	model.addAttribute("name", beachDto.getName());
    	model.addAttribute("location", beachDto.getLocation());
    	model.addAttribute("clean", beachDto.getClean());
    	model.addAttribute("games", beachDto.getGames());
        return "beachSuccess.jsp";
    	
    }
}
