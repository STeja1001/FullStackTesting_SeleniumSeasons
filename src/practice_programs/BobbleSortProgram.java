package practice_programs;

import java.util.Arrays;

public class BobbleSortProgram {

	public static void main(String[] args) {
		
		int[] arr= {3,1,-1,4,2};
		System.out.println("Intialized array: "+Arrays.toString(arr));
		bobbleSortMethod(arr);
		
		System.out.println("After swaping array: "+Arrays.toString(arr));
	}

	private static void bobbleSortMethod(int[] arr) {

		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
	
	}

}
