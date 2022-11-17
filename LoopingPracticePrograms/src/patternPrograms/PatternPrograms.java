package patternPrograms;

public class PatternPrograms {

	public static void main(String[] args) {
		
		PatternPrograms pp=new PatternPrograms();
		//pp.print1_5();
		//pp.print1_1();
		//pp.printLast5();
		//pp.print1();
		//pp.print6();
		//pp.print7();
		pp.print8();
		
		
	}
	

	private void print8() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--)
		{
		for(int num= 1 ;num<=row   ;num++ )
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}


	private void print7() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int num=5;num>=6-row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}


	private void print6() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}


	private void print1() {
		// TODO Auto-generated method stub
		for(int row= 5;row>=0;row--)
		{
		for(int num= 5;num>=6-row;num--)
		{
		System.out.print(num+" ");
		}

		System.out.println();
		} 
	
	}


	private void printLast5() {
		// Print Pattern Program
		//1 2 3 4 5
		//2 3 4 5
		//3 4 5 
		//4 5
		//5
		for(int row=1;row<=5;row++)
		{
			for(int num=row;num<=5;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void print1_1() {
		// Print Pattern Program
				//1 1 1 1 1 
				//2 2 2 2
				//3 3 3 
				//4 4
				//5
		for(int row=1; row<=5; row++)
		{
		for(int num=1; num<=6-row; num++)
		{	
			System.out.print(row + " "); 
		}
		System.out.println();
		} 
	}

	private void print1_5() {
		// Print Pattern Program
		//1 2 3 4 5 
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=6-row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
