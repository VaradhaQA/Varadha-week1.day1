package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int[] brr = {1,2,8,4,9,7};
		for (int i =0; i<arr.length; i++) {
			for (int j=0; j<brr.length; j++) {
				if (arr[i] == brr[j])
				/*  arr[0] == brr[0] > 3==2
				 *  arr[1] == brr[1] > 2==2
				 *  arr[2] == brr[2] > 11==8
				 *  arr[3] == brr[3] > 4==4
				 *  arr[4] == brr[4] > 6==9
				 *  arr[5] == brr[5] > 7==7
				 */
				
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
