package loopingPrograms;

public class LoopingProgram7_9_18 {

	public static void main(String[] args) {
		LoopingProgram7_9_18 lp = new LoopingProgram7_9_18();
//		lp.divisorsOfNumber(10);
//		lp.countDivisor(10);
//		lp.additionOfN(0);
//		lp.primeNumberOrNot(17);
//		lp.primeBreak(10);
//		Method using Programs 
		int no=2;
		int primeCountNo=0;
		lp.primeCount(no,primeCountNo);
		
	}
	


	private void primeCount(int no, int primeCountNo) {
		// Count Prime Numbers using Method calling itself
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				count = count + 1;
				//System.out.println("The given number (" + no + ") is Not a Prime Number.");
				break;// Keyword - Break the Loop
			}
			div = div + 1;
		}
		
		 // System.out.println("No of Divisors of given number = " + count); 
		  if (count ==0) 
		  { 
			  //System.out.println("The given number (" + no + ") is a Prime Number.");
			  System.out.println("Prime.No "+no);
			 primeCountNo=primeCountNo+1;
		  }
		 no=no+1;
		 if(primeCountNo<20)
		 {
			 primeCount(no, primeCountNo);
		 }
		
		
	}


	private void primeBreak(int no) {
		// The given number is a prime number or not a prime number using break keyword
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				count = count + 1;
				System.out.println("The given number (" + no + ") is Not a Prime Number.");
				break;// Keyword - Break the Loop
			}
			div = div + 1;
		}
		System.out.println("No of Divisors of given number = " + count);
		if (count == 0) {
			System.out.println("The given number (" + no + ") is a Prime Number.");
		} 
		
	}


	private void primeNumberOrNot(int no) {
		// The given number is a prime number or not a prime number
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				count = count + 1;
			}
			div = div + 1;
		}
		System.out.println("No of Divisors of given number = " + count);
		if (count == 0) {
			System.out.println("The given number (" + no + ") is a Prime Number.");
		} else {
			System.out.println("The given number (" + no + ") is Not a Prime Number.");
		}
		System.out.println("\n");
	}

	private void countDivisor(int no) {
		// Count of Divisors of given number
		int div = 1;
		int count = 0;
		while (div <= no) {
			if (no % div == 0) {
				count = count + 1;
			}
			div = div + 1;
		}
		System.out.print("No of Divisors of given number = " + count);
		System.out.println("\n");
	}

	private void divisorsOfNumber(int no) {
		// Divisors of given number
		int div = 1;
		while (div <= no) {
			if (no % div == 0) {
				System.out.print(div + " ");
			}
			div = div + 1;
		}
		System.out.println("\n");
	}

	private void additionOfN(int no) {
		// Addition of n numbers
		int day = 1;
		while (day <= 10) {
			no = no + day;
			day = day + 1;
		}

		System.out.println("The Total amount earned after 10 days = " + no);
	}

}