class Speakerr{
static String brand;
static String color;
static double price;
static boolean isconnected;
static int maxVolume = 9 ;
static int minVolume ;
static int currentVolume ;
public static boolean onOrOff(){
System.out.println("Inside onOrOff()");

if(isconnected == false){
 isconnected = true;
 System.out.println("Speakerr is on");

}
 else if(isconnected == true){
      isconnected = false;
	  System.out.println("Speakerr is off");
 
 }

 return isconnected ;

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