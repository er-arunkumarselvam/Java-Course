package loopingPrograms;

public class LoopingProgram15_17b_39 {

	public static void main(String[] args) {
		LoopingProgram15_17b_39 lp = new LoopingProgram15_17b_39();
//		lp.neonNumber(12);
//		lp.armStrongNumber(153);
//		lp.spyNumber(123);
		lp.perfectNumber(28);
	}
	private void perfectNumber(int no) {
		// Perfect Number is sum of the proper divisors is equal to that number itself.
		int div=1;
		int sum=0;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				sum=sum+div;
			}
			
			div=div+1;	
		}
		
		  if(no==sum) {
		  System.out.println("The given number is a Perfect Number. ("+no+")"); 
		  } 
		  else
		  { 
			  System.out.println("The given number is a Not Perfect Number. ("+no+")");
		  }
		 
		
	}


	private void spyNumber(int no) {
		// Spy Number - sum of all digits and products of all digits are same
		int no2=no;
		int sum =0;
		int product=1;
		while(no>0)
		{
			int rem = no%10;
			sum=sum+rem;
			product=product*rem;
			no=no/10;
		}
		if(sum==product)
		{
			System.out.println("The given number is a Spy Number. ("+no2+")");
		}
		else
		{
			System.out.println("The given number is Not a Spy Number. ("+no2+")");
		}
		
		
	}


	private void armStrongNumber(int no) {
		// Armstrong Number
		int no2=no;
		int count=0;
		while(no>0)
		{
		int rem = no%10;
		int result = rem*rem*rem;
		count =count+result;
		no=no/10;
		}
		if(count==no2)
		{
			System.out.println("The given number is Armstrong Number.");
		}
		else
		{
			System.out.println("The given number is Not Armstrong Number.");
		}
	}
	private void neonNumber(int no) {
		// Neon Number - sum of digits of square of the number equal to given number.
		// 9 = 9*9 = 81 => 8 + 1 = 9 (neon number)
		int ans = no * no;
		int sum = 0;
		while(ans!=0)
		{
			int rem = ans%10;
			sum = sum+rem;
			ans = ans/10;
		}
		System.out.println(sum);
		if(sum==no)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
		
	}

}
