package patternPrograms;

public class PatternPrograms {

	public static void main(String[] args) {
		
		PatternPrograms pp=new PatternPrograms();
//		pp.pattern1();
//		pp.pattern2();
//		pp.pattern3();
//		pp.pattern4();
	pp.pattern5();
		
		
	}

	

	private void pattern5() {
//		5	5	5	5	5
//		4	4	4	4	4
//		3	3	3
//		2	2	
//		1
		for(int row=5;row>=1;row--)
		{
			for(int num=1;num<=row;num++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
			
		}
		
	}

	private void pattern4() {
//		5	4	3	2	1
//		5	4	3	2
//		5	4	3
//		5	4
//		5
		for(int row=1;row<=5;row++)
		{
			for(int num=5;num>=row;num--)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
//		1 	2	3	4	5	
//		1	2	3	4
//		1	2	3
//		1	2
//		1
		for(int row=1;row<=5;row++)
		{
			for(int num=1;num<=6-row ;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern2() {
//		1	1	1	1	1
//		2	2	2	2	2
//		3	3	3	3	3
		for(int row=1;row<=3;row++)
		{
			for(int num=1;num<=5;num++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void pattern1() {
// 		1	2	3	4	5
//		1	2	3	4	5
//		1	2	3	4	5
		for(int row=1;row<=3;row++)
		{
			for(int num=1;num<=5;num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	

	
		
	}


