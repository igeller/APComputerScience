
// Program:  RandomIntProcessor
// Program Description:  This program will fill an integer array
//		named randomList of size 20 with random integers between
//		-100 and +100.  It will then copy all the negative integers
//		to an array named negativeList, all the positive odd integers
//		to an array named oddList, and all the positive even integers
//		to an array named evenList.  Finally, all arrays will be printed.

// Concepts studied:

//			basic array notation and manipulation using loops
//			the physical size of an array
//			the logical size of an array

package ch10;

public class RandomIntProcessor
{
	public static void main (String[] args)
	{	
		// PART 1.  DECLARING, STORING, AND PRINTING randomList.
		// Declare and instantiate an array named randomList
		// that can hold 20 integer values.
		int randomList [] = new int [20];

		// Write a loop that will fill the entire array with random 
		// integers between -100 and +100 inclusive in randomList.
		// In the middle terminating condition of the for loop header,
		// do not use the number 20.  We might decide to change the size
		//  of the array.  Use the physical length of the array as the
		// upper limit ... randomList.length.  Use only one line of code
		// inside the loop that is an assignment statement. The left side
		// should be the particular array storage location and the right
		// side should have the code to generate the random integer.
		for(int i = 0; i < randomList.length; i++)
		{
			randomList[i] = (int) (Math.random()*200 - 100);
		}


		System.out.println();
		System.out.println();


		// Write a for loop to display all the random integers in the
		// array separated by two blank spaces ... ALL ON ONE LINE.
		// They will be displayed in the order they are stored in
		// the array. Again, just as you did before, when writing
		// the middle terminating condition of the for loop header,
		// do not use the number 20.  Use the physical length of the
		// array as the upper limit of the loop.
		for (int i = 0; i < randomList.length; i++)
		{
			System.out.print(randomList[i] + "  ");
		}

		
		
		// STOP AND RUN THE PROGRAM AND SEE THE VALUES IN randomList.
		
		// PART 2.  COPYING THE VALUES OF randomList TO EITHER
		// evenList, oddList, or negativeList.
		System.out.println();
		System.out.println();

		// Declare and instantiate an array named evenList
		// that can hold up to 20 integer values.
		int evenList [] = new int [20];

		// Declare and instantiate an array named oddList
		// that can hold up to 20 integer values.	
		int oddList[] = new int [20];

		// Declare and instantiate an array named negativeList
		// that can hold up to 20 integer values.
		int negativeList [] = new int [20];

		// Declare and initialize integer variables evenCount to zero,
		// oddCount to zero, and negativeCount to zero.
		// These variables will track the number of values stored in the
		// arrays evenList, oddList, and negativeList.
		int evenCount = 0;
		int oddCount = 0;
		int negativeCount = 0;

		// Write a for loop that will copy each value from randomList to
		// one of the three other lists.  All negative integers will be
		// copied to the array negativeList.  All positive odd integers
		// will be copied to the array oddList.  (ASSUME 0 IS POSITIVE!)
		// All positive even integers will be copied to the array evenList.
		// Once the process is over the original values will still remain
		// in randomList.  Again, just as you did before, when writing the
		// middle terminating condition of the for loop header, do not use
		// the number 20.  Use the physical length of the randomList array
		// as the upper limit of the loop.
		
		/*for (int i = 0; i < randomList.length; i++)
		{
			//randomList[i] = (int) (Math.random()*200 - 100);
			
			if (randomList[i] < 0)
			{
				negativeList[negativeCount] = randomList[i];
				negativeCount++;
			}
			else if (randomList[i] >= 0)
			{
				
				if (randomList[i] % 2 == 0)
				{	
					evenList[evenCount] = randomList[i];
					evenCount++;
				}
				else  
				{
					oddList[oddCount] = randomList[i];
					oddCount++;
				}
			}
		}*/
		
		for (int element: randomList)
		{
			if (element > 0 && element % 2 == 0)
			{
				evenList[evenCount] =  element;
				evenCount++;
			}
			else if (element > 0 && element %2 != 0)
			{
				oddList[oddCount] = element;
				oddCount++;
			}
			else if (element > 0 )
			{
				negativeList[negativeCount] = element;
				negativeCount++;
			}
			
		}
		
		
		// IMPORTANT NOTE:  this process will not work correctly unless you
		// update the logical size variable negativeCount every time a value
		// is copied to negativeList, and update the logical size variable
		// oddCount every time a value is copied to oddList, and update the
		// logical size variable evenCount every time a value is copied to evenList.
	
		
	

		
		
		
		// PART 3. PRINTING ONLY THE VALID VALUES IN THE THREE NEW LISTS.
		
		// Write a for loop that will print all the values stored only in
		// the portion of evenList that contains valid values.  To do this,
		// use the variable evenCount as the upper limit of the for loop
		// termination condition instead of the physical size evenList.length.
		// Make sure you print two blank spaces between each integer.
		System.out.print("Even list:  ");
		/*for (int i = 0; i < evenCount; i++)
		{	
			System.out.print(evenList[i]+ "  ");
		}*/
		
		for (int element : randomList)
			System.out.print(element + "  ");

		
		
		System.out.println();
		System.out.println();
		System.out.println();


		// Write a for loop that will print all the values stored only in
		// the portion of oddList that contains valid values.  To do this,
		// use the variable oddCount as the upper limit of the for loop
		// termination condition instead of the physical size oddList.length.
		// Make sure you print two blank spaces between each integer.
		System.out.print("Odd List:  ");
		for(int i = 0; i < oddCount; i++)
		{
			System.out.print(oddList[i] + "  ");
		}
		


		System.out.println();
		System.out.println();
		System.out.println();

		// Write a for loop that will print all the values stored only in
		// the portion of negativeList that contains valid values.  To do this,
		// use the variable negativeCount as the upper limit of the for loop
		// termination condition instead of the physical size negativeList.length.
		// Make sure you print two blank spaces between each integer.
		System.out.print("Negative List:  ");
		for(int i = 0; i < negativeCount; i++)
		{
			System.out.print(negativeList[i] + "  ");
		}
		
		
		
		// STOP AND RUN THE PROGRAM AND SEE THE VALUES IN THE THREE LISTS.
		
		
		// PART 4. PRINTING ALL OF THE VALUES IN THE THREE NEW LISTS (VALID AND INVALID).
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Copy and paste the code from above that will print the values in randomList.
		/*System.out.print("Here is the random list:   ");
		for (int i = 0; i < randomList.length; i++)
		{
			System.out.print(randomList[i] + "  ");
		}*/
		
		for (int element: randomList)
			System.out.println(element + "  ");
		
		
		System.out.println();
		System.out.println();
		
		
		// Write a for loop that will print all the values stored in all 
		// memory locations of the evenList array, even the the values outside
		// of the logical size of the array.  In other words, use the physical
		// size evenList.length as the upper limit of your for loop.
		// Make sure you print two blank spaces between each integer.
		System.out.print("Even list:  ");
		/*for (int i = 0; i < evenList.length; i++)
		{	
			System.out.print(evenList[i]+ "  ");
		}*/
		
		for (int element: evenList)
			System.out.println(element + "  ");
		
		

		System.out.println();
		System.out.println();


		// Write a for loop that will print all the values stored in all 
		// memory locations of the oddList array, even the the values outside
		// of the logical size of the array.  In other words, use the physical
		// size oddList.length as the upper limit of your for loop.
		// Make sure you print two blank spaces between each integer.
		System.out.print("\nOdd List:  ");
		/*for(int i = 0; i < oddList.length; i++)
		{
			System.out.print(oddList[i] + "  ");
		}*/
		
		for (int element: oddList)
			System.out.println(element + "  ");
		


		System.out.println();
		System.out.println();


		// Write a for loop that will print all the values stored in all 
		// memory locations of the negativeList array, even the the values outside
		// of the logical size of the array.  In other words, use the physical
		// size negativeList.length as the upper limit of your for loop.
		// Make sure you print two blank spaces between each integer.
		System.out.print("\nNegative List:  ");
		/*for(int i = 0; i < negativeList.length; i++)
		{
			System.out.print(negativeList[i] + "  ");
		}*/
		
		for (int element: negativeList)
			System.out.println(element + "  ");
		
	}
}
