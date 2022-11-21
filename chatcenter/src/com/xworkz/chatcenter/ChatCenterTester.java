package com.xworkz.chatcenter;
import com.xworkz.chatcenter.center.ChatCenter;

public class ChatCenterTester {
	public static void main(String args[]) {
		
		String staffName[] = new String[3];
		staffName[0] = "Kiran";
		staffName[1] = "jagan";
		staffName[2] = "dipak";
		
		long staffContactNo[] = new long[3];
		staffContactNo[0] = 9084766655L;
		staffContactNo[1] = 6093876562L;
		staffContactNo[2] = 9038366266L;
		
		String menu[] = new String[3];
		menu[0] = "Bhelpuri";
		menu[1] = "shevpuri";
		menu[2] = "panipuri";
		
		String billingMethod[] = new String[3];
		billingMethod[0] = "Kiran";
		billingMethod[1] = "jagan";
		billingMethod[2] = "dipak";
		
		
		
		ChatCenter chat =new ChatCenter("Shree","FTHS453637","Rajajinagar",staffName,staffContactNo,menu,billingMethod);
		chat.toGetFood();
		
		
		
		}

}
