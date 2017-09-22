package snippet;

import java.util.Scanner;

public class MultiDimensionArray {

	public int[][] setArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter no of columns: ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Row [" + i + "]:  Column [" + j + "] :");
				matrix[i][j] = sc.nextInt();
			}
		}	
		sc.close();
		return matrix;
	}

	public void getArray(int[][] matrix) {	
	int row=matrix.length ;// row
		int column=matrix[0].length;
		 String str = "|\t";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				  str += matrix[i][j] + "\t";
				 System.out.println(str + "|");
		            str = "|\t";
			}
		}
	}
	
	public long sum(int[][] matrix){
		long sum=0;
		int row=matrix.length ;// row
		int column=matrix[0].length;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				
				
				sum+=matrix[i][j];
			}
					
			}
		return sum;
	}
}