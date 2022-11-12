package loopingPrograms;

public class LoopingProgram17a_19_32 {

	public static void main(String[] args) {
		LoopingProgram17a_19_32 lp = new LoopingProgram17a_19_32();
		lp.strongNumber(145);
		lp.factorial(5);
		lp.printFactorial(5);
//		lp.find_binary(6);

//		lp.printNumberSeries(10,8);
//		lp.findSquareRoot(9,2);
		
	}


	
	private void find_binary(int decimal ) {
		// TODO Auto-generated method stub
		
		String binary = ""; 
		while(decimal>0)
		{
		int rem = decimal%2; //6%2 3%2  1%2
		binary = rem + binary; //0 + "" => 1+ "0" => "10" => 1+"10" -> 110
		decimal = decimal / 2;// decimal = 1
		}
		System.out.println("Binary is " + binary); 
		
	} 

	private void findSquareRoot(int no, int div) {
		// Square Root of Given Number
		
		while(div<=no/2)
		{
			if(no/div==div)
			{
				System.out.println(div + " is the square root of number "+no);
			}
			div=div+1;
		}
		
	}


	private void printNumberSeries(int no1, int no2) {
		// TODO Auto-generated method stub
		while(no2>=0)
		{
			System.out.println(no1);
			no1=no1+no2;
			no2=no2-2;
		}
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
