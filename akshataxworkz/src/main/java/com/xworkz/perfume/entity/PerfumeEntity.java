package com.xworkz.perfume.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Perfume_table")
public class PerfumeEntity {
	@Id
	@Column(name = "p_id")
	private int id;
	
	@Column(name = "p_company")
	private String company;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name="p_type")
	private String type;
	
	@Column(name="p_cost")
	private int cost;
	
	@Column(name="p_country")
	private String country;

	@Override
	public String toString() {
		return "PerfumeEntity [id=" + id + ", company=" + company + ", name=" + name + ", type=" + type + ", cost="
				+ cost + ", country=" + country + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

		
	

}
