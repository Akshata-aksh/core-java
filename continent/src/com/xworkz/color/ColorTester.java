package com.xworkz.color;

public class ColorTester {
	public static void main(String[] args) {
		
		Color color = new Color();
		color.toMakeColor("Black");
		System.out.println(color.name);
		
		White white = new White();
		white.toMakeColor("pink");
		System.out.println(white.name);
	}

}
