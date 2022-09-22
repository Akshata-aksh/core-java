class Laptop{
static String brand;
static String color;
static double price;
static boolean isconnected;
public static boolean onOrOff() {  // boolean for true or false
System.out.println("Inside onOrOff()");

if(isconnected == false){
	isconnected = true ;
System.out.println("Laptop is turned on..");
	
	
}
else if(isconnected == true){
	isconnected = false ;
	System.out.println("Laptop is turned off...");
}

System.out.println("end of onOrOff()");

return isconnected ;
}
	
	
}
