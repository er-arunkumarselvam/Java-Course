package arrayPrograms;

import java.util.Scanner;

public class ArrayPrograms {

	public static void main(String[] args) {
		
		ArrayPrograms ap=new ArrayPrograms();
		ap.find_first_repeated_element_array();

	}

	private void find_first_repeated_element_array() {
		// Find the first repeated element in an array
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
		char[] check=name.toCharArray();	
		boolean repeat=false;
		for(int j=0;j<check.length-1;j++)
		{
		char key=check[j];
		for(int i=j+1;i<check.length;i++)
		{
			if(key==check[i])
			{
				System.out.println("First repeated element is "+check[i]);
				repeat=true;
				break;
			}
			
		}
		if(repeat==true)
		{
			break;
		}
		}
		
		
	}

}
