package snippet;

public class Controller {

	public static void main(String[] args) {

		MultiDimensionArray multiArr = new MultiDimensionArray();
		int[][] matrix=multiArr.setArray();
				multiArr.getArray(matrix);
		System.out.println("Sum of Matrix is: "+multiArr.sum(matrix));

	}

}
