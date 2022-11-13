package tamilnadu.chennai;

public class Factorial_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial_Recursion fr = new Factorial_Recursion(); 
		int factorial = fr.find_fact(6);
		System.out.println(factorial);

	}

	int find_fact(int no) {
		if (no == 1)
			return 1;
		else
			return no * find_fact(no - 1);
	}


}
