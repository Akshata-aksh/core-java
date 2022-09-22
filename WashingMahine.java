class Speaker1{

static String brand;
static String color;
static double price;
static boolean isconnected;
static int minVolume ;
static int maxVolume = 8 ;
static int currentVolume ;
// functionlity

public static boolean onOrOff(){
System.out.println("Inside onOrOff()")	;
	
if(isconnected == false ){
  isconnected = true ;
System.out.println("Speaker1 is turned on");
	}
	
else if(isconnected == true){
 isconnected = false ;
System.out.println("Speaker1 is turned off");
}
 return isconnected ;
}
 public static void increaseVolume(){
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
	      System.out.println("First Speaker1 on madu");
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
System.out.println("First Speakerr on madu");

}
System.out.println("end of decreaseVolume()");
}

}