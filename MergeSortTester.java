//PowerPuff Girls (Connie Lei, Yedoh Kang, Donia Tugn)
//APCS2 pd1
//HW07 -- What Does the Data Say?
//2017-02-13



/*======================================
  class MergeSortTester

  ALGORITHM:
  The algorithm works using recursion and a helper method entitled merge that takes two sorted lists and merges them. The recursion in sort checks if the inputted array is less than or equal to 1. If so, it returns that array, and if not, it creates two lists of roughly half the length of the original array. Then, merge is called on the "sort" of the two halfs of the original list.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 1 
  n=10      time: 10x10
  n=100     time: 100x100
  ...
  n=<huge>  time: hugexhuge

  ANALYSIS:
  We iterate through the array on every single halve of the array, but the number of halves is determined by log base 2 of n.
  If n was equal to 8, it would mean that to split an array of 8 into 8 separate arrays of 1, you would need to do 3 halves.
  Each of the halves we do means we iterate through the entire total array, even if there are two arrays of length 4, we still
  need to go through each array of 4 to create another two arrays of 2.
  Once we have arrays of length 1, we need to merge the arrays. Everytime we merge, we iterate through the total length of
  the arrays. The number of iterations is the same as splitting up the array--log base 2 of n. Merge is a O(n) algorithm, but
  we perform O(n) log base 2 of n times.
  The sum of both the split, which is n(log base 2 of n) and the merging which is n(log base 2 of n) is 2n(log base 2 of n).
  2n(log base 2 of n) is simplified to O(n log n).

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    { long avg = 0;
      for(int x = 0; x < 20; x ++){
        MergeSort.mess(a);
        long startTime = System.nanoTime();
        MergeSort.sort(a);
        long endTime   = System.nanoTime();
        long duration  = endTime - startTime;
        avg += duration;
      }
     avg /= 20;
     System.out.println("Average time for array length " + a.length + " is " + avg);
    }//end main

}//end class
