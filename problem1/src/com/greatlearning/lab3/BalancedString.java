package com.greatlearning.lab3;

import java.util.Stack;

public class BalancedString {

	public static boolean isStringBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();

		if (str.isEmpty()) {
			return true;
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (stack.isEmpty()) {
				stack.add(c);
			} else if (!stack.isEmpty()) {
				if ((c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '[')
						|| (c == ')' && stack.peek() == '(')) {

					stack.pop();
				} else {
					stack.add(c);
				}

			}
		}

		if (stack.isEmpty()) {
			return true;

		} else {
			return false;

		}
	}

}
