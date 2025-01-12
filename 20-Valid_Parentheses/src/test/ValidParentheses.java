package test;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String case1 = "()";
		String case2 = "()[]{}";
		String case3 = "(]";
		String case4 = "([])";
		
		System.out.println("resullt for case 1 : " + isValid(case1));
		System.out.println("resullt for case 2 : " + isValid(case2));
		System.out.println("resullt for case 3 : " + isValid(case3));
		System.out.println("resullt for case 4 : " + isValid(case4));
		
		/*System.out.println("resullt for case 1 : " + isValidV2(case1));
		System.out.println("resullt for case 2 : " + isValidV2(case2));
		System.out.println("resullt for case 3 : " + isValidV2(case3));
		System.out.println("resullt for case 4 : " + isValidV2(case4));*/

	}

	static public boolean isValid(String s) {
		// stak to store the opening brackets
		Stack<Character> stackOfChar = new Stack<Character>();
		
		// loop throught the string received
		for (Character c : s.toCharArray()) {
			// if it's an opening bracket store into the stack
			if (c == '(' || c == '{' || c == '[') {
				stackOfChar.push(c);
			} else {
				// if the stack is empty there are no opening brackets so return false
				if (stackOfChar.isEmpty()) {
					return false;
				}
				
				// store the char on top of the stack
				char topChar = stackOfChar.peek();
				
				/*
				 *  if the char in the string is a closing bracket
				 *  and there is a matching opening bracket in the stack
				 *  pop the top char in the stack
				 */
				if (c == ')' && topChar == '('
						|| c == '}' && topChar == '{' 
						|| c == ']' && topChar == '[') {
					stackOfChar.pop();
				} else {
					return false;
				}
			}
		}
		return stackOfChar.isEmpty();
	}
	
	static public boolean isValidV2(String s) {
		while (true) {
			if (s.contains("()")) {
				s.replace("()", "");
			} else if (s.contains("{}")) {
				s.replace("{}", "");
			} else if (s.contains("[]")) {
				s.replace("[]", "");
			} else {
				return s.isEmpty();
			}
		}	
	}
}
