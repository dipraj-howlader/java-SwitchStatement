package Conditional;

import java.util.Scanner;

public class MultipalTernary {
	public static void main(String[] args) {
		// multipul ternary? what a min what!!!
		
		System.out.println("---Let's check My Grade---\n\n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mark\n");
		
		int mark = input.nextInt();
		
		String grade = mark >= 80 ? "A+"
				: mark >= 75 && mark < 80 ? "A"
						:mark >= 70 && mark < 75? "A-"
								:mark >= 60 && mark < 70? "B"
										:mark >= 50 && mark < 60? "C"
												:mark >= 40 && mark < 50? "D"
														:mark >= 33 && mark < 40? "E"
																: "F";
		System.out.println("Your Grade is: "+ grade);
														
		
	}
}
