package codewar;
import java.util.ArrayList;
public class ArrayListTutorial 
{

	public static void main(String[] args) 
	{
		//int[] sampleArray = new int[5];
		//operations: set, clear, add, remove
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);
		//5 above is the initial size
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(10);
		myList.add(25);
//		myList.add(33);
		
		//size tells the number of elements contained in the array
		
		for (Integer x : myList)
		{
			System.out.println(x);
		}
		
		System.out.println("Size = " + myList.size());
		
		//remove method an element at index two which is element 3
		myList.remove(2);
		
		for (Integer x : myList)
		{
			System.out.println(x);
		}
		
		System.out.println("Size becomes " + myList.size());
		
		//to change some value in the array like value 1 in index 0 to 100
				myList.set(0, 100); //index and value respectively
				
				for (Integer x : myList)
				{
					System.out.println(x);
				}
				
				System.out.println("Size becomes " + myList.size());
				
				System.out.print(myList.get(3));
		
		//a method to clear al the values from the arraylist
//		myList.clear();
//		
//		for (Integer x : myList)
//		{
//			System.out.println(x);
//		}
//		
//		System.out.println("Size becomes after clear - " + myList.size());
//	
		myList.trimToSize(); //not working dugbuai...
		//System.out.println(myList.trimToSize(2));
	}
}
