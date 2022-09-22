class Swiggy{
public static double takeOrder(String item){

if(item == "Pizza"){
System.out.println("Thank you for Ordering " + item);
return 99.00;

}
if(item == "Burger")
{
System.out.println("Thank you for Ordering " + item);
return 60.00;
}
if(item == "SouthIndian")
{
System.out.println("Thank you for Ordering " + item);
return 135;
}
if(item == "mosaranna")
{
System.out.println("Thank you for Ordering " + item);
return 25.00;
}
if(item == "Pastries")
{
System.out.println("Thank you for Ordering " + item);
return 50.00;
}
if(item == "Noodles")
{
System.out.println("Thank you for Ordering " + item);
return 90.00;
}


}


return 0.00;




}