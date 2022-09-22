class Rsra{
 public static void print(){
 String name = "Akshata";
 String email = "akshatarpujari";
  long mobile = 9036226792L;
  int age = 22;
  String gender="female";
 String address = "Bagalkot";
 String work = "Engineer";
 String shirtSize = "S";
 double pantSize = 38;
 long weight = 45L;
 int height = 5;
  if(name == "Akshata"){
	 System.out.println("My name is " + name);
  }
	  
 if(email == "akshatarpujari"){
	 System.out.println("Email is " + email);
 
}
if(mobile == 9036226792L){
	System.out.println("Mobile number " + mobile);

}
if(age == 22){
	System.out.println("Age is " + age);
	
}
if(address == "Bagalkot"){
	System.out.println("address is " + address);

}
if(name == "Akshata" && email == "akshatarpujari" && mobile == 9036226792L && age == 22 ){
	System.out.println("My name is " + name + "this is my email "+ email + mobile + age );
}
if(gender == "female"){
	System.out.println("gender is " + gender);
	
}
if(work == "Engineer"){
	System.out.println( "work is " + work);
}
if(shirtSize == "S"){
	
	System.out.println( "Shirtsize is " + shirtSize);
}
if(pantSize == 38){
	System.out.println("Pantsize is " + pantSize);
}
if(weight == 45L &&  height == 5){ //&& height == 5
	System.out.println("weight is " + weight + " height is "+ height ); //"height is "+ height
 }
 }

}




