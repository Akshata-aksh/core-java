class LargestElementArray{
public static void main(String args[]){
  int arr[]=new int[] {85,24,555,23};
  int max=arr[0];
  for(int i=1; i<arr.length; i++){
    if(arr[i]>max){
		max=arr[i];
		
	}
  }
   System.out.println("Largest Element in an Array" + max);
}


}