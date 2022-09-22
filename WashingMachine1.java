class WashingMachine1{

static String brand;
static String color;
static double price;
static boolean isconnected;
public static boolean onOrOff() {  // boolean for true or false
System.out.println("Inside onOrOff()");

if(isconnected == false){
	isconnected = true ;
System.out.println("WashingMachine1 is turned on..");
	
	
}
else if(isconnected == true){
	isconnected = false ;
	System.out.println("WashingMachine1 is turned off...");
}

System.out.println("end of onOrOff()");

return isconnected ;
}
	
	
}
	




