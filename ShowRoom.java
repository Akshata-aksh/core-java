package com.xworkz.showrooms.sr;


public class ShowRoom {

int index;
Manager[] managers;
Manager newManagers[];


public boolean addManager(Manager manager) {
	System.out.println("inside add manager method");
	boolean isManagerAdded = false;
	if(manager != null) {
	
	    managers[index++] = manager;
	    isManagerAdded = true;
	    //index++
	}
	return isManagerAdded;
	
}
 public void getManager() {
	 System.out.println("List of managerss are: ");
	 for(int i= 0; i<managers.length; i++) {
		 System.out.println(managers[i].getAddress() +" "+managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());
	 }
 }
 public void getManagerByName(String name) {
	 System.out.println("Inside getManagerByName");
	 System.out.println("No of parameters: 1 : managerName(String)");
	 for(int i=0; i<managers.length; i++) {
		 
		 if(managers[i].getName() == name)
		 {
			 System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());
				
			 }
		 else {
			 System.out.println("No managers found");
		 }
		 }
 }
	 public void getManagerByAge(int age) {
		 System.out.println("Inside getManagerByAge");
		 System.out.println("No of parameters: 1 : ManagerAge(int)");
		 for(int i=0; i<managers.length; i++) {
			 
			 if(managers[i].getAge() == age)
			 {
				 System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());
					
				 }
			 else {
				 System.out.println("No managers found");
			 }
			 }
	
 }
	 public void getManagerByAddress(String address) {
		 System.out.println("Inside getManagerByAddress");
		 System.out.println("No of parameters: 1 : managerAddress(String)");
		 for(int i=0; i<managers.length; i++) {
			 
			 
	
			if(managers[i].getAddress() == address)
			 {
				System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());	
				 }
			 else {
				 System.out.println("No managers found");
			 }
			 }
	 }
	 public void getManagerByGender(Gender gender) {
		 System.out.println("Inside getManagerByGender");
		 System.out.println("No of parameters: 1 : managerGender(Gender)");
		 for(int i=0; i<managers.length; i++) {
			 
			 
	
			if(managers[i].getGender() == gender)
			 {
				System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());	
				 }
			 else {
				 System.out.println("No managers found");
			 }
			 
}
	 }
	 public void getManagerNameByGender(Gender gender) {
		 System.out.println("Inside getManagerNameByGender");
		 System.out.println("No of parameters: 1 : managerGender(Gender)");
		 for(int i=0; i<managers.length; i++) {
			 
			 
	
			if(managers[i].getGender() == gender)
			 {
				System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());	
				 }
			 else {
				 System.out.println("No managers found");
			 }
			 
}
	 }
	 	 public boolean updateAddressByName(String name, String newAddress) {
boolean isUpdate = false;
System.out.println("inside updateAddressByName");
System.out.println("No of parameters: 2:1 ) param managerName(String) 2) param managerName(String)");

for(int i=0; i<managers.length; i++) {
	if(managers[i].getName().equals(name)) {
	
		managers[i].setAddress(newAddress);
		isUpdate = true;
		
	}
}
	 } 
public boolean updateNameByAge(String name, int Age) {
	boolean isUpdate=false;
	System.out.println("Inside updatePatientNameByAge");
	System.out.println("No of parameters: 2:1 ) xyz patientName(String) 2) xyz patientName(String)");
	
	for(int i=0; i<managers.length; i++) {
		if(managers[i].getPatientName() == name) {
			
			managers[i].setAge(newAge);
			isUpdate=true;
	}
}

return isUpdate;

}
public boolean deleteByName(String Name) {
boolean isDeleted = false;
newManagers = new Manager[managers.length-1];

for(int i=0; k=0; i<managers.length; i++) {
	if(managers[i].getName() == name) {
		newManager[k++] =managers[i];
		isDeleted = true;
	}
}


	return isDeleted;
}
public boolean deleteByAge(String age) {
boolean isDeleted = false;
newManagers = new Manager[managers.length-1)];

for(int i=0; k=0; i<managers.length; i++) {
	if(managers[i].getName() != age) {
		newManager[k++] =managers[i];
		isDeleted = true;
	}
}


	return isDeleted;
}

 public void getNewManager() {
	 System.out.println("List of managers are: ");
	 for(int i= 0; i<managers.length; i++) {
		 System.out.println(managers[i].getAddress() +" "+ managers[i].getName()+" "+managers[i].getGender()+" "+managers[i].getAge());
	 }
 }


}
	 
