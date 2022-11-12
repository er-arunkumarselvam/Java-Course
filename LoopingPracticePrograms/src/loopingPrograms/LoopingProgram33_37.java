package loopingPrograms;

public class LoopingProgram33_37 {

	public static void main(String[] args) {
		
		LoopingProgram33_37 lp = new LoopingProgram33_37();
		//lp.numberSeries(1);
		//lp.cubeSeries(1,1);
		//lp.squareSeries(1,1);
//		lp.find_power(1);
		//lp.powerSeries(1,1);
		//lp.power_series(1,1);
		//lp.addSeries(1,0);
		//lp.tableSeries(1,10);
		//lp.table_series(1,1);
		lp.printSeries(10);
		
		
	}
	
	private void printSeries(int no1) {
		// print series 10 18 24 28 30
		int rem=0;
		int no2=no1-2;
		while(rem<=30)
		{
			
			
		}
		
	}

	private void table_series(int no1, int no2) {
		// Printing series 1*2 2*3 3*4 4*5 5*6
		int rem;
		while(no1<=5)
		{
		rem=no1+no2; //2
		System.out.print(no1 + "*" +rem+" ");//1*2
		System.out.println(no1+"*"+rem+"="+(no1*rem));
		no1=rem;//2
		}
	}

	private void find_power(int no) {
		// one method to find Power of Numbers - 1 4 27 256 (assign the value using while loop)
		
		while(no<=4){

		int power=no;
		int num=no;
		while (power>1)
		{
		num=no* num;
		power=power-1;
		}
		System.out.print(num+" ");
		no=no+1;
		} 
	}
	
	private void power_series(int no, int power) {
		// another method to find Power of Numbers - 1 4 27 256 (using for loop)
		 System.out.print("Series is : ");
		 for (no=1;no<5;no++)
		 {
		  int count=1;
		  for (power=1;power<=no;power++)
		  {
		   count=count*no;
		  }
		  System.out.print(count+" ");
		 }
		
	}

	private void tableSeries(int no1, int no2) {
		// Printing 1*10 2*9 3*8 4*7 5*6
		int result;
		while(no1<=5)
		{
		System.out.print(no1+"*"+no2+"\t");//1 * 10
		result=no1*no2;
		System.out.println(no1+"*"+no2+"="+result);
		no1=no1+1;//2
		no2=no2-1;//9
		
		}
		
	}

	private void addSeries(int no1, int no2) {
		// Printing 1 2 4 7 11 16
		while(no2<6)
		{
		no1=no1+no2; //1+0 =1
		System.out.print(no1+"\t"); // 1
		no2=no2+1; // 0+1 =1
		}
		
	}

	

	private void powerSeries(int no, int power) {
		// TODO Auto-generated method stub
		int count=1;
		while(no<5)
		{
			
			while(power<=no)
			{
				
				count=count*no;
				power=power+1;
			}
		no=no+1;
		}
		System.out.print(count+"\t"); 
	}
	

	private void squareSeries(int no, int square) {
		// print square series 1 4 9 16 25 36 49 64 81 100
		while(no<=10)
		{
		square=no*no; //1
		System.out.print(square+" ");
		no=no+1; //2
		}
		
	}

	private void cubeSeries(int no, int cube) {
		// Print cube series 1 8 27 64 125
		while(cube<125)
		{
		cube=no*no*no; //1
		System.out.print(cube+"\t");
		no=no+1;
		}
		
	}

	private void numberSeries(int no) {
		// Print 1 11 121 1331
				while(no<=1331)
				{
				System.out.print(no+"\t"); //1
				no=no*11; //11
				}
		
	}
	

}
