package tamilnadu.chennai;

public class LoopingPrograms {

	
	  static int strong = 0; 
	  public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
		
		LoopingPrograms lp = new LoopingPrograms(); 
		
		  //lp.printOne(); //System.out.println(); //lp.print12345();
		  //lp.multiples_of_3_and_5(); //lp.multiples_of_3_or_5();
		  //lp.sum_of_first_n_numbers();
		 		//lp.find_divisors(100); 
		//lp.find_count_of_divisors(100); 
		//lp.prime_or_not(14); 
		// I GOT JOB
		// Over Qualified 
		// celcius to farenheit
		// dollar to rupees
		// leap year: 
		//lp.print_no_in_reverse_order(145); 
		//lp.count_of_digits(5674); 
		//lp.sum_of_digits(123456); 
		//lp.common_divisors(100,120); 
		//lp.greatest_common_divisors(100,120);
		//lp.reverse_no(9898); 
		//lp.find_palindrome(12321);
		//lp.find_factorial(5); 
		//lp.find_factorials(5);
		int no = 2; 
		int primeCount = 0; 
		//lp.find_Prime(no,primeCount); 
		//lp.print_table(); 
		//lp.print_table2(); 
		//lp.print_no_series();
		//lp.find_square_root(100, 2); 
		//int result = lp.find_power(5,4); 
		//System.out.println( result);
		//lp.find_binary_to_decimal(111); 
		//lp.find_lcm(3, 100); 
		//lp.find_binary(6); 
		//System.out.println(5+5);	//10 	
		//System.out.println("5"+5);	//"55"
		//lp.find_fibo(); 
		//lp.find_power2(); 
		lp.display(5); 
	}

	private void display(int no) {
		// Method Calling itself
		System.out.print(1); 
		no = no-1; 
		if(no>0)
		    display(no); //3
		
	}

	private void find_power2() {
		// TODO Auto-generated method stub
		
		int no =4;
		while(no>1){

		int power=no;
		int num=no;
		while (power>1)
		{
		num=no* num;
		power=power-1;
		}
		System.out.println(num);
		no=no-1;
		} 
		
	}

	private void find_fibo() {
		// TODO Auto-generated method stub
		int first =0, second = 1;  
		while(first<25)
		{
		System.out.println(first); //0 
		first = second - first; //first = 2
		second = first + second; //second = 5
		}
		
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

	private void find_lcm(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1: no2; //big = 10
		while(true)
		{
		if(big%no1 ==0 && big%no2==0)
		{
			System.out.println("Least Common Multiple " + big);
			break; 
		}
		big = big+1; 
		}		
	}

	private void find_binary_to_decimal(int binary) {
		// TODO Auto-generated method stub
		
		int decimal = 0, i = 0; 
		while(binary > 0)
		{
		int rem = binary%10; //1
		int value = rem * find_power(2,i); 
		decimal = decimal + value; 
		binary = binary / 10; //1
		i = i+1; 
		}
		System.out.println(decimal); 
	}

	private int find_power(int base, int power) {
		// TODO Auto-generated method stub
		int power2 = power; 
		int result = 1; 
		while(power>=1)
		{
		result = result * base; 
		power = power - 1; 
		}
		return result;  
	}

	private void find_square_root(int no, int div) {
		// TODO Auto-generated method stub
		 
		while(div<=no/2)
		{
		    if(no/div == div)
		    {
		    System.out.println(div + " is the square root"); 
		    break; 
		    }
		div = div+1; 
		}
		
	}

	private void print_no_series() {
		// TODO Auto-generated method stub
	
	int no1 = 10, no2 = 8; 
	while(no2>=0)
	{
	System.out.print(no1+" ");
	no1 = no1 + no2;
	no2 = no2 - 2; 
	}
		
	}

	private void print_table2() {
		// TODO Auto-generated method stub
		int no1 = 1, no2 = 10; 
		while(no1<=5)
		{
		System.out.println(no1 + " * " + no2 + " = " + no1 * no2); 
		no1 = no1 + 1;
		no2 = no2 - 1;  
		}
		
	}

	private void print_table() {
		// TODO Auto-generated method stub
		int no1 = 1, no2 = 10; 
		while(no1<=5)
		{
System.out.println(no1 + " * " + no2 + " = " + (no1 * no2)); 
no1 = no1 + 1; 
		}
		
	}

	private void find_Prime(int no, int primeCount) {
		// TODO Auto-generated method stub
		int div = 2, count = 0;
		while(div<no) {//   9998 ~ 10000 Times
		    if(no%div==0) {	// 2
		     count = count+1; 
		        //System.out.println("NOT PRIME"); 
		        break; // breaking the loop. 
		    	}
		    div = div+1; 
		}
		if(count == 0)
		    {
		    System.out.println("PRIME "+ no);
		    primeCount = primeCount+1; //1
		    }
		no = no+1; //3
		if(primeCount<20)
		{
			find_Prime(no, primeCount); 
		}			
	}

	private int find_factorial(int max) {
		// TODO Auto-generated method stub
		int fact = 1; 
		int no = 1; 
		while(no<=max)
		{
		fact = fact * no; 
		no = no+1; 
		}
		System.out.println("Factorial  is " + fact); 
		
		return fact; 
		
	}

	private void find_factorials(int max) {
		// TODO Auto-generated method stub
		while(max>=1)
		{
		int fact = 1; 
		int no = 1; 
		while(no<=max)
		{
		fact = fact * no; 
		no = no+1; 
		}
		System.out.println("Factorial  is " + fact); 
		max = max -1; 
		}
		
	}

	private void find_palindrome(int no) {
		// TODO Auto-generated method stub 
		int no2 = no; 
		int rev = 0; 
		while(no>0)
		{
		int rem = no%10; 
		rev = (rev*10) + rem; 
		no = no/10; 
		}

		if(no2 == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

	private void reverse_no(int no) {
		
		int rev = 0; 
		while(no>0)
		{
		int rem = no%10; 
		rev = (rev*10) + rem; 
		no = no/10; 
		}	
		System.out.println(rev);
	}

	private void greatest_common_divisors(int no1, int no2) {
		// TODO Auto-generated method stub
	
		int div = 2; 
		int gcd = 0; 
		int small = 
		no1<no2?no1: no2; 
		while(div<=small)
		{
		if(no1%div==0 &&
		  no2%div==0)
		{
		gcd = div; 
		}
		div= div+1; 
		}
		System.out.println(gcd);
		
	}

	private void common_divisors(int no1, int no2) {

		int div = 2; 
		//Ternary Operator: 
		int small = no1<no2? no1 : no2; 
		while(div<=small)
		{
		if(no1%div==0 && no2%div==0)
		{
			System.out.println(div); 
		}
		div = div+1; 
		}
		
	}

	private void sum_of_digits(int box) {
		// TODO Auto-generated method stub
		int count = 0; 
		int sum = 0; 
		while(box>0)
		{
		int rem = box%10; 
		sum = sum + rem;
		//count = count+1; 
		box = box/10; 	
		}
		//System.out.println("No. of Digits is "+ count);
		
		if(sum>9)
		{
			sum_of_digits(sum);
		}
		else
		{
			System.out.println("Sum of digits is "+ sum);
		}
		
	}

	private void count_of_digits(int box) {
		// TODO Auto-generated method stub
		int count = 0; 
		while(box>0)
		{
		System.out.println(box%10); 
		count = count+1; 
		box = box/10; 	
		}
		System.out.println("No. of Digits is "+ count);
		
	}

	private void print_no_in_reverse_order(int box) {
		int box2 = box;
		while(box>0)//1>0
		{
		System.out.println(box%10); 
		int no = box%10; //1
		int result = find_factorial(no);//24
		strong = strong + result; //145

		box = box/10; 	//1
		}
		if(box2==strong)
		{
			System.out.println("Strong Number");
		}
		
	}

	private void prime_or_not(int no) {
		// TODO Auto-generated method stub
		int div = 2;
		int count = 0; 
		
		while (div < no) {
			if (no % div == 0) {
				//System.out.print(div + " ");
				count = count+1; 
			}
			div = div + 1;
		}
		System.out.println("No. of Divisors is "+ count);
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");

		
	}

	private void find_count_of_divisors(int no) {
		// TODO Auto-generated method stub
		int div = 2;
		int count = 0; 
		
		while (div < no) {
			if (no % div == 0) {
				//System.out.print(div + " ");
				count = count+1; 
			}
			div = div + 1;
		}
		System.out.println("No. of Divisors is "+ count);
		
	}

	private void find_divisors(int no) {
		// after selecting, ctrl + shift + f
		int div = 2;
		while (div < no) {
			if (no % div == 0) {
				System.out.print(div + " ");
			}
			div = div + 1;
		}
		
	}

	private void sum_of_first_n_numbers() {
		// Addition of first 10 Numbers: 
		int sum =0; 
		int no = 1; 
		while(no<=10)
		{

		sum = sum + no; 
		no = no +1; 
		}
		System.out.println("Addition of First n numbers " + sum); 
		
	}

	private void multiples_of_3_or_5() {
		// TODO Auto-generated method stub
		
		int no = 1; 
		while(no<=30)	// | - pipe
		{
		if(no%3==0 || no%5==0)
			{
			System.out.print(no+"  "); 
			}
		no = no+1; 
		}
	}

	private void multiples_of_3_and_5() {
		// TODO Auto-generated method stub
		int no = 1; 
		while(no<=30)	//& - ampersand
		{
		if(no%3==0 && no%5==0)
			{
			System.out.print(no+" "); 
			}
		no = no+1; 
		}
		
	}

	private void print12345() {
		// TODO Auto-generated method stub
		System.out.println(12345);
		
	}

	private void printOne() {
		// TODO Auto-generated method stub
		int no = 25; 
		while(no>=5)  //25 >=5
		{
			System.out.print(no+" ");//25
			no = no -5; 
		}
		//25	20	15	10	5	0
		//25	20	15	10	5
		//
	}

}
