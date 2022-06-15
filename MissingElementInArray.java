package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main (String[] args) {
	int[] arr = {1,2,3,4,7,6,8};
	           //0,1,2,3,4,5,6
	Arrays.sort(arr);
	int length = arr.length;
	int temp = 1;
	for (int i = 0; i<length; i++) 	{
		if (i + temp != arr[i]) 
		  /*0 + 1 != arr[0] > 1 != 1
	        1 + 1 != arr[1] > 2 != 2	
	        2 + 1 != arr[2] > 3 != 3
	        3 + 1 != arr[3] > 4 != 4
	        4 + 1 != arr[4] > 5 != 6
	        5 + 2 != arr[5] > 7 != 7
	        6 + 2 != arr[6] > 8 != 8*/
		{
			System.out.println(i + temp);
			temp++;
			
		}
		
	}	
	}
}