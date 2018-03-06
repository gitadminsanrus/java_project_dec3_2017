
public class TwoDimensionalArray {

	public static void main(String[] args) {

		//10 => number of rows
		//3 => number of columns
		int studentMarks[][] = new int[10][3];
		
		studentMarks[0][0] = 87;
		studentMarks[0][1] = 95;
		studentMarks[0][2] = 90;
		
		int singleDimensionalArray[] = {1, 2, 3};
		
		studentMarks[1] = singleDimensionalArray;
		
		System.out.println("Number of rows:- " + studentMarks.length);
		System.out.println("Number of columns for Row 1:- " + studentMarks[0].length);
		System.out.println("Number of columns for Row 2:- " + studentMarks[1].length);
		System.out.println("Number of columns for Row 3:- " + studentMarks[2].length);
		
		//JAGGED Arrays
		int twoDimenJaggedArray[][] = 
			{
					{1, 2},
					{3, 4, 5},
					{10},
					{10, 20, 30, 40, 50},
					{}
			};
		

		System.out.println(twoDimenJaggedArray.length);
		System.out.println(twoDimenJaggedArray[0].length);
		System.out.println(twoDimenJaggedArray[1].length);
		System.out.println(twoDimenJaggedArray[0].length);
		
		int array[][] = new int[][]
				{
					{1, 2, 3},
					{4, 5}
				};
		
	}

}
