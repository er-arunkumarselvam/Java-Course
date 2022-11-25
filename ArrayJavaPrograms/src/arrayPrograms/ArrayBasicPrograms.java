package arrayPrograms;

public class ArrayBasicPrograms {
//	Arrays are declare Global Variables
	static int[] arr= {70,80,56,48,93};//Static Global Variable
	int[] ar= {10,30,45,55,80,95,100};//Non-Static Global Variable
	public static void main(String[] args) {
		
		ArrayBasicPrograms ap=new ArrayBasicPrograms();
		ap.printArray(arr);// Passing as array an argument
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
