package practice_programs;

public class BinarySearchProgram {

	public static void main(String[] args) {
		
		int[] numbers= {-18,-12,-15,16,18,22,45,89};
		
		int index=binarySearchMethod(numbers, 9);

		if(index >= 0) {
			System.out.println("Target found at index: "+index);
		}
		else if(index == -1) {
			System.out.println("Target Not Found :( ");
		}
		

	}

	private static int binarySearchMethod(int[] numbers, int target) {

		int start=0;
		int end=numbers.length-1;
		
		
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(target<numbers[mid]) {
				end = mid-1;
			}
			else if(target>numbers[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;

	}

}
