package arrayPrograms;

import java.util.Scanner;

public class ArrayBasicPrograms {
//	Arrays are declare Global Variables
	static int[] arr= {77,80,49,48,93};//Static Global Variable
	int[] ar= {10,30,45,50,81,95,100};//Non-Static Global Variable
	public static void main(String[] args) {
		
		ArrayBasicPrograms ap=new ArrayBasicPrograms();
//		ap.printArray(arr);// Passing as array an argument
//		ap.printArrayProblem(arr);
//		ap.printArrayProblem2(arr);
//		ap.printOddNumbersOnArray(arr);
//		ap.printEvenNumberOnArray(arr);
//		ap.printMultiplyOf7(arr);
//		ap.printOddIndex(arr);
//		ap.printEvenIndex(arr);
//		ap.printReverseArray(ap.ar);
//		ap.linearSearchArray(ap.ar);
//		ap.printEvenIndexOddNo(ap.ar);
//		ap.printOddIndexEvenNo(ap.ar);
//		ap.printBiggestNo();
//		ap.printSmallestNo();
//		ap.printBiggestNoIndex();
		ap.find();
		
		}
	private void find() {
		// 
		
	}
	private void printBiggestNoIndex() {
		//Print the Biggest Number with Index
		int[] ar= {56,86,98,56,78};
		int big=Integer.MIN_VALUE;//Find the Max value to assign MinValue
		int ind=0;
		for(int i=0;i<ar.length;i++)
		{
			if(big<ar[i]){//Compare the value
				big=ar[i];// Store the value
				ind=(i);
			}
				
		}
		System.out.println("The Biggest No. Of an array is : "+big+" .The Index or Position of Biggest No is : "+ind);
	}
	
	private void printSmallestNo() {
		// Find the Smallest Number of an Array
		int[] ar= {56,86,98,45,78};
		int small=Integer.MAX_VALUE;//Find the Min value to assign MaxValue
		for(int i=0;i<ar.length;i++)
		{
			if(small>ar[i])//Compare the value
				small=ar[i];// Store the value
		}
		System.out.println("The Biggest No. Of an array is : "+small);
	}
	private void printBiggestNo() {
		// Find the Biggest Number of an Array
		int[] ar= {56,86,98,56,78};
		int big=Integer.MIN_VALUE;//Find the Max value to assign MinValue
		for(int i=0;i<ar.length;i++)
		{
			if(big<ar[i])//Compare the value
				big=ar[i];// Store the value
		}
		System.out.println("The Biggest No. Of an array is : "+big);
		
	}
	private void printOddIndexEvenNo(int[] ar2) {
		// Print odd elements present in even index of an array
		for(int i=0;i<ar2.length;i+=2)
		{
			if(ar2[i]%2!=0)
			{
				System.out.print(ar2[i]+" ");
			}
		}
	}
	private void printEvenIndexOddNo(int[] ar2) {
		// Print even elements present in odd index of an array
		for(int i=1;i<ar2.length;i+=2)
		{
			if(ar2[i]%2==0)
			{
				System.out.print(ar2[i]+" ");
			}
		}
		
	}
	private void linearSearchArray(int[] ar2) {
//		Finding the given value from user present in the array
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int key=sc.nextInt();
		for(int i=0;i<ar2.length;i++)
		{
			if(ar2[i]==key)
			{
				System.out.println("The Given Number is Present.");
				break;
			}
			
		}
		System.out.println("The given number is not present.");
		
		
	}
	private void printEvenIndex(int[] arr2) {
//		Print Odd Index Numbers
		for(int i=0;i<arr2.length;i+=2)
		{
			
			System.out.print(arr2[i]+" ");
		}
	}
	private void printOddIndex(int[] arr3) {
//		Print Odd Index Numbers
		for(int i=1;i<arr3.length;i+=2)
		{
			
			System.out.print(arr3[i]+" ");
		}
		
	}
	private void printMultiplyOf7(int[] arr2) {
		// Print Multiple of 7 present on array
				for(int i=0;i<arr2.length;i++)
				{
					if(arr2[i]%7==0)
						System.out.print(arr2[i]+" ");
				}
		
	}
	private void printEvenNumberOnArray(int[] arr2) {
		// Print even Numbers present on array
				for(int i=0;i<arr2.length;i++)
				{
					if(arr2[i]%2==0)
						System.out.print(arr2[i]+" ");
				}
	}
	private void printOddNumbersOnArray(int[] arr2) {
		// Print Odd Numbers present on array
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2!=0)
				System.out.print(arr2[i]+" ");
		}
		
	}
	private void printArrayProblem2(int[] arr2) {
//		Printing on below range in given number
		int marks=50;
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]>marks)
				System.out.print(arr2[i]+" ");
		}
		
	}
	private void printReverseArray(int[] ar2) {
		// Print reverse number
		
		for(int i=0;i<ar2.length;i++)
		{
		System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=ar2.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
	private void printArrayProblem(int[] arr2) {
//		Printing on above range in given number
		int mark=50;
		for(int i=0;i<arr2.length;i++){
			if(arr2[i]<mark)
				System.out.print(arr2[i]+" ");
		}

	}
	private void printArray(int[] arr2) {
		int total =0;
		float percentage=0;
		for(int i=0;i<arr2.length;i++)
		{
		System.out.print(arr2[i]+" ");// Printing an array
		total+=arr2[i];// Total value of an array
		percentage=total/arr.length;//Find the total value of percentage 
		}
		System.out.println();
		System.out.println("The total value of an array is "+total);
		System.out.println("The total value of an array is "+percentage+"%");
	}

}
