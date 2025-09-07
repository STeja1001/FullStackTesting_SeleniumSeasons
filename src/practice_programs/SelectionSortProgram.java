package practice_programs;

import java.util.Arrays;

public class SelectionSortProgram {

	public static void main(String[] args) {
		
		int[] arr= {3,1,-1,4,2,9,89,76,3};
		System.out.println("Intialized array: "+Arrays.toString(arr));
//		selectionSortMethod(arr);
		selectionSortMethod1(arr);
		
		System.out.println("After swaping array: "+Arrays.toString(arr));

	}

	private static void selectionSortMethod1(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	}

	private static void selectionSortMethod(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int end = arr.length-1-i; 
			int maxIndex=getMaxIndex(arr, 0, end);
			
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[end];
			arr[end]=temp;
		}
		
			
		}
		
	private static int getMaxIndex(int[] arr, int start, int end) {
		
		int max=start;
		
		for(int i=start;i<=end;i++) {
			if(arr[max]<arr[i]){
				max=i;
			}
		}
		
		return max;
	
		

	}
}
	
	


