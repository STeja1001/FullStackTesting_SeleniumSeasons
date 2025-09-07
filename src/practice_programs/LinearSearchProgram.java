package practice_programs;

public class LinearSearchProgram {

	public static void main(String[] args) {
		
		int[] number= {12,43,56,76,78,98,9};
		
		int index=linearSearchMethod(number, 77);
		
		if(index>0) {
			System.out.println("Target found!");
		}
		else if (index==-1){
			System.out.println("Target Not Found :( ");
		}
		else {
			System.out.println("Empty Array!");
		}
		
	}

	private static int linearSearchMethod(int[] number, int target) {
		
		if(number.length==0) {
			return -2;
		}
		
		for(int i=0;i<number.length;i++) {
			if(number[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
}
