public class SingleDimensionArrayDemo {

	public static void main(String[] args) {
		
		//single variable
		int course;
		
		//1st way of creating a single dimension array
		//declaring an array of marks
		int marks[];
		
		//array object creation and assigning to marks[] array variable
		marks = new int[5];
		
		//writing or assigning values to each cell of an array
		marks[0] = 80;
		marks[1] = 81;
		marks[2] = 82;
		marks[3] = 83;
		marks[4] = 84;
		
//		marks[-1] = 85; => will throw java.lang.ArrayIndexOutOfBoundsException
		
		//reading the values from array
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		

		//2nd way of creating a single dimension array
		int array[] = {1, 2, 3, 4, 5, 6};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		
		//3rd way
		int array1[] = new int[] {10, 20, 30};
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		
		
		System.out.println("Length of marks array object is:- " + marks.length);
		System.out.println("Length of array object is:- " + array.length);
		System.out.println("Length of array1 object is:- " + array1.length);

	}

}
