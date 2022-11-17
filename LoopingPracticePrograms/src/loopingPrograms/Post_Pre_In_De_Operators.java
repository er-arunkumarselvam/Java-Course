package loopingPrograms;

public class Post_Pre_In_De_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=10, no2=20;
//		System.out.println(no1++ + no2);//30
//		System.out.println(no1++ + no2++);//31
//		System.out.println(no1 + ++no2);//34
//		System.out.println(no1++ + no2--);//34
//		System.out.println(no1-- + ++no2);//35
//		System.out.println(++no1 + no2--);//35
//		System.out.println(--no1 + ++no2);//34
//		System.out.println(no1++ + --no2);//33
//		System.out.println(no1++ + ++no2);//35
//		System.out.println(--no1 + no2--);//35
//		System.out.println(no1++ + ++no1);//28
//		System.out.println(no1++ + ++no2 + --no1 + no2--);//62
		System.out.println(no1++ + ++no1 + no1-- + --no1);//44
		System.out.println(no1++ + ++no1 + no1-- + --no1 + no2++ + ++no2 + no2-- + --no2);//128
		
	}

}
