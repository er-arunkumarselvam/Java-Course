package patternPrograms;

public class PatternPrograms {

	public static void main(String[] args) {

		PatternPrograms pp = new PatternPrograms();
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
//		pp.pattern25();
//		pp.pattern26();
//		pp.pattern27();
//		pp.pattern28();
//		pp.pattern29();
//		pp.pattern30();
//		pp.pattern31();
//		pp.pattern32();
//		pp.pattern33();
//		pp.pattern34();
//		pp.pattern35();
//		pp.pattern36();
//		pp.pattern37();
//		pp.pattern38();
//		pp.pattern39();
//		pp.pattern40();
//		pp.pattern41();
//		pp.pattern42();
//		pp.pattern43();
		pp.pattern44();

	}

	private void pattern44() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 5; col > row; col--) {
				System.out.print(" ");
			}
			for (int num = 1; num <= (row * 2) - 1; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int row = 4; row >= 1; row--) {
			for (int col = 4; col >= row; col--) {
				System.out.print(" ");
			}
			for (int num = 1; num <= (row * 2) - 1; num++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private void pattern43() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				if (row % 2 == 0)
					System.out.print("#" + " ");
				else
					System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	private void pattern42() {
		int line = 8;
		for (int row = 0; row <= line; row++) {
			int check = row <= line / 2 ? row : line - row + 1;// row>4- row = line-row+1
			for (int num = 0; num < check; num++) {
				if (num % 2 == 1)
					System.out.print("#");
				else
					System.out.print(row);

			}
			System.out.println();
		}

	}

	private void pattern41() {

		int alpha = 65;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5 - row; col++) {
				System.out.print(" " + "");// one space
			}
			for (int num = 0; num <= row - 1; num++) // num start with 0 to 5
			{
				System.out.print((char) (alpha + num) + " "); // Using Type Casting (char) (ASCII Value + Number) (int)
			}
			System.out.println();
		}

	}

	private void pattern40() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");// One Space
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + "   ");// three Space
			}
			System.out.println();
		}

	}

	private void pattern39() {

		int alpha = 65;// ASCII value start for A - Z is 65-91.
		for (int row = 0; row <= 4; row++) // start row from 0 -4
		{
			for (int num = 0; num <= row; num++) // num start with 0 to row-1
			{
				System.out.print((char) (alpha + row) + " "); // Using Type Casting (char) (ASCII Value + row) (int)
			}
			System.out.println();
		}
	}

	private void pattern38() {

		int alpha = 65;// ASCII value start for A - Z is 65-91.
		for (int row = 1; row <= 5; row++) {
			for (int num = 0; num <= row - 1; num++) // num start with 0 to 5
			{
				System.out.print((char) (alpha + num) + " "); // Using Type Casting (char) (ASCII Value + Number) (int)
			}
			System.out.println();
		}

	}

	private void pattern37() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print("*" + "   ");
			}
			System.out.println();
		}

		for (int row = 2; row <= 5; row++) // Start with row =2 to 5
		{

			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 6 - row; col >= 1; col--) {
				System.out.print("*" + "   ");// Three Space
			}
			System.out.println();
		}

	}

	private void pattern36() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 6 - row; col >= 1; col--) {
				System.out.print("*" + "   ");// Three Space
			}
			System.out.println();
		}
	}

	private void pattern35() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 6 - row; col >= 1; col--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	private void pattern34() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 6 - row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern33() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 5; col >= row; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void pattern32() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

	private void pattern31() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(" " + " ");
			}
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void pattern30() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= 6 - row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern29() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern28() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= 5; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern27() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(num + " ");
			}
			System.out.print(1 + " ");
			System.out.println();
		}

	}

	private void pattern26() {
		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row - 1; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern25() {

		int temp = 1;
		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row; num++) {
				System.out.print(temp + " ");
				temp++;
			}

			System.out.println();
		}

	}

	private void pattern24() {

		for (int row = 5; row >= 1; row--) {
			for (int num = row; num <= 5; num++) // Start num = row print first number is row , last number 5
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern23() {

		for (int row = 5; row >= 1; row--) {
			for (int num = 5; num >= row; num--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	private void pattern22() {

		for (int row = 5; row >= 1; row--) {
			for (int num = 5; num >= row; num--) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern21() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= row; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern20() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print("*" + "   ");
			}
			System.out.println();
		}
	}

	private void pattern19() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	private void pattern18() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	private void pattern17() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " ");
			}
			for (int col = row; col > 0; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern16() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(" " + " "); // Only using " " --> Space
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private void pattern15() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	private void pattern14() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

	private void pattern13() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}
	}

	private void pattern12() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 5 - row; num++) {
				System.out.print(num + " ");

			}
			System.out.print(1 + " ");
			System.out.println();
		}

	}

	private void pattern11() {
//			row-count=1 --> count(num)=row-1
//	    		5-4=1 --> num<=row-1

		for (int row = 5; row > 0; row--) // row --> 5 4 3 2 1
		{
			for (int num = 1; num <= row - 1; num++) // num<=row-1
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}

//		Another Approach

		for (int row = 1; row <= 5; row++) // row --> 1 2 3 4 5 --> row+count=5
		{
			for (int num = 1; num <= 5 - row; num++) // num<=5-row
			{
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern10() {

		for (int row = 5; row >= 1; row--) {
			for (int num = row; num >= 1; num--) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern9() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 5; num >= row; num--) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern8() {
//		 	row+count= 6 (failed)
//			last no = 5

		for (int row = 1; row <= 5; row++) {
			for (int num = row; num <= 5; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern7() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 6 - row; num++) {
				System.out.print(num * row + " ");
			}
			System.out.println();
		}
	}

	private void pattern6() {

		for (int row = 5; row >= 1; row--) {
			for (int num = 1; num <= row; num++) {
				System.out.print(row + " ");
			}
			System.out.println();

		}

	}

	private void pattern5() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 6 - row; num++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

	private void pattern4() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 5; num >= row; num--) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern3() {

		for (int row = 1; row <= 5; row++) {
			for (int num = 1; num <= 6 - row; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	private void pattern2() {

		for (int row = 1; row <= 3; row++) {
			for (int num = 1; num <= 5; num++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}

	}

	private void pattern1() {

		for (int row = 1; row <= 3; row++) {
			for (int num = 1; num <= 5; num++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
