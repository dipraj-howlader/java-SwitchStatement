package Conditional;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		// ternary operator
		
		System.out.println("Compare with two number:\n");
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Inter 1st number\n");
		int num1 = input1.nextInt();
		
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Inter 2nd number\n");
		int num2 = input2.nextInt();
		
		int bigNumber = num1 > num2 ? num1 : num2;
		
		System.out.println("Bigger number is: " + bigNumber);
		
		
	}
}
