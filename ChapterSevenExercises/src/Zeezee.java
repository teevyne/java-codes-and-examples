import java.util.Arrays;

public class Zeezee {
	public static void main (String[] args) {
		int[] students = new int[2];
		int[] cohortThree = {2, 4, 6, 8, 1, 3};
		System.out.println(Arrays.toString(students));
		System.out.println(Arrays.toString(cohortThree));
		System.out.println(students);
		System.out.println(cohortThree);
	}
}

//Declaring - type[] arrayName;
//Default Initialising - type[] arrayName = keyword.new type[arrayLength];
//Actual initialisation - type[] arrayName = { elements };
//The above are one-dimensional arrays