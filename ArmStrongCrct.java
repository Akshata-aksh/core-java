

class ArmStrongCrct{

public static void main(String a[]){

int n = 370;

int temp, total=0;

int r = n;

while(n!=0){
	 temp=n%10;
	total += (temp*temp*temp);
	n=n/10;
}
System.out.println(total);

if(total == r){
System.out.println("Its an ArmStrong number");
}
else{
System.out.println("Not an ArmStrong number");


}


}

}