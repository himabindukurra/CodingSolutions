/**
 * DCP #149
 * 
 * Given a list of numbers L, 
 * implement a method sum(i, j) 
 * which returns the sum from the sublist L[i:j] 
 * (including i, excluding j).
 * 
 * For example, 
 * given L = [1, 2, 3, 4, 5], sum(1, 3) 
 * should return sum([2, 3]), which is 5.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author BinduK
 *
 */
public class SumOfRequiredNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of elements in an array");
		
		int n = s.nextInt();
		int out =0;
		int[] in = new int[n];
		
		System.out.println("Enter elements in the array");
		
		for(int i=0; i<n; i++) {
			in[i] = s.nextInt();
		}
		
		int[] sum = new int[2];
		
		System.out.println("enter the lower and upper index for the sum required");
		
		for(int i=0; i<2;i++) {
			sum[i] = s.nextInt();
		}
		
		Arrays.parallelSort(sum);
		
		if(sum[1] <= n && (sum[0] < sum[1])) {
			out = sumOfRequiredIndexes(in,sum);			
			System.out.println("the sum of required indices is "+out);
		}
		
		else {
			System.out.println("Invalid upper or lower index");
		}
				
		s.close();
		
		
	}

	private static int sumOfRequiredIndexes(int[] in, int[] sum) {
		
		int out =0;
		
		for(int i=sum[0]; i<sum[1]; i++) {
			
				out = in[i] + out;
			
		}
		
		return out;
	}

}
