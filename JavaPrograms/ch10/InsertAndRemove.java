package ch10;
// This program gives you a chance to write the code that will
// shift values in a standard array when a value is inserted
// in the array or when a value is deleted.
// There is no code to write in the main() method.  Do NOT change
// any of this code.  You will write code in the two methods named
// insertItem() and removeItem().
// NOTE:  The main method handles the work of tracking the logical
// size of the array.  You don't need to increment or decrement the
// logical size when writing the code for insertItem() and removeItem(). 
public class InsertAndRemove
{
	public static void main(String[] args) 
	{
		// Create and initial array with 3 positions
		String [] names = new String [3];
		int logicalSize = 0;
		boolean successful = false;
		
		// Insert persons at positions 0, 1, 1, and 0
		
		System.out.println("Ann is being inserted into the array.");
		successful = insertItem(names, logicalSize, 0, "Ann");
		if (successful)
			logicalSize++;
		else
			System.out.println("Ann was NOT inserted into the array.");
		
		printArray(names, logicalSize);
		
		System.out.println("Bob is being inserted into the array.");
		successful = insertItem(names, logicalSize, 1, "Bob");
		if (successful)
			logicalSize++;
		else
			System.out.println("Bob was NOT inserted into the array.");
		
		printArray(names, logicalSize);
		
		System.out.println("Carl is being inserted into the array at index 1.");
		successful = insertItem(names, logicalSize, 1, "Carl");
		if (successful)
			logicalSize++;
		else
			System.out.println("Carl was NOT inserted into the array.");
		
		printArray(names, logicalSize);
		
		System.out.println("Trying to insert Danielle into the array.");
		successful = insertItem(names, logicalSize, 0, "Danielle");
		if (successful)
			logicalSize++;
		else
			System.out.println("Danielle was NOT inserted into the array.  The array is FULL!");
			
		printArray(names, logicalSize);	
		
		System.out.println("Attempting to remove the person at index 0 ...");
		successful = removeItem(names, logicalSize, 0);
		if (successful)
		{
			logicalSize--;
			System.out.println("Removal was successful.");
		}
		else
			System.out.println("NO ONE WAS REMOVED!");
		
		printArray(names, logicalSize);
			
		System.out.println("Attempting to remove the person at index 1 ...");
		successful = removeItem(names, logicalSize, 1);
		if (successful)
		{
			logicalSize--;
			System.out.println("Removal was successful.");
		}
		else
			System.out.println("NO ONE WAS REMOVED!");
		
		printArray(names, logicalSize);
		
		System.out.println("Attempting to remove the person at index 1 ...");
		successful = removeItem(names, logicalSize, 1);
		if (successful)
		{
			logicalSize--;
			System.out.println("Removal was successful.");
		}
		else
			System.out.println("NO ONE WAS REMOVED!  INDEX OUT-OF-BOUNDS!");
		
		printArray(names, logicalSize);
		
		System.out.println("Attempting to remove the person at index 0 ...");
		successful = removeItem(names, logicalSize, 0);
		if (successful)
		{
			logicalSize--;
			System.out.println("Removal was successful.");
		}
		else
			System.out.println("NO ONE WAS REMOVED!");
		
		printArray(names, logicalSize);
		
		System.out.println("Attempting to remove the person at index 0 ...");
		successful = removeItem(names, logicalSize, 0);
		if (successful)
		{
			logicalSize--;
			System.out.println("Removal was successful.");
		}
		else
			System.out.println("NO ONE WAS REMOVED! INDEX OUT-OF-BOUNDS!");
		
		printArray(names, logicalSize);
		
	} // end main method
	
	// FINISH THE LINES OF CODE AS INSTRUCTED IN THIS METHOD.
	public static boolean insertItem (String [] array, int logicalSize, int targetIndex, String newItem)
	{
		// Check for a full array and return false if full
		if (logicalSize == array.length)
			return false;
		
		// Check for valid target index and return false if not valid
		if (targetIndex < 0 || targetIndex > logicalSize)
			return false;
		
		// Shift items up by one position if shifting is required.
		// This loop is not needed if adding at the logical size (the end).
		for (int i = logicalSize; i > targetIndex ; i--)
			array [i] = array[i-1];
		
		// Add new item and return true (logical size incremented in main)
		array [targetIndex] = newItem;
		return true;
	} //end insertItem
	
	
	// FINISH THE LINES OF CODE AS INSTRUCTED IN THIS METHOD.
	public static boolean removeItem (String [] array, int logicalSize, int targetIndex)
	{
		// Check for valid target index and return false if not valid
		if (targetIndex < 0 || targetIndex > logicalSize - 1)
			return false;
		
		// Shift items down by one position using a count-up loop, except
		// when the last value is being removed.
		for (int i = targetIndex; i < logicalSize-1; i++)
			array[i] = array [i+1];
			
		// return true if above loop is executed;
		return true;
		
	} // end removeItem
	
	
	//NO CODE TO WRITE!
	public static void printArray (String [] array, int logicalSize)
	{
		System.out.println();
		System.out.println("The logical size is " + logicalSize);
		System.out.println();
		System.out.print("The persons in the array are: ");
		for (int i = 0; i < logicalSize; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

} // end of class
