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
//		ap.findFirstTwoBiggest(ap.ar);
//		ap.findFirstTwoSmallest(arr);
//		ap.findOddIndexAddition(arr);
//		ap.findEvenIndexAddition(arr);
//		int ar3[]= {10,20,30,40};
//		ap.copyingReverseOrderArray(ar3);
//		int ar4[]= {10,-20,-5,14,48,-90,6};
//		ap.printNegativeNumberArray(ar4);
//		int negative_count = ap.countOfNegativeNumberArray(ar4);
//		ap.storeNegativeNumberArray(ar4,negative_count);
//		int[] ar5= {10,5,47,96,58,43,54,91,7,31};
//		int oddCount=ap.findOddNumberAnotherArray(ar5);
//		System.out.println(oddCount);
//		ap.copyfindOddNumberAnotherArray(ar5,oddCount);
//		ap.copyfindEvenNumberAnotherArray(ar5, oddCount);
//		ap.printOnlyAdjacentElement();
//		int[] ar6 = {1,2,3,4,5,6,7,8};
//		int oddIndex=ap.findOddIndexAnotherArray(ar6);
//		System.out.println(oddIndex);
//		ap.copyFindOddIndexAnotherArray(ar6, oddIndex);
//		ap.addTwoArray();
//		ap.placingGivenArray();
//		int[] ar= {10,20,30,40};
//		ar=ap.leftTowardMove(ar);
//		System.out.print("Method Return Value of Array : ");
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
//		Second time calling same method
//		ar=ap.leftTowardMove(ar);
//		System.out.print("Moving all elements towards left twice in a given array : ");
//		for(int i=0;i<ar.length;i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//		int[] arra= {50,60,10,20,80};
//		for(int count=1;count<=2;count++)
//		{
//		arra=ap.rightTowardMove(arra);
//		for(int i=0;i<arra.length;i++)
//		{
//			System.out.print(arra[i]+" ");
//		}
//		System.out.println();
//		}
		ap.removeNoArray();
		}
	  
	private void removeNoArray() {
		// TODO Auto-generated method stub
		int[] ar= {10,20,30,40,50,60};
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any one number in above no: ");
		int key =sc.nextInt();
		int index=-1;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==key)
			{
				index=i;
				break;
			}
		}
		for(int j=index;j<ar.length-1;j++)
		{
			ar[j]=ar[j+1];
			index++;
		}
		
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	

	private int[] rightTowardMove(int[] arra1) {
		//  Moving all elements towards right in a given array
		int temp=arra1[arra1.length-1];
//		System.out.println(temp);
		int i=arra1.length-1;
//		System.out.println(i);
		for(;i>0;i--)
		{
			arra1[i]=arra1[(i-1)];
		}
		arra1[i]=temp;
		return arra1;
		
	}
	private int[] leftTowardMove(int[] ar) {
		// Moving all elements towards left in a given array
		
		int temp=ar[0];//Introducing variable temp store the value ar[0] top most left side value
		int i=0;
		System.out.print("Before Swapping: ");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		for(i=0;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		ar[i]=temp;//assign the value of temp value in last index
		System.out.println();
		System.out.print("After Swapping : ");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		return ar;
	}
	private void placingGivenArray() {
		// Placing given number in last index of given array
		int[] ar= {10,20,40};
		int key=30;
		for(int i=0;i<ar.length;i++)
		{
			if(i==ar.length-1)
				ar[i]=key;
			
			System.out.print(ar[i]+" ");
		}
		
	}
	private void addTwoArray() {
		// Addition of two integer array
		int[] a= {10,20,30,40,50,60};
		int[] b= {20,40,60,80,100,10,20,30};
		
		int big=a.length>b.length?a.length:b.length;//find the output array length -4
		int small=a.length<b.length?a.length:b.length;//Find the loop running condition -3
		int[] c = new int[big];
		
		for(int i=0;i<small;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		for(int j=small;j<big;j++)
		{
			if(big==a.length)
			{
			c[j]=a[j];
			System.out.print(c[j]+" ");
			}
			else if(big==b.length)
			{
				c[j]=b[j];
				System.out.print(c[j]+" ");
			}
		}
		
	}
	private void copyFindOddIndexAnotherArray(int[] ar6, int oddIndex) {
		// Copy only the odd indexed number in given array to another array
		int[] arr7=new int[oddIndex];
		for(int i=0;i<ar6.length;i++)
		{
			if(i%2==1)
			{
			System.out.print(ar6[i]+" ");
			}
		}
		
	}
	private int findOddIndexAnotherArray(int[] ar5) {
		// find only the odd indexed number in given array to another array
		int index=0;
		for(int i=0;i<ar5.length;i++)
		{
			if(i%2==1)
			{
			index++;
			}
		}
		
		return index;
		
		
	}
	private void printOnlyAdjacentElement() {
		// Print Only value between adjacent elements in given array
		int[] ar1= {3,8,2,7};
		//O/P
		//3-8 => 3 4 5 6 7 8
		//8-2 => 2 3 4 5 6 7 8 (find small using ternary operator)
		//2-7 => 2 3 4 5 6 7
		
//		Using Ternary Operator find Big and Small
		for(int j=0;j<ar1.length-1;j++)
		{
		int small=ar1[j]<ar1[j+1]?ar1[j]:ar1[j+1];
		int big=ar1[j]>ar1[j+1]?ar1[j]:ar1[j+1];
		
		for(int i=small;i<=big;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
		
		
		
	}
	private void copyfindEvenNumberAnotherArray(int[] ar5, int oddCount) {
		// Copying only odd numbers in a given array to another array
		int[] arr7=new int[oddCount];
		int j=0;
		for(int i=0;i<ar5.length;i++)
		{
			if(ar5[i]%2==0)
			{
				arr7[j]=ar5[i];
				System.out.print(arr7[j]+" ");
				j++;
			}
		}
		
	}
	private void copyfindOddNumberAnotherArray(int[] ar5, int oddCount) {
		// Copying only odd numbers in a given array to another array
		int[] arr6=new int[oddCount];
		int j=0;
		for(int i=0;i<ar5.length;i++)
		{
//			if(ar5[i]%2!=0)//Odd Number
				if(ar5[i]%5==0)
			{
			arr6[j]=ar5[i];
			System.out.print(arr6[j]+" ");
			j++;
			}
		}
		
		
	}
	private int findOddNumberAnotherArray(int[] arr5) {
		// Find only odd or even numbers in a given array to another array
		int count=0;
		for(int i=0;i<arr5.length;i++)
		{
			//if(arr5[i]%2!=0)//Find Odd Number
				if(arr5[i]%2==0)//Find Even Number
				count++;			
		}
		return count;
		
	}
	private void storeNegativeNumberArray(int[] ar4, int negative_count) {
		// Store the Negative Number is another array
		int ar5[]=new int[negative_count];
		int j=0;
		for(int i=0;i<ar4.length;i++)
		{
			if(ar4[i]<0)
			{
				ar5[j]=ar4[i];
				System.out.print(ar5[j]+" ");
				j++;
			}
		}
		
	}
	private int countOfNegativeNumberArray(int[] ar4) {
		// Count of Negative Number in given array and negative no store in another array
		int count=0;
		for(int i=0;i<ar4.length;i++)
		{
			if(ar4[i]<0)
				count++;
		}
//		System.out.print(count);
		
		return count;
		
	}
	private void printNegativeNumberArray(int[] ar4) {
		// Finding the Negative no present in array
		for(int i=0;i<ar4.length;i++)
		{
			if(ar4[i]<0)
				System.out.print(ar4[i]+" ");
		}
		
	}
	private void copyingReverseOrderArray(int[] arr3) {
		// Copying the given array to another array in reverse order
		int[] arr4=new int[arr3.length];
		int j=arr3.length-1;//given array length
		for(int i=0;i<arr3.length;i++)//store the array
		{
			arr4[i]=arr3[j];
			System.out.print(arr4[i]+" ");
			j--;
		}
	}
	private void findEvenIndexAddition(int[] arr2) {
		// Find the addition of Odd Index numbers in given array
		int total=0;
		for(int i=0;i<arr2.length;i+=2)
		{
			total+=arr2[i];
		}
		System.out.println("The Total value of Even Index number is : "+total);
	}
	private void findOddIndexAddition(int[] arr2) {
		// Find the addition of Odd Index numbers in given array
		int total=0;
		for(int i=1;i<arr2.length;i+=2)
		{
			total+=arr2[i];
		}
		System.out.println("The Total value of Odd Index number is : "+total);
	}
	private void findFirstTwoSmallest(int[] arr2) {
		// Find the First two Smallest no. in given array
		int small=Integer.MAX_VALUE;//Assign the small in max value
		int small2=Integer.MAX_VALUE;//Assign the small2 in max value
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]<small)//compare the arr2[i] and small
			{
				small2=small;//move the values from small to small2
				small=arr2[i];//assign the value of small in no
				
			}
			else if(arr2[i]<small2)// Incase no is higher than small . To check small2 and assign the value small2 is no.
				small2=arr2[i];
		}
		System.out.println("The First Smallest Two numbers in given array is "+small+" and "+small2);
		
	}
	private void findFirstTwoBiggest(int[] ar2) {
		// Find the First two biggest no. in given array
		int ar[]= {45,80,10,96,47,36,68,99,50,20};
		int big=Integer.MIN_VALUE;//Assign the big in min value
		int big2=Integer.MIN_VALUE; //Assign the big2 in min value
		for(int i=0;i<ar.length;i++)
		{
			int no=ar[i];
			
			if(no>big)//compare the no and big
			{
				big2=big;//move the values from big to big2
				big=no;//assign the value of big in no
				
			}
			else if(no>big2)// Incase no is lower than big . To check big2 and assign the value big2 is no.
			{
				big2=no;
			}
		}
		System.out.println("The First Biggest Two numbers in given array is "+big+" and "+big2);
		
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
