package testPrograms;

public class LoopingTestProgram {

	public static void main(String[] args) {
		
		LoopingTestProgram lp=new LoopingTestProgram();
		lp.fibonacci(0,1);
		lp.fibonacciPrime(0);
		
		
	}

	private int fibonacciPrime(int no) {
		// Prime Number in Fibonacci Series
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				count = count + 1;
				System.out.println("The given number (" + no + ") is Not a Prime Number.");
				break;
			}
			div = div + 1;
		}
		if (count == 0) {
			System.out.println("The given number (" + no + ") is a Prime Number.");
		} 
		return no;
	}

	private void fibonacci(int no1, int no2) {
		// Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21
		int no3;
		while(no1<=20)
		{
		System.out.println("The Fibonacci Series is "+no1+" ");
		no3=no1+no2;
		no1=no2;
		no2=no3;
		int result=fibonacciPrime(no1);
		
		}
		
	}
	

}
