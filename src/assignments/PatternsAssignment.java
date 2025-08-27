package assignments;

public class PatternsAssignment {

	public static void main(String[] args) {
		
//		pattern5(5);
//		pattern6(5);
//		pattern7(5);
//		pattern8(5);
//		pattern9(5);
//		pattern10(5);
		pattern11(5);

	}

	private static void pattern5(int n) {
		
		for(int i=1;i<=n-1;i++) {
			
			for(int j=1;j<=i;j++) {
			
			System.out.print("* ");
		}
		System.out.println();
	}
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i+1;j++) {
			
			System.out.print("* ");
		}
		System.out.println();
	}
		
	}
	
	private static void pattern6(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
			
			System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
		}
		System.out.println();
	}
		
	}
	private static void pattern7(int n) {
		// TODO Auto-generated method stub
		
			for(int i=1;i<=n;i++) {
		
				for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
				}
				
				for(int k=1;k<=n-i+1;k++) {
					
					System.out.print("*");
			}
			System.out.println();
}
	}
	
	private static void pattern8(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
			
			System.out.print(" ");
			}
			
			for(int k=1;k<=2*i-1;k++) {
				
				System.out.print("*");
		}
		System.out.println();
	}
		
}

	private static void pattern9(int n) {
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
			
			System.out.print(" ");
			}
		for(int k=0;k<2*(n-i)-1;k++) {
				
				System.out.print("*");
		}
		System.out.println();
			
		}
		
	}

private static void pattern10(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
			
			System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("* ");
		}
		System.out.println();
	}
		
}

private static void pattern11(int n) {
	
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
		
		System.out.print(" ");
		}
		
		for(int k=1;k<=n-i+1;k++) {
			
			System.out.print("* ");
	}
	System.out.println();
}
	
}










}
