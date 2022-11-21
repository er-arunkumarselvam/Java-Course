package patternPrograms;

public class PatternPrograms {

	public static void main(String[] args) {
		
		PatternPrograms pp=new PatternPrograms();
//		pp.pattern1();
//		pp.pattern2();
//		pp.pattern3();
//		pp.pattern4();
//		pp.pattern5();
//		pp.pattern6();
//		pp.pattern7();
//		pp.pattern8();
//		pp.pattern9();
//		pp.pattern10();
//		pp.pattern11();
//		pp.pattern12();
//		pp.pattern13();
//		pp.pattern14();
//		pp.pattern15();
//		pp.pattern16();
//		pp.pattern17();
//		pp.pattern18();
//		pp.pattern19();
//		pp.pattern20();
//		pp.pattern21();
//		pp.pattern22();
//		pp.pattern23();
//		pp.pattern24();
		pp.pattern25();
		
		
		
	}

	private void pattern25() {
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=row;num++)
		{
		System.out.print((num+row)+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern24() {
//		5
//	    4   5
//	    3   4   5
//	    2   3   4   5
//	    1   2   3   4   5
		for(int row=5;row>=1;row--)
		{
		for(int num=row;num<=5;num++) // Start num = row print first number is row , last number 5
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern23() {
		
		for(int row=5;row>=1;row--)
		{
		for(int num=5;num>=row;num--)
		{
		System.out.print(row+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern22() {
//		5
//	    5   4
//	    5   4   3
//	    5   4   3   2
//	    5   4   3   2   1
		for(int row=5;row>=1;row--)
		{
		for(int num=5;num>=row;num--)
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern21() {
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=row;num++)
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern20() {
//        *   
//      *   *   
//    *   *   *   
//  *   *   *   *   
//*   *   *   *   *  
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(" "+" ");
		}
		for(int col=row;col>0;col--)
		{
		System.out.print("*"+"   ");
		}
		System.out.println();
		}
	}

	private void pattern19() {
// 			    *
// 		    *	*
//	    *	*	*
//	*	*	*	*
//*	*	*	*	* 
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(" "+" ");
		}
		for(int col=row;col>0;col--)
		{
		System.out.print("*"+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern18() {
//        1 
//      2 2 
//    3 3 3 
//  4 4 4 4 
//5 5 5 5 5 		
		
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(" "+" ");
		}
		for(int col=row;col>0;col--)
		{
		System.out.print(row+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern17() {
//        		  1
//        	  2   1
//        3   2   1
//    4   3   2   1
//5   4   3   2   1
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(" "+" ");
		}
		for(int col=row;col>0;col--)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern16() {
//        		  1
//        	  1   2
//        1   2   3
//    1   2   3   4
//1   2   3   4   5
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(" "+" "); // Only using " " --> Space
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}

	private void pattern15() {
		
//		 	1   2   3   4   1
//		    1   2   3   2   2
//		    1   2   3   3   3
//		    1   4   4   4   4
//		    1   5   5   5   5
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(num+" ");
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(row+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern14() {
//		1   2   3   4   1
//	    1   2   3   1   2
//	    1   2   1   2   3
//	    1   1   2   3   4
//	    1   2   3   4   5
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(num+" ");
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(col+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern13() {
//		1   2   3   4   1
//	    1   2   3   1   1
//	    1   2   1   1   1
//	    1   1   1   1   1
//	    1   1   1   1   1
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(num+" ");
		}
		for(int col=1;col<=row;col++)
		{
		System.out.print(1+" ");
		}
		System.out.println();
		}
	}

	private void pattern12() {
//		1   2   3   4   1
//	    1   2   3   1
//	    1   2   1
//	    1   1
//	    1
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=5-row;num++)
		{
		System.out.print(num+" ");
		
		}
		System.out.print(1+" ");
		System.out.println();
		}
		
	}

	private void pattern11() {
//		1   2   3   4	row-count=1 --> count(num)=row-1
//	    1   2   3		5-4=1 --> num<=row-1
//	    1   2
//	    1
//	    Empty
		for(int row=5;row>0;row--) // row --> 5 4 3 2 1
		{
		for(int num=1;num<=row-1;num++) //num<=row-1
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
//		Another Approach
		
		
		for(int row=1;row<=5;row++) // row --> 1 2 3 4 5 --> row+count=5 
		{
		for(int num=1;num<=5-row;num++) //num<=5-row
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern10() {
//		 5   4   3   2   1
//		 4   3   2   1
//		 3   2   1
//		 2   1
//		 1
		for(int row=5;row>=1;row--)
		{
		for(int num=row;num>=1 ;num--)
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern9() {
//		 5   4   3   2   1
//		 5   4   3   2
//		 5   4   3
//		 5   4
//		 5
		for(int row=1;row<=5;row++)
		{
		for(int num=5;num>=row ;num--)
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern8() {
//		1   2   3   4   5 	row+count= 6 (failed)
//		2   3   4   5		last no = 5
//		3   4   5
//		4   5
//		5
		
		for(int row=1;row<=5;row++)
		{
		for(int num=row;num<=5 ;num++)
		{
		System.out.print(num+" ");
		}
		System.out.println();
		}
		
	}

	private void pattern7() {
//		1   2   3   4   5
//	    2   4   6   8
//	    3   6   9   
//	    4   8
//	    5
		for(int row=1;row<=5;row++)
		{
		for(int num=1;num<=6-row ;num++)
		{
		System.out.print(num*row+" ");
		}
		System.out.println();
		}
	}

	private void pattern6() {
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
	
	private void pattern5() {
//		1   1   1   1   1
//	    2   2   2   2   
//	    3   3   3
//	    4   4
//	    5
		for(int row=1;row<=5;row++)
		{
			for(int num=1;num<=6-row;num++)
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


