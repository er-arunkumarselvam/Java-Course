package loopingPrograms;

public class LoopingProgram7_8_18 {

	public static void main(String[] args) {
		LoopingProgram7_8_18 lp = new LoopingProgram7_8_18();
		lp.divisorsOfNumber(10);
		lp.countDivisor(10);
		lp.additionOfN(0);

	}

	private void countDivisor(int no) {
		// Count of Divisors of given number 
		int div = 1;
		int count=0;
		while (div<= no) {
			if (no % div == 0) {
				count =count+1;
			}
			div = div + 1;
		}
		System.out.print("No of Divisors of given number = "+count);
		System.out.println("\n");
	}

	private void divisorsOfNumber(int no) {
		// Divisors of given number
		int div = 1;
		while (div<=no) {
			if (no % div == 0) {
				System.out.print(div + " ");
			}
			div = div + 1;
		}
		System.out.println("\n");
	}

	private void additionOfN(int no) {
		// Addition of n numbers
		int day=1;
		while(day<=10)
		{
			no=no+day;
			day=day+1;
		}
		
		System.out.println("The Total amount earned after 10 days = "+no);
	}

}
