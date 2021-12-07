package Example_inh;

import java.util.Scanner;

public class ArrayExa {

	public static void main(String[] args) {
		Scanner arry=new Scanner(System.in);
		System.out.println("enter the numbers in an array");
	int [] numbers= new int[10];
	//numbers[0]=10;
	//numbers[5]=20;
  // System.out.println("the first number is:"+ numbers[0] +"the second number is :" + numbers[6]);
   for(int i=0; i<numbers.length;i++) {
	   numbers[i]=arry.nextInt()+10;
	  
   }
   for (int i=0;i<numbers.length;i++) {
	   System.out.println(i+ "number is :" + numbers[i]);
	   
   }
	}

}
 