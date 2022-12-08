package com.xworkz.showrooms;

import java.util.Scanner;

import com.xworkz.showrooms.sr.ShowRoom;

public class ShowRoomTester {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=0;
		System.out.println("enter size");
		int size=s.nextInt();
		ShowRoom sw=new ShowRoom();
		
		while(n<size) {
			Manager man=new Manager();
			System.out.println("enter the manager name");
			man.setName(s.next());
			System.out.println("enter the manager age");
			man.setAge(s.nextInt());
			System.out.println("enter the gender");
			man.setGender(Gender.valueOf(s.next());
			System.out.println("enter the manager address");
			man.setAddress(s.next());
			
			sw.added(man);
			n=n+1;
			
		}
		sw.getManager();
		System.out.println("Enter manager name");
			sw.getManagerByName(s.next());
			
		System.out.println("Enter manager age");
			sw.getManagerByAge(s.nextInt());
		
		System.out.println("Enter manager address");
			sw.getManagerByAddress(s.next());
		
		System.out.println("Enter manager name");
			sw.getManagerByGender(Gender.valueOf(s.next()));
			
			System.out.println("Enter manager name");
			sw.getManagerNameByGender(Gender.valueOf(s.next()));
			
	
			System.out.println("Enter manager name and new address to update the address");
			if(sw.updateAddressByName(s.next(), s.next()){
				System.out.println("Updated the address");
				}
			else {
				System.out.println("Not able to fetch the details");
			}
			System.out.println("Enter manager to delete");
			sw.deleteByName(s.next());
			
			System.out.println("Enter manager to delete");
			sw.deleteByAge(s.nextInt());
			sw.getnewManager();
			
			System.out.println("enter managergender to delete");
			sw.deleteByGender(Gender.valueOf(s.next());
			sw.getManager();
			
	}

}
