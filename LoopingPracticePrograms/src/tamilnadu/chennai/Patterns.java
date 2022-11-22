package tamilnadu.chennai;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns p1 = new Patterns(); 
		//p1.print12345(); 
		//p1.pattern2(); 
		//p1.pattern3(); 
		//p1.pattern4(); 
		//p1.pattern5(); 
		//p1.pattern6(); 
		//p1.pattern7(); 
		//p1.pattern8(); 
		//p1.pattern8_b(); 
		//p1.pattern9(); 
		//p1.pattern10(); 
		//p1.printC(); 
		p1.printI(); 
		//System.out.println();
		//p1.printC(); 

	}

	private void printI() {
		// TODO Auto-generated method stub
		for(int star=1; star<=7; star++)
		{ 
			System.out.print("* ");  	
		}
		System.out.println(); 
		for(int star=1; star<=7; star++)
		{ 
			if(star==4)
				System.out.println("* "); 	
			else if(star==1 || star==2 || star==3)
				System.out.print("  "); 
		}
		for(int star=1; star<=7; star++)
		{ 
		System.out.print("* "); 
		}
	}

	private void printC() {
		// TODO Auto-generated method stub
		for(int star=1; star<=7; star++)
		{ if(star==1)
			System.out.print("  "); 
		else
			System.out.print("* ");  	
		}
		System.out.println(); 
		for(int star=1; star<=7; star++)
		{ System.out.println("* "); 	}
		for(int star=1; star<=7; star++)
		{ if(star==1)
			System.out.print("  "); 
		else
		System.out.print("* "); 
		}
	}

	private void pattern10() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num= 1; num<= row-1; num++)
		{
		System.out.print(" " + " "); 
		}
		for(int num=1; num<=6-row; num++)
		{
		System.out.print("*" + "   "); 
		}
		System.out.println(); 
		}
	}

	private void pattern9() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num= 1; num<= row-1; num++)
		{
		System.out.print(num + " "); 
		}
		System.out.println(); 
		}

	}

	private void pattern8_b() {
		// TODO Auto-generated method stub

		for(int row=5; row>=1; row--)
		{
		for(int num= row; num<=5; num++)
		{
		System.out.print(num+" "); 
		}
		System.out.println(); 
		}
		
	}

	private void pattern8() {
		// TODO Auto-generated method stub
		for(int row = 5; row>=1; row--)
		{
		for(int col=row; col<=5; col++)
		{ System.out.print(col + " ");  }
		System.out.println();  
		}
		
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num= 5 ; num>=6-row; num--)
		{
			System.out.print(num + " "); 
		}

		System.out.println(); 
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num= 1; num<= row; num++)
		{
			System.out.print(num + " "); 
		}

		System.out.println(); 
		}
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		int row = 5; 
		while(row>=1){
		for(int col=row; col>=1; col--)
		{ System.out.print(col + " "); }
		System.out.println(); row--; 
		}
		
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{

			for(int col= 1; col<=5-row; col++)
				{
				System.out.print(" "+" "); 
				}
			for(int col=1; col<=row;col++)
				System.out.print("*"+ "   "); 
		System.out.println(); 
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num= row; num<= 5; num++)
		{
		System.out.print(num + " "); 
		}
		System.out.println(); 
		}
		
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
		{
		for(int num=1; num<=6-row; num++)
		{	
			System.out.print((num*row) + " "); 
		}
		System.out.println();
		}
		
	}

	private void print12345() {
		// TODO Auto-generated method stub
		for(int row=1; row<5; row++)
		{
		for(int num=1; num<=6-row; num++)
		{	
			System.out.print((num*row) + " "); 
		}
		System.out.println();
		}
		
	}

}
