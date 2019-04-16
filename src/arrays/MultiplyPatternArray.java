/**
 * DCP #2
 * Given an array of integers, 
 * return a new array 
 * such that each element at index i of the new array 
 * is the product of all the numbers in the original array except the one at i.
 * 
 * For example, if our input was [1, 2, 3, 4, 5], 
 * the expected output would be [120, 60, 40, 30, 24]. 
 * 
 * If our input was [3, 2, 1], 
 * the expected output would be [2, 3, 6].
 * 
 */

package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author BinduK
 *
 */
public class MultiplyPatternArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int[] out =  productIntWithoutIndexInt(in);
		
		System.out.print("Output array is ");
		System.out.println(Arrays.toString(out));
		
	}

	private static int[] productIntWithoutIndexInt(int[] in) {
		
		int[] o = new int[in.length];
		int product = productOfNumbers(in);
		
		for(int i=0; i<in.length; i++) {
			o[i] = (product/in[i]);			
		}
		
		return o;
		
	}

	private static int productOfNumbers(int[] in) {
		// TODO Auto-generated method stub
		
		int product=1;
		for(int i=0; i<in.length; i++) {
			product = in[i]* product;			
		}
		
		return product;
	}


}
