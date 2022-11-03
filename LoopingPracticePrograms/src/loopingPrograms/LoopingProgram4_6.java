package loopingPrograms;

public class LoopingProgram4_6 {

	public static void main(String[] args) {
		LoopingProgram4_6 lp = new LoopingProgram4_6();
		lp.multiply3And5(1);
		lp.multiply3Or5(1);
				
	}

	private void multiply3Or5(int no) {
		// Multiples of 3 or 5 
		while(no<=30)
		{
			if(no%3==0 || no%5==0)
			{
				System.out.println(no+ " ");
			}
			no=no+1;
		}
	}

	private void multiply3And5(int no) {
		// Multiples of 3 And 5
		while(no<=30)
		{
			if(no%3==0 && no%5==0)
			{
				System.out.print(no+ " ");
			}
			no=no+1;
		}	
		System.out.println("\n");
	}

}
