package com.xworkz.chatcenter.center;

public class ChatCenter {
	public String name;
	public String gstNo;
	public String address;
	public String staffName[];
	public long staffContactNo[];
	public String menu[];
	public String billingMethod[];
	
	public ChatCenter(String name,String gstNo,String address,String staffName[],long staffContactNo[], String menu[], String billingMethod[]  ) {
		System.out.println("Welcome" );
		this.name=name;
		this.gstNo=gstNo;
		this.address=address;
		this.staffName=staffName;
		this.staffContactNo=staffContactNo;
		this.menu=menu;
		this.billingMethod=billingMethod;
				}
	public void toGetFood() {
		System.out.println("List of chats");
		

	System.out.println("Chatcenter staff info");
	for(int i=0; i<staffName.length; i++) {
		
		System.out.println(staffName[i]);
		
	}
	System.out.println("ChatCenter staff contact no info");
	
	for(int i=0; i<staffContactNo.length; i++) {
		System.out.println(staffContactNo[i]);
	}
System.out.println("ChatCenter menu info");
	
	for(int i=0; i<menu.length; i++) {
		System.out.println(menu[i]);
	}
System.out.println("ChatCenter staff contact no info");
	
	for(int i=0; i<staffContactNo.length; i++) {
		System.out.println(staffContactNo[i]);
	}
System.out.println("ChatCenter staff contact no info");
	
	for(int i=0; i<billingMethod.length; i++) {
		System.out.println(billingMethod[i]);
	}

}
}