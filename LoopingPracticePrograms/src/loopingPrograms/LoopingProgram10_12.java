package loopingPrograms;

public class LoopingProgram10_12 {

	public static void main(String[] args) {
		LoopingProgram10_12 lp = new LoopingProgram10_12();
		lp.reverseNumber(1234);
		lp.countOfDigit(65432);
		lp.sumOfDigits(123456789);
	}

	private void sumOfDigits(int no) {
		// Sum of digits
		int sum = 0;
		System.out.println("The given no is "+no);
		while(no>0)
		{
			int rem = no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("The sum of digits is "+sum);
		System.out.println("\n");
		
	}

	private void countOfDigit(int no) {
		// Count of digits
		int count = 0;
		System.out.println("The given no is "+no);
		while(no>0)
		{
			int rem = no%10;
			count=count+1;
			no=no/10;
		}
		System.out.println("The count of digits is "+count);
		System.out.println("\n");
		
	}

	private void reverseNumber(int no) {
		// Reverse Printing a number
		System.out.println("The given no is "+no);
		while(no>0)
		{
			int rem = no%10;
			System.out.print(rem);
			no=no/10;
		}
		System.out.println("\n");
	}

}
