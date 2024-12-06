//Keshaun Gay

import java.util.Scanner;
public class TriangleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Triangle Maker! Enter the size");
		System.out.println("of the triangle.");
		//Tells the user to pick how big the triangle will be.
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		if (size <= 0) {
			System.out.println("Enter a number above 0!");
			System.exit(0);
		//If the number is 0 or lower the program will give you a warning and stop the code.
		}	
		else {
			for (int i = 0; i <= size; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
			//Generates the top part of the triangle
				}
			System.out.println();
			}
			for(int i = size - 1; i > 0; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
			//Generates the bottom part of the triangle
				}
			System.out.println();	
			}
		System.out.println();	
		System.out.println("Done!"); 
		//Let's you know the program is over.
			}
		}
	}
