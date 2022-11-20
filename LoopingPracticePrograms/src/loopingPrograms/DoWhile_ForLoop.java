package loopingPrograms;

public class DoWhile_ForLoop {

	public static void main(String[] args) {
		DoWhile_ForLoop lp = new DoWhile_ForLoop();
//		lp.do_whileLoop(100);
//		lp.for_Loop(1);
//		lp.for_Loop1(1);
//		lp.for_Loop2(1);
//		lp.for_Loop3(5);
		lp.for_Loop4();
		
	}

	private void for_Loop4() {
		// print 1 1 1 1 1 ->\n 2 2 2 2 2 -> \n 3 3 3 3 3
		for(int row=1;row<=3;row++)
		{
		for(int no=1;no<=5;no++)
		{
			System.out.print(row +" ");
		}
		System.out.println();
		}
		
		
	}

	private void for_Loop3(int no) {
		// print 5 4 3 2 1
		for(no=5;no>0;no--)
		{
			System.out.print(no+" ");
		}
		
	}

	private void for_Loop2(int no) {
		// print 1 2 3 4 5 (3 lines)
		for(int row=1;row<=3;row++)
		{
			
			for(no=1;no<=5;no++)
			{
				System.out.print(no+" ");
			}
			System.out.println();
		}
		
	}

	private void for_Loop1(int no) {
		// print 1 2 3 4 5 -->\n 6 7 8 9 10 -->\n 11 12 13 14 15
		for(no=1;no<=15;no++)
		{
			System.out.print(no+" ");
			if(no%5==0)
			{
				System.out.println();
			}
		}
		
	}

	private void for_Loop(int no) {
		// print 1 3 5 7 9 2 4 6 8 10
		for(no=1; no<=10;no+=2)
		{
			System.out.print(no+" ");
			if(no==9)
			{
				no=0;
			}
			
		}
		
	}

	private void do_whileLoop(int no) {
		// Do..While Loop
		int count=0;
		do
		{
			System.out.println(no);
			no++;
			count++;
		}while(count<=5);
		
	}

}
