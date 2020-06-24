package execrises;

//import java.util.Scanner;
public class ArrayBackward {

	//incomplete solution
	public static char[] stringReverse(char[] anArray, int x) {
		int i = anArray.length;
		if (x < i) 
		{
			char temp = anArray[x];
			anArray[x] = anArray[anArray.length - (x - 1)];
			anArray[anArray.length - (x - 1)] = temp;
			return stringReverse(anArray, x + 1);
		}
		else 
		{
			//System.out.println(anArray);
			return anArray;
		}
	}
	
	public static void main(String[] args) {
		char[] word = new String("Hello world").toCharArray();
		System.out.println(stringReverse(word,1));
	}
}
