package practice_programs;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 30;
		System.out.println("Values of a before swapping: "+a);
		System.out.println("Values of b before swapping: "+b);
		
//		SwappingOfTwoNumbersMethod(a,b);
		SwappingOfTwoNumbersWithoutThirdVarMethod(a,b);

		

	}

	private static void SwappingOfTwoNumbersWithoutThirdVarMethod(int a, int b) {

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Values of a after swapping: "+a);
		System.out.println("Values of b after swapping: "+b);
		
	}

	private static void SwappingOfTwoNumbersMethod(int a, int b) {
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values of a after swapping: "+a);
		System.out.println("Values of b after swapping: "+b);
		
	}

}
