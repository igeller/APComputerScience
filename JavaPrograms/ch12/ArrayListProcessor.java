// FileName:  ArrayListProcessor.java
// This program fills an ArrayList with random Integer values
//	between -100 and 100 inclusive and then copies the values
// out of the list to four different lists:  positive evens,
// positive odds, negative evens, and negative odds.

/* ArrayList Operations performed:

	size()  returns an int value representing the logical size of the list
	
	add(obj) adds obj at the end of the list
	
	get(i)  returns a copy of an object in the list but doesn't remove it
	
	add(i, obj)  adds obj at index i and shifts all values to right down by one
	
	remove(i)   removes the object at index i and returns it
	
	set(i, obj)  replaces the object at index i with obj and returns the replaced object

 */
package ch12;
import java.util.ArrayList;

public class ArrayListProcessor
{
	public static void main (String[] args)
	{
		// PART 1.  THE BASICS.
			
		// Declare and instantiate an ArrayList named randomList
		// that can hold integer values.
		ArrayList <Integer> randomList = new ArrayList<Integer> ();

		// Write a loop that will store 20 random integers.
		// Since the logical size of the ArrayList is zero, because we have not added
		// values to the list, we need to use the number 20 as the upper limit of the loop,
		// since we intend on adding 20 integers to the list.  DON'T USE randomList.size();
		// Fill randomList with random integers between -100 and +100 inclusive.  To do this
		// generate the random integer and then call the ArrayList method add(obj) that will
		// add each integer to the end of the list.
		for (int i = 0; i < 20; i++)
		{
			int r = (int)(Math.random()*201 - 100);
			randomList.add(r);
		}
		
 
		System.out.println();
		System.out.println();

		System.out.print("Here is the random list:   ");
		// Stop and write the method printList at the bottom of this program and
		// then call the method to print randomList after the following statement ...
		printList(randomList);
		

		System.out.println();
		System.out.println();

		
		// Declare and instantiate an ArrayList named posEvenList that will hold
		// positive even integer values.
		ArrayList <Integer> posEvenList = new ArrayList <Integer> ();

		// Declare and instantiate an ArrayList named posOddList that will hold
		// positive odd integer values.	
		ArrayList <Integer> posOddList = new ArrayList <Integer>();

		// Declare and instantiate an ArrayList named negEvenList that will hold
		// negative even integer values.
		ArrayList <Integer> negEvenList = new ArrayList <Integer> ();

		// Declare and instantiate an ArrayList named negOddList that will hold
		// negative odd integer values.
		ArrayList <Integer> negOddList = new ArrayList <Integer> ();

		// Write a for loop that will copy each value from randomList and add it
		// to the end of one of the four other lists ...
		//   all positive even integers will be copied to the ArrayList posEvenList.
		//   all positive odd integers will be copied to the ArrayList posOddList.
		//   all negative even integers will be copied to the ArrayList negEvenList.
		//   all negative odd integers will be copied to the ArrayList negOddList.
		// Once the process is over the original values will still remain in randomList.
		// When writing the middle terminating condition of the for loop header,
		// DO NOT USE THE NUMBER 20, but use the randomList's logical size.  Now it
		// is ok to call the size() method because randomList has been filled.
		// ALSO, IN YOUR LOOP YOU MUST USE AN EXTENDED IF STATEMENT THAT DOES NOT HAVE
		// A FINAL ELSE BRANCH.  THE FINAL BRANCH MUST BE AN ELSE IF!
		for (int i = 0; i < randomList.size(); i++)
		{
			int x = randomList.get(i); //you can use x even in the if statements
			if (randomList.get(i) > 0 && randomList.get(i) % 2 == 0)
				posEvenList.add(x);
			else if (randomList.get(i) > 0 && randomList.get(i) % 2 != 0)
				posOddList.add(x);
			else if (randomList.get(i) < 0 && randomList.get(i) % 2 == 0)
				negEvenList.add(x);
			else if (randomList.get(i) < 0 && randomList.get(i) % 2 != 0)
				negOddList.add(x);
		}

		


		System.out.print("Here is the positive even list:  ");
		// Call the method printList to print the posEvenList.
		printList(posEvenList);
		

		System.out.println();		System.out.println();

		System.out.print("Here is the positive odd list:  ");
		// Call the method printList to print the posOddList.
		printList(posOddList);

		

		System.out.println();		System.out.println();
		
		System.out.print("Here is the negative even list:  ");
		// Call the method printList to print the negEvenList.
		printList(negEvenList);

		

		System.out.println();		System.out.println();

		System.out.print("Here is the negative odd list:  ");
		// Call the method printList to print the negOddList.
		printList(negOddList);

		

		System.out.println();		System.out.println();

		System.out.print("Here is the original random list:   ");
		// Call the method printList and pass it randomList to verify that
		// the original integers are still in randomList.
		printList(randomList);
		

		System.out.println();		System.out.println();

		// Part 2. Special Fun Stuff!!!!

		// Write the code to replace all of the negative integers in randomList
		// with the integer zero and then print randomList.  Discuss with your
		// neighbor how the set(i, obj) method can be used to do this and use it.
		for (int i = 0; i < randomList.size(); i++)
		{
			if (randomList.get(i) < 0)
				randomList.set(i, 0);
		}
		
		
		

		System.out.print("Here is random list after replacing negative values with 0: ");
		// Call the method printList to print the modified randomList.
		printList(randomList);

		

		System.out.println();		System.out.println();

		// Write a while loop to delete all integers above 50 in randomList and then
		// print randomList.  Use index instead of i for the loop control variable.
		// Hint:  what should the starting value of index be when you declare it based
		// on the location of the first value in randomList?
		int index = 0;
		while (index < randomList.size())
		{
			if (randomList.get(index) > 50)
				randomList.remove(index);
			else
				index++;
		}
		
		System.out.print("Here is random list after removing all value above 50: ");
		// Call the method printList to print the modified randomList.
		printList(randomList);
	

		System.out.println();		System.out.println();

		
		
		// Write one line of code to add the integer 500 to the end
		// of randomList using the add(i, obj) method.
		randomList.add(randomList.size(), 500);

		
		System.out.print("Here is random list after adding 500 to the end: ");
		// Call the method printList and pass it randomList.
		printList(randomList);

		System.out.println();		System.out.println();

		// Write one line of code to add the integer 102 to the beginning
		// of posEvenList using the add(i, obj) method.
		posEvenList.add(0, 102);
		
		
		System.out.print("Here is the positive even list after adding 102 to the beginning: ");
		// Call the method printList to print posEvenList.
		printList(posEvenList);
		

		System.out.println();		System.out.println();

		// Write one line of code to add the integer 101 to the end
		// of posOddList using the add(i, obj) method.
		posOddList.add(posOddList.size(), 101);

		System.out.print("Here is the positive odd list after adding 101 to the end: ");
		// Call the method printList to print posOddList.
		printList(posOddList);
		

		System.out.println();		System.out.println();

		// Write one line of code to add the integer -101 to the beginning
		// of negOddList using the add(i, obj) method.
		negOddList.add(0, -101);	

		System.out.print("Here is the negative odd list after adding -101 to the beginning: ");
		// Call the method printList to print negOddList.
		printList(negOddList);
		
		
		System.out.println();		System.out.println();
		
		// Write one line of code to add the integer -102 to the end
		// of negEvenList using the add(i, obj) method.
		negEvenList.add(negEvenList.size(), -102);

		
		System.out.print("Here is the negative even list after adding -102 to the end: ");
		// Call the method printList to print negEvenList.
		printList(negEvenList);
		
		
		System.out.println();
		System.out.println("Program Terminated.");
		
	} // end of main method

	
	// Write the method printList that is a void method that receives one parameter
	// named nums that is an ArrayList that holds Integer objects.  It should have
	// a for loop to display all of the integers in whatever list is passed to it.
	// DO NOT USE 20 AS THE UPPER LIMIT OF THE LOOP.  Use the logical size of nums.
	// All numbers should be printed on one line right justified with a field with of 4.
	public static void printList (ArrayList<Integer> nums)
	{
		for(int i = 0; i < nums.size(); i++)
		{
			System.out.printf("%4d", nums.get(i));
		}
	}
	
	
	/*
	 * for(Integer element: nums)
	 * {
	 * 		System.out.printf("%4d", element);
	 * }
	 */
	
	
	
	
} // end of ArrayListProcessor class