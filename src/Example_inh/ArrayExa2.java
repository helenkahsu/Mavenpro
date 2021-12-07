package Example_inh;

import java.util.Scanner;

import interfaceDemo.Interfacedamo.Abstractclass;

public class ArrayExa2 {

	public static void main(String[] args) {
		

	
	System.out.println(getNumbers(10));
	}
	public static int[] getNumbers (int number) {
		Scanner array =new Scanner(System.in);
		System.out.println("enter array value  "+ number );
		int[] value=new int[number];
		for(int i =0;i< number;i++) {
	value[i]= array.nextInt();
	
	}
	for(int i=0;i<number;i++)	{
	System.out.println(value[i]);	
}
	return value;
}
	}