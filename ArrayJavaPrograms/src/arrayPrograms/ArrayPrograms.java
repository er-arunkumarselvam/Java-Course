package arrayPrograms;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		ArrayPrograms ap=new ArrayPrograms();
//		ap.find_first_repeated_element_array();
//		ap.sum_2_elements();
//		int[] ar= {10,5,2,7,1,20,4,6};
//		int i=0;
//		for(i=0;i<ar.length;i++)
//		{
//		ap.multiple_2_elements(ar,i);
//		}
//		ap.firstNonRepeatedElements();
//		ap.divideAllTheElement();
		ap.primeNumber();
		

	}

	private void primeNumber() {
		// Check if any elements in an array of Prime Number
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no: ");
		int no=sc.nextInt();
		int[] ar=new int[no];
		int i=0;
		int j=0;
		int div=2;
		for(;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		for(;j<ar.length;j++) {
			if(ar[j]%div==0) {
				System.out.println(ar[j]+" --> not prime");
			}
			div++;
		}
		for(;i<ar.length;i++)
		{
		if(ar[j]==div)
		{
			System.out.println("The prime number is "+ar[j]);
		}
		}
		
	}

	private void divideAllTheElement() {
		// Divide the all the elements in an array by 3 and store it in the same array
		int[] ar= {45,36,10,20,93,66,45,57};
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=ar[i]/3;
			System.out.print(ar[i]+" ");
		}
		
	}

	private void firstNonRepeatedElements() {
		// First Non-Repeated Elements in given array
		String name="arunkumar";
		char[] ch=name.toCharArray();
		
		for(int i=0;i<ch.length-1;i++)
		{
			char character=ch[i];
			int count=1;// initial count begins 1
			for(int j=i+1;j<ch.length;j++)
			{
				if(character ==ch[j])
				{
					count++;
					break;
				}
				
			}
			if(count==1) {
				System.out.println("First Non Repeated Elements in Array is "+character);
				break;
			}
		}
		
	}

	private void multiple_2_elements(int[] ar, int i) {
		// Multiply any 2 elements in an array and if check it corresponds to 20
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]*ar[j]==20)
			{
				System.out.println(ar[i]+" "+ar[j]);
			}
		}
		
	}

	private void sum_2_elements() {
		// sum of 2 elements in a single array corresponding to 10.
		
		int[] ar={0,10,3,5,8,5,8};

		for(int i=0;i<ar.length;i++)
		{
		for(int j=i+1;j<ar.length;j++)
		{
		if(ar[i]+ar[j]==10)
		{
		System.out.println(ar[i]+" "+ar[j]);
		}
		}
		}
		
	}

	private void find_first_repeated_element_array() {
		// Find the first repeated element in an array
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		char[] check=name.toCharArray();	
		boolean repeat=false;//Check the repeat element
		for(int j=0;j<check.length-1;j++)
		{
		char key=check[j];
		for(int i=j+1;i<check.length;i++)
		{
			if(key==check[i])
			{
				System.out.println("First repeated element is "+check[i]);
				repeat=true;
				break;
			}
			
		}
		if(repeat==true)// already check the elements to break the above for loop
		{
			break;
		}
		}
		
		
	}

}
