class Cricket{
public static void main(String args[]){

int rohithHighestScore = 264;
int  sachinHighestScore = 200 ;
int mandanaHighestScore = 135 ;
int ackerrHighestScore = 232;
int bjClarkHighestScore = 229;

int HighestScore[] = { rohithHighestScore, sachinHighestScore, mandanaHighestScore, ackerrHighestScore, bjClarkHighestScore};

// variable returned from array element
int ref4 = HighestScore[4] ;
int ref0 = HighestScore[0] ;
int ref3 = HighestScore[3] ;
int ref2 = HighestScore[2] ;
int ref1 = HighestScore[1] ;




System.out.println("Element at index 4 "+ ref4);
System.out.println("Element at index 0 "+ ref0);
System.out.println("Element at index 3 "+ ref3);
System.out.println("Element at index 2 "+ ref2);
System.out.println("Element at index 1 "+ ref1);

//length is a property of array
System.out.println("The length of highestScore is" + HighestScore.length);

//for loop
for(int index = 0; index < HighestScore.length; index++){
	int ref = HighestScore[index];
	System.out.println("Element at index "+ index+ ref);
}

}
}




// explicit use ref