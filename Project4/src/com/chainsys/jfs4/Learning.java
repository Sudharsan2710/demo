package com.chainsys.jfs4;
import java.util.*;
public class Learning {

	public static void main(String[] args) {
		//int[] numbers=  change();
		
		//int[] arr= {5,4,3,2,1,0,-1};
	/*	Arrays.sort(arr);
		
		//	for(int i =0;i<arr.length;i++)
				System.out.println(Arrays.binarySearch(arr,4 ));
				System.out.println(Arrays.binarySearch(arr,8 ));
				System.out.println(Arrays.binarySearch(arr,6 ));*/
	//	printArray(numbers);
		
	
	

/*	public static void printArray(int[] numbers) {
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]+" ");
		}
		
	}

/*
 * 	public static void change(int[] numbers) {
		numbers[0]=1;
		numbers[1]=4;
		
	}*/
	//Entered by the user in range 1 to atmost 20
		
		Scanner sc =new Scanner(System.in);
		System.out.print("How many elements?(Max is 20): ");
		int n = sc.nextInt();
		
		while (n>20||n<=0) {
			System.out.println("invalid enter the correct number: ");
			n=sc.nextInt();
		}
		
		int[] numbers = new int[n];
		fillArrayOfIntegers(numbers);
		printArrayOfIntegers(numbers);
		sumOfIntegers(numbers);
		
}

	public static void sumOfIntegers(int[] numbers) {
		int count=0;
		for(int i=0;i<=numbers.length;i++)
			count = count + numbers[i];
		System.out.println("the sum of the numbers"+count );
		
		
	}

	public static void printArrayOfIntegers(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("The elements are: ");
		System.out.println(Arrays.toString(numbers));
		
	}

	public static void fillArrayOfIntegers(int[] numbers) {
		  	Scanner input = new Scanner(System.in);
		  	System.out.print("Enter the numbers: ");
		  	for(int i=0;i< numbers.length;i++)
		  		numbers[i]=input.nextInt();
	}
}
