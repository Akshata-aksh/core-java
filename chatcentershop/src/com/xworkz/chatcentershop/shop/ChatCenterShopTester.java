package com.xworkz.chatcentershop.shop;


public class ChatCenterShopTester {
public static void main(String args[]) {
		
		String staffName[] = new String[2];
		staffName[0] = "Kiran";
		staffName[1] = "jagan";
		staffName[2] = "dipak";
		
		long staffContactNo[] = new long[2];
		staffContactNo[0] = 9084766655L;
		staffContactNo[1] = 6093876562L;
		staffContactNo[2] = 9038366266L;
		
		String menu[] = new String[2];
		menu[0] = "Bhelpuri";
		menu[1] = "shevpuri";
		menu[2] = "panipuri";
		
		String billingMethod[] = new String[2];
		billingMethod[0] = "Kiran";
		billingMethod[1] = "jagan";
		billingMethod[2] = "dipak";
		
		
		
		ChatCenterShop chat =new ChatCenterShop("Shree","FTHS453637","Rajajinagar",staffName,staffContactNo,menu,billingMethod);
		chat.toGetFood();
		
		
		
		}

}



