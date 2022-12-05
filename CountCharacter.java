class CountCharacter{
public static void main(String[] args){
String string = "Hello World";
int count = 0;

System.out.println("The entered string is: " +string.length);
for(int i=0; i<string.length(); i++){
if(string.charAt(i) != ''){
count++;

} 
}
System.out.println("Total number of characters in string: " + count);


}






}