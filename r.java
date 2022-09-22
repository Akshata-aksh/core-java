class R{
static String brand;
static String color;
static double price;
static boolean isconnected;

public static boolean onOrOff(){
System.out.println("Inside onOrOff");
	
if(isconnected == false){
	isconnected = true;
	System.out.println("speaker is on");
	
}
else if(isconnected == true){
	isconnected = false;
	System.out.println("speaker is off");
	
}
return isconnected ;
}

}
