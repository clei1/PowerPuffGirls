//PowerPuff Girls (Connie Lei, Yedoh Kang, Donia Tung)
//APCS2 pd1
//HW07 -- What Does the Data Say?
//2017-02-15

/*======================================
  class MergeSortTester

  ALGORITHM:
  The algorithm works using recursion and a helper method entitled merge that takes two sorted lists and merges them. 
  The recursion in sort checks if the inputted array is less than or equal to 1. 
  If so, it returns that array, and if not, it creates two lists of roughly half the length of the original array. 
  Then, merge is called on the "sort" of the two halfs of the original list.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: 10000000
  n=1       time: 17, 17, 17
  n=10      time: 508, 509, 508
  n=100     time: 5989, 6068, 6061
  ...
  n=<huge>  time: huge * (log base 2 of huge)

  ANALYSIS:
  We iterate through the array on every single half of the array, but the number of halves is determined by log base 2 of n.
  If n was equal to 8, it would mean that to split an array of 8 into 8 separate arrays of 1, you would need to split it in half 3 times.
  Each of the splits requires us to iterate through the entire total array, even if there are two arrays of length 4, we still need to go through each array of 4 to create another two arrays of 2.
  Once we have arrays of length 1, we need to merge the arrays. Everytime we merge, we iterate through the total length of the arrays. 
  The number of iterations is the same as splitting up the array--log base 2 of n. Merge is a O(n) algorithm, but we perform O(n) log base 2 of n times.
  The sum of both the splitting, which is n(log base 2 of n), and the merging, which is n(log base 2 of n), is 2n(log base 2 of n).
  2n(log base 2 of n) is simplified to O(n log n).

  =======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     Depending on the lengths of arrays we wanted to choose, we put those lengths into an int[] array and then, populate an array with numbers, then mess up the array,
     start the timer, run the sort program, end the timer and then average it all.
     ******************************/
    public static void main( String[] args ) {
	int[] lengths = {1, 8, 10, 16, 25, 100};
	for(int length : lengths){
	    int[] a = new int[length];
	    for(int r = 0; r < a.length; r ++){
		a[r] = r;
	    }
	    long avg = 0;
	    int numTest = 10000000;
	    for(int x = 0; x < numTest; x ++){
		MergeSort.mess(a);
		long startTime = System.nanoTime();
		MergeSort.sort(a);
		long endTime   = System.nanoTime();
		long duration  = endTime - startTime;
		avg += duration;
	    }
	    avg /= numTest;
	    System.out.println("Average time for array length " + a.length + " is " + avg);
	}
    }//end main

}//end class
