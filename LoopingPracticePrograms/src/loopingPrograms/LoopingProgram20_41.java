package loopingPrograms;

public class LoopingProgram20_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingProgram20_41 lp =new LoopingProgram20_41();
		//lp.commonDivisors(100, 120);
		lp.greatestCommonDivisors(100, 120);
	}

	private void greatestCommonDivisors(int no1, int no2) {
		// Greatest Common Divisor
		System.out.print("The greatest common divisors of "+no1 +" and "+ no2 +" is : " );
		int gcd=0;
		int div=2;
		int small = no1<no2?no1:no2;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd=div;
			}
			div=div+1;
		}
		System.out.print(gcd);
		
	}

	private void commonDivisors(int no1, int no2) {
		// Find common divisors in given two numbers
		System.out.print("The common divisors of "+no1 +" and "+ no2 +" is : " );
		int div=2;
		while(div<no1)
		{
			if(no1%div==0 && no2%div==0)
			{
				System.out.print(div+" ");
			}
			div=div+1;
		}
	}

}
