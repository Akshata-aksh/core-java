class SwiggyTester{

public static void main(String a[]){

Swiggy.takeOrder("Pizza");
Swiggy.takeOrder("Pizza", 99);

Swiggy.takeOrder("Burger");
Swiggy.takeOrder("Burger", 60);

Swiggy.takeOrder("SouthIndian");
Swiggy.takeOrder("SouthIndian", 135);

Swiggy.takeOrder("mosaranna");
Swiggy.takeOrder("mosaranna", 25);

Swiggy.takeOrder("Pastries");
Swiggy.takeOrder("Pastries", 50);

Swiggy.takeOrder("Noodles");
Swiggy.takeOrder("Noodles", 90);

System.out.println("Your order is ready");
}

}