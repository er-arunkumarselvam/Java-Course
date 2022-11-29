package arrayPrograms;

import java.util.Scanner;

public class MarkList {
	
	public static void main(String[] args) {
		
		MarkList ml = new MarkList();
		ml.markSheet();

	}

	private void markSheet() {
		System.out.println("Mark Sheet");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
//		System.out.print("Enter Your Class (SSLC/HSC) : ");
//		String cls=sc.next();
//		if(cls =="SSLC")
//			System.out.print("Enter your 5 of Subjects marks. ");
//		else if("HSC"==cls)
//			System.out.print("Enter your 6 of Subjects marks. ");
//		else
//			System.out.println("Please Enter Valid Class (SSLC or HSC).");
		System.out.print("Enter your subjects :");
		int count = sc.nextInt();
		int[] marks= new int[count];
		int total =0;
		for(int i=0;i<marks.length;i++)
		{	//if(marks[i]<=1) {
			System.out.print("Enter your marks : ");
			marks[i]=sc.nextInt();
			total += marks[i];//total=total+mark[i];
			//}
//			else
//				System.out.println("Please valid marks (0-100)");
			
		}
		float percentage=(total/(float)count);
		//System.out.println("Welcome "+name+" , Your "+cls+" Mark Sheet");
		System.out.println("Total Mark is "+total);	
		System.out.println("Your Overall Percentage is "+percentage+"%");
		
		
	}

}
