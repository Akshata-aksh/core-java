class LowerUpper{
public static void main(String args[]){
String input = "GOD IS GREAT";
System.out.println("Lower case string is: "+ input);
char strArr[] = input.toCharArray();
for(int i=0; i<strArr.length; i++){
if(strArr[i] >= 'A' && strArr[i] <= 'Z'){
  strArr[i] =(char) ((int) strArr[i]+32);

}
}
System.out.println("Upper case string is: ");
for(int i=0; i<strArr.length; i++){
System.out.println(strArr[i]);
}
String input1 = "god is great";
System.out.println("Lower case string is: "+ input1);
char strArr1[] = input1.toCharArray();
for(int j=0; j<strArr1.length; j++){
if(strArr1[j] >= 'a' && strArr1[j] <= 'z'){
  strArr1[j] =(char) ((int) strArr1[j]-32);

}
}
System.out.println("Upper case string is: ");
for(int j=0; j<strArr1.length; j++){
System.out.println(strArr1[j]);
}

}

}
