package com.xworkz.perfume.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.perfume.dto.PerfumeDto;
import com.xworkz.perfume.service.PerfumeService;

@Controller
@RequestMapping("/")
public class PerfumeController {
	
	@Autowired
	private PerfumeService service;
	
	private List<String> types=Arrays.asList("Eau de Cologne","Eau de toilette","Eau de Parfum","Eau Fraiche","Perfume Mist");
	private List<String> countries=Arrays.asList("India","Japan","Russia","China","Africa");

	public PerfumeController() {
System.out.println("created"+this.getClass().getSimpleName());	
}
	@GetMapping("/perfume")
	public String onPerfume(Model model) {
		System.out.println("running onPerfume get method");
		model.addAttribute("types", types);
		model.addAttribute("countries", countries);
		
		return "Perfume";
	}
	@GetMapping("/perfumesearch")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running onSearch in get method" + id);
		PerfumeDto dto=this.service.findById(id);
		if(dto != null) {
			model.addAttribute("dto", dto);	
		}
		else {
			model.addAttribute("message", "Data not found");
		}
		return "PerfumeSearch";
		
	}
	@PostMapping("/perfume")
	public String onPerfume(PerfumeDto dto, Model model) {
		System.out.println("Running onPerfume on post method"+dto);
		Set<ConstraintViolation<PerfumeDto>> violations=service.validateAndSave(dto);
		if(violations.isEmpty()) {
			 System.out.println("No violations in controller go to success page"+dto);
        return "Perfume";
		}
		model.addAttribute("types", types);
		model.addAttribute("error", violations);
		model.addAttribute("countries", countries);
		model.addAttribute("dto", dto);
		System.out.println("Violations in controller");
		return "Perfume";
	}
}
