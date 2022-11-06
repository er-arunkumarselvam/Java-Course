package loopingPrograms;

public class LoopingProgram13_14 {

	public static void main(String[] args) {
		LoopingProgram13_14 lp =new LoopingProgram13_14();
		//lp.reverseNumber(1234);
		lp.palidrome(12322);

	}

	private void palidrome(int no) {
		// Palidrome Problem
		int no2=no;
		System.out.print("The given number is "+no+" . ");
		int rev = 0;
		while(no>0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(no2==rev)
		{
			System.out.println("The given number is Palidrome.");
		}
		else
		{
			System.out.println("The given number is Not Palidrome.");
		}
		
	}

	private void reverseNumber(int no) {
		// Reverse the number
		System.out.print("The given number is "+no+" . The reverse no is  ");
		int rev = 0;
		while(no>0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.print(rev);
		
		
	}

}
