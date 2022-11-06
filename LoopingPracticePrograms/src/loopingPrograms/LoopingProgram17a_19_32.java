package loopingPrograms;

public class LoopingProgram17a_19_32 {

	public static void main(String[] args) {
		LoopingProgram17a_19_32 lp = new LoopingProgram17a_19_32();
		lp.strongNumber(145);
		lp.factorial(5);
		lp.printFactorial(5);
	}

	private void printFactorial(int max) {
		// Print solution of 5! 4! 3! 2! 1! each factorial value
		while(max>=1)
		{
		int fact =1;
		int no=1;
		while(no<=max)
		{
			fact=fact*no;
			no=no+1;
		}
		System.out.println("The factorial value ("+max+") is : "+fact);
		max=max-1;
		}
		
		
	}

	private void strongNumber(int max) {
		// Strong Number - 145 (addition of factorial of each digit of the no which is equal to the no itself.
		System.out.print("The given number is "+max+" . ");
		int max2 = max;
		int strong =0;
		while(max>0)
		{
			int no=max%10;
			int result=factorial(no);
			strong = strong + result;
			max=max/10;
		}
		if(max2==strong)
		{
			System.out.println("The given number is strong.");
		}
		else
		{
			System.out.println("The given number is not strong.");
		}
	}

	private int factorial(int max) {
		// Factorial Program 1*2*3*4*5 = 120
		int fact =1;
		int no =1;
		while(no<=max)
		{
			fact =fact *no;
			no=no+1;
		}
	//System.out.println("The factorial of given number ("+max+") is "+fact);
		return fact;
	}

}
