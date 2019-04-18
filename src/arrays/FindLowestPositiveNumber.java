/* DCP #4
 * Given an array of integers, 
find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. 
The array can contain duplicates and negative numbers as well.

For example, 
the input [3, 4, -1, 1] should give 2. 
The input [1, 2, 0] should give 3.

*/

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindLowestPositiveNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter no. of elements in an array");
		int n = s.nextInt();
		int[] in = new int[n];
		
		System.out.println("Enter all the elements:");
		for(int i = 0; i < n; i++)
        {
            in[i] = s.nextInt();
           
        }
		
		System.out.print("Input array is ");
		System.out.println(Arrays.toString(in));
		
		Arrays.parallelSort(in);
		
		System.out.print("Sorted input array is ");
		System.out.println(Arrays.toString(in));
		
		int missingInt =  missingPositiveNumberInSequence(in);
		
		System.out.print("Missing Positive Number in sequence is ");
		System.out.println(missingInt);
		
	}

	private static int missingPositiveNumberInSequence(int[] in) {
		// TODO Auto-generated method stub
		
		int count = 0,sum=0;
		for(int i=0; i < in.length; i++) {			
			if(in[i]>=0) {
				++count;
				sum = in[i]+sum;
			}			
		}
		
		System.out.println("Sum of natural numbers in loop "+sum);
		System.out.println("Number of positive no. "+count);
		
		int sumOfNumbers = ((count)*(count+1))/2;
		System.out.println("Sum of N natural numbers "+sumOfNumbers);
		
		
		return Math.abs(sum-sumOfNumbers);
	}

}
