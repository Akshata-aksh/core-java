package com.xworkz.perfume.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PerfumeDto {
	
	private int id;
	
	@Size(min = 3, max = 20, message = "Company must be more than 3 and less than 20")
	private String company;

	@Size(min = 3, max = 20, message = "Company must be more than 3 and less than 20")
	private String name;

	private int cost;

	@NotEmpty(message = "Type must be selected")
	private String type;

	@NotEmpty(message = "Country must be selected")
	private String country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PerfumeDto [id=" + id + ", company=" + company + ", name=" + name + ", cost=" + cost + ", type="
				+ type + ", country=" + country + "]";
	}

}

	


