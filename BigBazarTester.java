class BigBazarTester{

public static void main(String args[]){

BigBazar baz = new BigBazar();
baz.name = "Kasat";
baz.manager = "Arp";
baz.workers = 20;

System.out.print(baz.name+"\n"+baz.manager+"\n"+baz.workers);

BigBazar ref = baz ;
System.out.println(ref.name+ "\n"+ ref.manager+"\n"+ ref.workers);

}

}