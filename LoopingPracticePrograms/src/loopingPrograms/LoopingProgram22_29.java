package loopingPrograms;

public class LoopingProgram22_29 {

	public static void main(String[] args) {
		
		LoopingProgram22_29 lp = new LoopingProgram22_29();
		//lp.findPower(3,5);
		//lp.findPowers(1);
		//lp.findBinaryToDecimal(110,0);
		//lp.swappingNumber(10,20);
		//lp.swappingNumbers(5,10);
		//lp.oddOrEven(123456);
		//lp.lcm(3,10);
		//lp.withoutModulo(3);
		lp.findDecimalToBinary(12," ");

	}
	private void findDecimalToBinary(int decimal, String binary) {
		// Find Decimal to Binary Value (6) - Binary ?
		while(decimal>0)
		{
			int rem=decimal%2;
			binary=rem+binary;
			decimal/=2;
		}
		System.out.println(binary);
		
	}
	private void withoutModulo(int no) {
		// Number is multiple of 3 without using / and % operators
		System.out.print("Number is multiple of 3 : ");
		while(no<=30)
		{
			
			System.out.print(no+" ");
			no=no+3;
		}
		
	}
	private void lcm(int no1, int no2) {
		// Find the LCM 
//		Least Multiple is the given number is same number
		int big=no1<no2?no1:no2;
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("Least Common Multiple of given ("+no1+") and ("+no2+") is : "+big);
				break;
			}
			big++;
		}
		
	}
	private void oddOrEven(int no) {
		// no=123456 -->print  odd - 135, even - 246
		int rem=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			if(rem%2==0)
			{
				System.out.println("Even No: "+rem+" ");
			}
			
			else
			{
				System.out.println("Odd  No: "+rem+" ");
			}
		}
		
		
	}
	private void swappingNumbers(int no1, int no2) {
		//Swapping Number no1=10, no2=20 --> no1=20, no2=10 using without third variable no3.
		System.out.println("Before Swapping no1 : "+no1); // 5
		System.out.println("Before Swapping no2 : "+no2); // 10
		System.out.println("--------------------------");
		no2=no1+no2;//15
		no1=no2-no1;//15-5 = 10
		no2=no2-no1;//15-10= 5
		System.out.println("After Swapping no1  : "+no1); // 10
		System.out.println("After Swapping no2  : "+no2);// 5
		
	}
	private void swappingNumber(int no1, int no2) {
		//Swapping Number no1=10, no2=20 --> no1=20, no2=10 using third variable no3.
		int no3;
		System.out.println("Before Swapping no1 : "+no1); // 10
		System.out.println("Before Swapping no2 : "+no2); // 20
		System.out.println("--------------------------");
		no3=no1+no2; // 30
		no2=no3-no2; // 30- 20 =10
		no1=no1+no2; // 10+10 =20
		System.out.println("After Swapping no1  : "+no1); // 20
		System.out.println("After Swapping no2  : "+no2);// 10
		
	}
	private void findBinaryToDecimal(int binary, int  decimal) {
		// Find the Binary to Decimal Value (110) - Decimal ?
		int i=0;
		while(binary>0)
		{
		int rem=binary%10;//0 1 1
		int result=rem*findPower(2,i);// Assign the variable i for changing the power and call findPower method
		decimal+=result;//decimal=decimal+result
		binary/=10;//binary=binary/10
		i++;//i=i+1
		}
		System.out.println(decimal);
		
		
	}

	private void findPowers(double result) {
		//find the 2 power of 5 using Math.pow(2,5)
		result=result*Math.pow(2,5);
		System.out.println("The power of given number is "+(int)result);	
		
	}

	private int findPower(int base, int power) {
		// find the 2 power of 5 with out using default method
		 int result=1;
		int value=power;
		while(power>=1)
		{
		result*=base; // result = result * base;
		power--; // power = power -1;
		}
		//System.out.println("The given number ("+base+") power of ("+value+") is : "+result);
		return result;
	}

}
