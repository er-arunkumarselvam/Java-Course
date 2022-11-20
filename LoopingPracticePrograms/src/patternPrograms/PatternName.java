package patternPrograms;

public class PatternName {

	public static void main(String[] args) {
		
		PatternName pp = new PatternName();
		pp.letter_A();
//		pp.letter_N();
//		pp.letter_M();
	}

	private void letter_M() {
		// Letter M
		for(int row=1; row<=7; row++)
		{
			for(int col=1; col<=7; col++)
			{
				if(col==1 || col==7)
					System.out.print("* ");
				else if(row==col && row<=4)
					System.out.print("* ");
				else if(row+col==8 && row<=col)
					System.out.print("* ");
				else	
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

	private void letter_A() {
		// Letter A
			
		for(int row=1; row<=7; row++)
		{   if(row==1){
			
		    System.out.print("  "); 
		    for(int space=1; space<=6; space++)
		    { System.out.print("*  ");	}
		    System.out.println("   "); 
		
		}
		    else
		    {
		    for(int col=1; col<=7; col++)
		    {  if(col==1 || col==7)
		    		System.out.print("*  ");
		    else
		    	System.out.print("  "); }
		    System.out.println(); 
		    }
		}
		
		for(int col=1; col<=7; col++)
		{ if(col==1)
			System.out.print("  "); 
			else
			System.out.print("*  ");  
		}

			
			
			
	}

	private void letter_N() {
		// Letter N
		for(int row=1; row<=7; row++)
		{
			for(int col=1;col<=7; col++)
			{
				if(col==1 || col==7)
					System.out.print("* ");
				else if(row==col)
					System.out.print("* ");
				else	
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
