package patternPrograms;

public class PatternName {

	public static void main(String[] args) {
		
		PatternName pp = new PatternName();
//		pp.letterStar();
//		pp.number8();
		pp.letterA();
		pp.letterR();
		pp.letterU();
		pp.letterN();
		pp.letterK();
		pp.letterU();
		pp.letterM();
		pp.letterA();
		pp.letterR();
		
	
	}

	private void letterK() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==1)
				System.out.print("* ");
			else if(row==4 && col==2 ||row==4 && col==3)
				System.out.print("* ");
			else if(row+col==8 && row<=4)
				System.out.print("* ");
			else if(row>=5&&row==col) {
				System.out.print("* ");
				}
			else
				System.out.print("  ");
			
			}
			System.out.println();
			
		}
		System.out.println();
	}

	private void letterM() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==1|| col==7)
				System.out.print("* ");
			else if(row==col && row<=4 )
				System.out.print("* ");
			else if(row+col==8&& row<col)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void letterN() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
			if(col==1 ||row==col|| col==7)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

	private void letterR() {
		for(int col=1;col<=6;col++) {
				System.out.print("* ");
		}
		System.out.println();
//		Second
		for(int row=1;row<=7;row++)
		{
		if(row!=4) {
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
			else
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
		}
		System.out.println();
		
	}

	private void letterA() {
		for(int col=1;col<=6;col++) {
			if(col!=1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
//		Second
		for(int row=1;row<=7;row++)
		{
		if(row!=4) {
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
			else
			{
				for(int col=1;col<=7;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
		}
		System.out.println();
		
	}

	private void number8() {
		for(int col=1;col<=6;col++) {
			System.out.print("* ");
		}
		System.out.println();
//		second attempt
		for(int row=1;row<=7;row++)
		{
		if(row!=4) {
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("  ");
			}
			System.out.println("* ");
		}
			else
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
		}
			
			}
		for(int col=1;col<=6;col++)
		{
			System.out.print("* ");
		}
		
	}

	private void letterStar() {
		for(int row=1;row<=7;row++)
		{
			for(int col=1;col<=7;col++)
			{
				System.out.print("a"+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	private void letterU() {
		for(int col=1;col<=6;col++)
		{
			System.out.print("* ");
			for(int space=1;space<=5;space++)
			{
				System.out.print(" ");
			}
			
				for(int space=1;space<=5;space++)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
				System.out.println();
			
		}
		
		for(int row=1;row<=1;row++)
		{
			System.out.print("  ");
			for(int space=1;space<=5;space++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
		
}

		
	

	


