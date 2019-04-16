/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/

package algorithm;

import java.util.Arrays;
import java.util.List;

public class sumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = Arrays.asList(-1,-2,4,6);
		int[] primitive = number.stream()
				.mapToInt(Integer::intValue)
				.toArray();
	
		boolean isFound = sumOfNumberEqualTok(primitive,4);
		printMessage(isFound);
		isFound = sumOfNumberEqualTok(primitive,0);
		printMessage(isFound);

	}

	private static boolean sumOfNumberEqualTok(int[] noArray, int k) {
		// TODO Auto-generated method stub
		
		Arrays.sort(noArray);
				
		for(int i=0; i< noArray.length-1; i++) {
			for(int j=1; j< noArray.length; j++) {
				if(noArray[i]+noArray[j] == k)
					return true;
				else
					continue;
			}
		}
		return false;
		
	}
	
	private static void printMessage(boolean t) {
		System.out.println("Two numbers from the list add up to k "+t);
	}
	
	
}
