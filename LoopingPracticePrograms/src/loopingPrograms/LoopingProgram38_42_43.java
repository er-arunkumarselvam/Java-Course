package loopingPrograms;

public class LoopingProgram38_42_43 {

	public static void main(String[] args) {
		
		LoopingProgram38_42_43 lp = new LoopingProgram38_42_43();
//		lp.squareRoot(36,2);
//		lp.smallestDivisors(13321,2);
//		lp.greatestDivisors(10000);
//		lp.sumOfSingleDigit(12345);
		
		
	}

	private void sumOfSingleDigit(int no) {
		// Sum of Single Digit 
		int sum=0;
		while(no>0)
		{
			int rem =no%10;
			sum = sum+rem;
			no/=10;
		}
//		System.out.println("Sum of the given number: "+sum);
		if(sum>9)
		{
			sumOfSingleDigit(sum);
		}
		else
		{
			System.out.println("Sum of the given number in single digit : "+sum);
		}
		
	}

	private void greatestDivisors(int no) {
		// Greatest Divisors of given number
		int div=no/2;
		while(div>=2)
		{
			if(no%div==0)
			{
				System.out.println("The greatest divisor of given number ("+no+") is : "+div);
				break;
			}
			div++;
		}
		
	}

	private void smallestDivisors(int no, int div) {
		// Smallest Divisors of given number
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println("The smallest divisor of given number ("+no+") is : "+div);
				break;
			}
			div++;
		}
	}

	private void squareRoot(int no, int div) {
		// Square Root of given number 
		while(div<=no/2)
		{
			if(no/div==div)
			{
				System.out.println("The square root of given number ("+no+") is : "+div);
				break;
			}
			div++;
		}
		
	}
	

}
