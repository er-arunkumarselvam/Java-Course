package arrayPrograms;

import java.util.Scanner;

public class MultiDimensional_Array {

	public static void main(String[] args) {

		MultiDimensional_Array md = new MultiDimensional_Array();
//		md.getMarks();
//		md.addMatrix();
		md.multiplyMatrix();
	}

	private void multiplyMatrix() {
		// Multiplication of Two Matrix
		int noRow,noCol,row,col;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the No. of Rows : ");
		noRow = sc.nextInt();
		System.out.print("Enter the No. of Columns : ");
		noCol = sc.nextInt();
		int[][] matrixA = new int[noRow][noCol];
		int[][] matrixB = new int[noRow][noCol];
		int[][] res= new int[noRow][noCol];
		System.out.println("Enter the Matrix-A values");
		for (row = 0; row < noRow; row++) {

			for (col = 0; col < noCol; col++) {

				System.out.print("Enter value of " + (row) + " " + (col) + " is :");
				matrixA[row][col] = sc.nextInt();

			}
		}
		System.out.println();
		System.out.println("Enter the Matrix-B values");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print("Enter value of " + (row) + " " + (col) + " is :");
				matrixB[row][col] = sc.nextInt();

			}
		}
		System.out.println();
		System.out.println("Addition of Two Matrix");
		System.out.println("Matrix-A");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print(matrixA[row][col] + "\t");

			}
			System.out.println();
		}
		System.out.println("Matrix-B");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print(matrixB[row][col] + "\t");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Result");
		for(row=0;row<noRow;row++) {
			for(col=0;col<noCol;col++)
			{
				res[row][col]= (matrixA[row][col]*matrixB[row][col])+(matrixA[row][col]*matrixB[row][col]);
				System.out.print(res[row][col]+"\t");
			}
			System.out.println();
		}
		
	}

	private void addMatrix() {
		int noRow, noCol, row, col;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No. of Rows : ");
		noRow = sc.nextInt();
		System.out.print("Enter the No. of Columns : ");
		noCol = sc.nextInt();
		int[][] matrixA = new int[noRow][noCol];
		int[][] matrixB = new int[noRow][noCol];
		int[][] result = new int[noRow][noCol];
		System.out.println("Enter the Matrix-A values");
		for (row = 0; row < noRow; row++) {

			for (col = 0; col < noCol; col++) {

				System.out.print("Enter value of " + (row) + " " + (col) + " is :");
				matrixA[row][col] = sc.nextInt();

			}
		}
		System.out.println();
		System.out.println("Enter the Matrix-B values");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print("Enter value of " + (row) + " " + (col) + " is :");
				matrixB[row][col] = sc.nextInt();

			}
		}
		System.out.println();
		System.out.println("Addition of Two Matrix");
		System.out.println("Matrix-A");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print(matrixA[row][col] + "\t");

			}
			System.out.println();
		}
		System.out.println("Matrix-B");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print(matrixB[row][col] + "\t");

			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Result");
		for (row = 0; row < noRow; row++) {
			for (col = 0; col < noCol; col++) {
				System.out.print((result[row][col] = matrixA[row][col] + matrixB[row][col]) + "\t");

			}
			System.out.println();
		}

	}

	private void getMarks() {
		// Print the Total Marks and average in particular subject
		int totalHigh = Integer.MIN_VALUE;// Find the Highest Total
		int overAllTotal = 0;
		int[][] exams = new int[3][5];
		Scanner sc = new Scanner(System.in);
		int mathsMark = 0;// Average Find Maths Mark at col=2

		for (int row = 0; row < exams.length; row++) {
			int examTotal = 0;// Find the Total marks
			for (int col = 0; col < exams[row].length; col++) {
				System.out.print("Enter Your Marks " + (row) + " " + (col) + " is : ");
				exams[row][col] = sc.nextInt();
				examTotal += exams[row][col];
				if ((row) == row && (col) == 2)
					mathsMark += exams[row][2];

			}

			System.out.println("Total Marks is :" + examTotal);// ExamTotal
			if (overAllTotal < examTotal)// Check the Total with max vaule
				overAllTotal = examTotal;// assign with max value

		}

		System.out.println("The average maths marks is: " + (mathsMark) / exams.length);// Print the average mark of
		// maths
		if (totalHigh < overAllTotal)// Compare the high total
			System.out.println("The Highest Total is " + overAllTotal);
	}

}
