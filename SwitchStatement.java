package Conditional;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		// keyword used in Switch in 
		//switch case break default
		
		System.out.println("---Switch---\n");
		
		// Get Number English from Zero to Nine
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number from 0 to 9\n");
		
		int number = input.nextInt();
		
		switch(number) {
		case 0: 
			System.out.println("Zero");
			break;
			
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3: 
			System.out.println("Three");
			break;
		case 4: 
			System.out.println("Four");
			break;
		case 5: 
			System.out.println("Five");
			break;
		case 6: 
			System.out.println("Six");
			break;
		case 7: 
			System.out.println("Seven");
			break;
		case 8: 
			System.out.println("Eight");
			break;
		case 9: 
			System.out.println("Nine");
			break;
		default:
				System.out.println("This is not a number within 0-9\n");
			
		}
		
			
	}
}
