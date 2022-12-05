c
lass removeWhiteSpace{
public static void main(String args[]){

String str = "Remove white spaces";

str = str.replaceAll("\\s+","");

System.out.println("String after removing all the white spaces:" +str);

}

}