package Conditional;

public class BitwiseOperator {
	public static void main(String [] args) {
		System.out.println("---BITWISE OPERATOR---\n\n");
		// bitwise & means Binary MULTIPUL (*)
		// bitwise | means Binary PLUS (+)
		// bitwise ^ means Binary Minus (-)
		
		
		//BITWISE mainly use for Binary work
		
		int a = 12;
		int b = 22;
		int c;
		
		// here 12 and 22 converts in binary and then it works
		
		
		c = a & b;
		System.out.println(" a & b :" + c);
		
		c = a | b;
		System.out.println(" a | b :" + c);
		
		c = a ^ b;
		System.out.println(" a ^ b :" + c);
		
	}
}
