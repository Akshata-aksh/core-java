class Torch{
static String brand;
static String color;
static double price;
static boolean isconnected;

public static boolean onOrOff(){
System.out.println("Inside onOrOff");

if(isconnected == false){
   isconnected = true;
System.out.println("Torch is on");   
	
}
 
 else if(isconnected == true){
	 
	 isconnected = false ;
	System.out.println("Torch is off"); 
	 
 }

return isconnected;

}
public static void increaseVolume();
  System.out.println("inside increaseVolume ()");
	 if(isconnected == true){
	 if(currentVolume < maxVolume){
		 currentVolume = currentVolume + 1 ;
	System.out.println("The currentVolume is " + currentVolume);
	 }
	 
	 else {
		 System.out.println("Max volume reached");
	 }
	 
	 }
	 
	 else { 
	      System.out.println("First Torch on madu");
	 }
	 
	 System.out.println("end of increaseVolume ()");
	 
	
}	
	
public static void decreaseVolume(){
System.out.println("start decreaseVolume()");
if(isconnected == true){
if(currentVolume > minVolume){
currentVolume = currentVolume - 1 ;
	System.out.println("The currentVolume is " + currentVolume);
	 }
else {
System.out.println("Min volume is reached");

}
}
else {
System.out.println("First Torch on madu");

}
System.out.println("end of decreaseVolume()");
}
}






