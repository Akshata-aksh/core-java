package com.xworkz.hospital.hospitalapp.constant;

import com.xworkz.hospital.hospitalapp.Hospital;
import com.xworkz.hospital.hospitalapp.Patient;

public class ApolloHospital extends Hospital {
	
	//one to many
	public Patient[] patients;
	int index;
	private String patientAddress;
	private String patientGender;
	
	public ApolloHospital(int size) {
		patients = new Patient[size];
		
	}
	
	public boolean addPatient(Patient patient) {
		System.out.println("inside addPatient method");
		boolean isPatientAdded = false;
		if(patient != null) {
			System.out.println("Patient's details are registered");
		    patients[index++] = patient;
		    isPatientAdded = true;
		    //index++
		}
		return isPatientAdded;
		
	}
	 public void getAllPatients() {
		 System.out.println("List of Patients are: ");
		 for(int i= 0; i<patients.length; i++) {
			 System.out.println(patients[i].getAddress() +" "+ patients[i].getPatientName()+" "+patients[i].getGender()+" "+patients[i].getAge());
		 }
	 }
	 public void getPatientByName(String patientName) {
		 System.out.println("Inside getPatientByName");
		 System.out.println("No of parameters: 1 : patientName(String)");
		 for(int i=0; i<patients.length; i++) {
			 
			 if(patients[i].getPatientName() == patientName)
			 {
				 System.out.println(patients[i].getAddress() +" "+ patients[i].getPatientName()+" "+patients[i].getGender()+" "+patients[i].getAge());
					
				 }
			 else {
				 System.out.println("No patients found");
			 }
			 }
	 }
		 public void getPatientByAge(int patientAge) {
			 System.out.println("Inside getPatientByAge");
			 System.out.println("No of parameters: 1 : patientAge(int)");
			 for(int i=0; i<patients.length; i++) {
				 
				 if(patients[i].getPatientAge() == patientAge)
				 {
					 System.out.println(patients[i].getAddress() +" "+ patients[i].getPatientName()+" "+patients[i].getGender()+" "+patients[i].getAge());
						
					 }
				 else {
					 System.out.println("No patients found");
				 }
				 }
		
	 }
		 public void getPatientByAddress(String patientAddress) {
			 System.out.println("Inside getPatientByAddress");
			 System.out.println("No of parameters: 1 : patientAddress(String)");
			 for(int i=0; i<patients.length; i++) {
				 
				 
		
				if(patients[i].getAddress() == patientAddress)
				 {
					 System.out.println(patients[i].getAddress() +" "+ patients[i].getPatientName()+" "+patients[i].getGender()+" "+patients[i].getAge());
						
					 }
				 else {
					 System.out.println("No patients found");
				 }
				 }
		 }
		 public void getPatientByGender(Gender patientGender) {
			 System.out.println("Inside getPatientByGender");
			 System.out.println("No of parameters: 1 : patientGender(Gender)");
			 for(int i=0; i<patients.length; i++) {
				 
				 
		
				if(patients[i].getGender() == patientGender)
				 {
					 System.out.println(patients[i].getAddress() +" "+ patients[i].getPatientName()+" "+patients[i].getGender()+" "+patients[i].getAge());
						
					 }
				 else {
					 System.out.println("No patients found");
				 }
				 }
		 }
}
//getPatientByAge(int age)
//  getPatientByAddress(String address)
//  getPatientByGender(Gender gender)
//  getGenderByPatientName(String)
