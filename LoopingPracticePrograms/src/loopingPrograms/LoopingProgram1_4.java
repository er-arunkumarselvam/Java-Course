package loopingPrograms;

public class LoopingProgram1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingProgram1_4 lp = new LoopingProgram1_4();
		lp.sameNumber(1);
		lp.diffNumber(1);
		lp.oddNumber(1);
		lp.threeTables(3);

	}

	private void threeTables(int no) {
		// Print 3 table eg:3 6 9 12 15
		while (no <= 15) {
			System.out.print(no + " ");
			no = no + 3;
		}
		System.out.println("\n");

	}

	private void oddNumber(int no) {
		// Print Odd Number Only eg:1 3 5 7 9
		while (no <= 9) {
			if (no % 2 != 0) {
				System.out.print(no + " ");
				no = no + 2;
			}
		}
		System.out.println("\n");

	}

	private void diffNumber(int no) {
		// Print different number in eg: 1 2 3 4 5
		while (no <= 5) {
			System.out.print(no + " ");
			no = no + 1;
		}
		System.out.println("\n");
	}

	private void sameNumber(int no) {
		// Print same number in eg: 1 1 1 1 1
		while (no <= 5) {
			System.out.print(1 + " ");
			no = no + 1;
		}
		System.out.println("\n");
	}

}
