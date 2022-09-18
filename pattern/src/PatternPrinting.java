import java.util.Scanner;

public class PatternPrinting {

	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int n = 5;
	System.out.println("1. Square Pattern   \n");
	pattern1(n);
	System.out.println("\n");
	
	System.out.println("2. Pyramid Pattern   \n");
	pattern2(n);
	System.out.println("\n");
	
	System.out.println("3. Right Angle Triangle Pattern   \n");
	pattern3(n);
	System.out.println("\n");
	
	System.out.println("4. Diamond Pattern \n");
	pattern4(n);
	System.out.println("\n");
	
	System.out.println("5. Right Angle down triangle Pattern   \n");
	pattern5(n);
	System.out.println("\n");
	
	System.out.println("6. Down Pyramid Pattern   \n");
	pattern6(n);
	System.out.println("\n");
	
	System.out.println("7. Mirror Right Angle Triangle Pattern   \n");
	pattern7(n);
	System.out.println("\n");
	
	System.out.println("8. Mirror Right Angle Down Triangle Pattern   \n");
	pattern8(n);
	System.out.println("\n");
	

	System.out.println("9. Right Pascal's Triangle Pattern   \n");
	pattern9(n);
	System.out.println("\n");
	
	System.out.println("10. Left Pascal's Triangle Pattern   \n");
	pattern10(n);
	System.out.println("\n");

	System.out.println("11. Sand Glass Pattern   \n");
	pattern11(n);
	System.out.println("\n");

	}
	
	static void pattern1(int n) {
		//normal star pattern
		for(int row = 0; row<n ; row++ ) {
			for(int column = 0 ; column<n ; column++) {
				System.out.print("* ");
			
			}
			
			System.out.println("");
		}
	}
	
	static void pattern2(int n ) {
		//Pyramid pattern
	
		for(int row = 1; row <= n; row++ ) {
			int whiteSpace = n-row;
			for(int space = 1; space<= whiteSpace; space++) {
				System.out.print(" ");
			}
			for(int column = 1 ; column<= row ; column++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	static void pattern3(int n ) {
		
		//Right angle triangle
		
		for(int row = 1; row <= n; row++) { 
			for(int column = 1; column <=row ; column++) {
				System.out.print("* " );
			}
			System.out.println(" ");
			
		}
	}
	

	static void pattern4(int n ) {
		//Diamond pattern
	
		for(int row = 1; row <= n*2; row++ ) {
			
			if(row <= n ) {
			int whiteSpace = n-row;
			for(int space = 1; space <= whiteSpace; space++) {
				System.out.print(" ");
			}
			for(int column = 1 ; column<= row ; column++) {
				System.out.print("* ");
			}
			System.out.println("");
			}
			else {
				int whiteSpace = row - n;
				for(int space = 1; space <= whiteSpace; space++) {
					System.out.print(" ");
				}
				for(int column = 1 ; column<= n-whiteSpace  ; column++) {
					System.out.print("* ");
				}
				System.out.println("");
												
			}
			
		}
	}
	
	static void pattern5(int n ) {
		//Downward Triangle
		for(int row = n; row >= 1; row--) { 
			for(int column = 1; column <=row ; column++) {
				System.out.print("* " );
			}
			System.out.println(" ");
			
		}
		
	}
	
	static void pattern6(int n) {
		//Downward Pyramid
		for(int row = n; row >= 1; row-- ) {
			int whiteSpace = n-row;
			for(int space = 1; space<= whiteSpace; space++) {
				System.out.print(" ");
			}
			for(int column = 1 ; column<= row ; column++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	static void pattern7(int n ) {
		//Mirror Right Angled Triangle
		
		for (int row = 1; row<=n ; row++) {
			int whiteSpace = n - row + 1;
			for(int space = 1 ; space<whiteSpace ; space++) {
				System.out.print(" ");
			}
			for(int column = 1; column<=row ; column++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
	
	static void pattern8(int n ) {
		//Mirror Right down Angled Triangle
		
				for (int row = n; row >= 1 ; row--) {
					int whiteSpace = n - row + 1;
					for(int space = 1 ; space<whiteSpace ; space++) {
						System.out.print(" ");
					}
					for(int column = 1; column<=row ; column++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
	}
	
	static void pattern9(int n ) {
		
		//Right pascal's triangle
		
		//first Half
		for(int row = 1; row<=n; row++) {			
			for(int column = 1; column <= row ; column++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Second Half
		for(int row = n-1; row>=1 ;row--) {
				for(int column = 1; column <= row ; column++ ) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
		}
	
	static void pattern10(int n) {
		
		
		for(int row = 1; row<= n*2 ; row++) {
			
			if(row <= n) {
			int whiteSpace = n-row;
			for(int space = 1; space<=whiteSpace; space++) {
				System.out.print(" ");
			}
			for(int column = 1; column <= row ; column++) {
				System.out.print("*");
			}
			System.out.println("");
			}else {
				
//				System.out.println(k +" "+row);
				int whiteSpace = row-n;
				for(int space = 1; space<=whiteSpace; space++) {
					System.out.print(" ");
				}
				for(int column = 1; column <= n-whiteSpace ; column++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
	
	static void pattern11(int n) {
		//Sand Glass Pattern
		
		for(int row = n; row >= 1 ; row--) {
			
			int whiteSpace = n-row;
			for(int space = 1; space<=whiteSpace; space++) {
				System.out.print(" ");
			}
			for(int column = 1; column <= row ; column++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}



