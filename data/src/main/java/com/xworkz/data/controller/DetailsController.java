package com.xworkz.data.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.data.dto.BevarageDTO;
import com.xworkz.data.dto.ChatDTO;
import com.xworkz.data.dto.EducationDTO;
import com.xworkz.data.dto.FamilyDTO;
import com.xworkz.data.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DetailsController {
	
	@GetMapping("/takeEmail")
	public String getEmail(Model model) {
		System.out.println("Running in email");
		model.addAttribute("email", "akshatarpujari@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/takeMobile")
	public String getMobile(Model model) {
		System.out.println("Running in Mobile");
		model.addAttribute("mobile", "9087654321");
		return "index.jsp";
	}

	@GetMapping("/takeAdhar")
	public String getAdhar(Model model) {
		System.out.println("Running in Adhar");
		model.addAttribute("adhar", "54673892819");
		return "index.jsp";
	}

	@GetMapping("/takeAge")
	public String getAge(Model model) {
		System.out.println("Running in Age");
		model.addAttribute("age", "23");
		return "index.jsp";
	}

	@GetMapping("/takeDob")
	public String getDOB(Model model) {
		System.out.println("Running in dateofbirth");
		model.addAttribute("birth", LocalDate.of(2000,8,06));
		return "index.jsp";
	}

	@GetMapping("/takeDS")
	public String getSalary(Model model) {
		System.out.println("Running in salary");
		model.addAttribute("salary", "5LPA");
		return "index.jsp";
	}

	@GetMapping("/takeBestFriendsList")
	public String getBFL(Model model) {
		System.out.println("Running in BestFriendsList");
		List<String> ref = new ArrayList<String>();
		ref.add("Kavya");
		ref.add("Laxmi");
		ref.add("Brunda");
		ref.add("Nishma");
		ref.add("Priya");
		model.addAttribute("bfl", ref);
		return "index.jsp";
	}

	@GetMapping("/takeMVP")
	public String getMVP(Model model) {
		System.out.println("Running in mostvisited place");
		List<String> ref = new ArrayList<String>();
		ref.add("Udupi");
		ref.add("Bagalkot");
		ref.add("Golgumbaz");
		ref.add("Hampi");
		ref.add("Hosapete");
		model.addAttribute("mvp", ref);
		return "index.jsp";
	}

	@GetMapping("/takeSkillSet")
	public String getSkillSet(Model model) {
		System.out.println("Running in Skill SET");
		List<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("HTML");
		ref.add("SQL");
		ref.add("CSS ");
		ref.add("SPRING");
		model.addAttribute("skills", ref);
		return "index.jsp";
	}

	@GetMapping("/takeEdto")
	public String getEducation(Model model) {
		System.out.println("Running in EDucationdto");
		EducationDTO dto = new EducationDTO();
		dto.setSchoolName("Swami Vivekananada primary and high school");
		dto.setDistrict("Bagalkot");
		dto.setHmName("Nandi");
		dto.setNoOfBusses("4");
		dto.setNoOfClasses("30");
		dto.setNoOfStudents("800");
		dto.setNoOfTeachers("30");
		dto.setPlace("Shantinagar");
		dto.setState("Karnataka");
		dto.setTaluk("bagalkot");
		model.addAttribute("edto", dto);
		return "index.jsp";
	}

	@GetMapping("/takeFamily")
	public String getFamily(Model model) {
		System.out.println("Running in familydto");
		FamilyDTO dto = new FamilyDTO();
		dto.setFamilyLives("Bagalkot");
		dto.setFatherName("Raghu");
		dto.setIndian(true);
		dto.setMotherName("Suma");
		dto.setName("Akshata");
		dto.setState("Karnataka");
		dto.setTotalMembers(4);
		dto.setSibling(1);

		model.addAttribute("fdto", dto);
		return "index.jsp";
	}

	@GetMapping("/takeMobileInfo")
	public String getMobileInfo(Model model) {
		System.out.println("Running in mobiledto");
		MobileDTO dto = new MobileDTO();
		dto.setModel("Oppo A3s");
		dto.setCamera(64D);
		dto.setNumber(7585858585l);
		dto.setStorage(128D);
		model.addAttribute("mdto", dto);
		return "index.jsp";
	}
	@GetMapping("/takeBeverage")
	public String getBeverage(Model model) {
		System.out.println("running in beverage ");
		BevarageDTO dto=new BevarageDTO();
		dto.setJuice1("Mango");
		dto.setJuice2("Orange ");
		dto.setJuice3("Apple");
		dto.setJuice4("Sapota");
		dto.setJuice5("Pomogranate");
		dto.setJuice6("Banana");
		dto.setJuice7("Papppaya");
		dto.setJuice8("Grapes");
		model.addAttribute("bdto",dto);
		return "index.jsp";
	}
	@GetMapping("/takeChata")
	public String getChat(Model model) {
		System.out.println("running in chat");
		ChatDTO dto=new ChatDTO();
		dto.setChat1("Shevpuri");
		dto.setChat2("Masalapuri");
		dto.setChat3("Dhai puri");
		dto.setChat4("Samosa");
		dto.setChat5("Bhelpuri");
		dto.setChat6("Kachori");
		dto.setChat7("Noodles");
		dto.setChat8("Pava bhaji");
		dto.setChat9("Masala papada");
		dto.setChat10("Gobhi manchoori");
		dto.setChat11("Samosa");
		model.addAttribute("cdto",dto);
		return "index.jsp";
	}
}