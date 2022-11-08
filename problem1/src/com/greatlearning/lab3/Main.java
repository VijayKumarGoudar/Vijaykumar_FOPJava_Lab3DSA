package com.greatlearning.lab3;

public class Main {

	public static void main(String[] args) {

		String s1 = "([[{}]]))";
		
		if (BalancedString.isStringBalanced(s1)) {
			System.out.println("given String " + s1 + " is balanced");
		} else {
			System.out.println("given String " + s1 + " is not balanced");
		}
		
		String s2 ="([[{}]])";
		
		if (BalancedString.isStringBalanced(s2)) {
			System.out.println("given String " + s2 + " is balanced");
		} else {
			System.out.println("given String " + s2 + " is not balanced");
		}
	}
}
