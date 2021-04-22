package 算法与数据结构;

import java.util.Stack;

public class 有效的括号 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "({})[]";
		System.out.println(isValid(s));
	}

	static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char s1;
		for (int i = 0; i < s.length(); i++) {
			s1 = s.charAt(i);
			if (s1 == '(' || s1 == '[' || s1 == '{') {
				stack.push(s1);
			} else if (s1 == ')' || s1 == ']' || s1 == '}') {
				if(stack.empty()) {
					return false;
				}
				if (match((char) stack.pop(), s1)) {

				} else {
					return false;
				}

			}
		}
		if(stack.empty()) {
			return true;
		}else {
			return false;
		}
		
		
	}

	static boolean match(char str1, char str2) {
		int s1 = 0;
		int s2 = 0;
		switch (str1) {
		case '(':
			s1 = 1;
			break;
		case '[':
			s1 = 2;
			break;
		case '{':
			s1 = 3;
			break;

		}

		switch (str2) {
		case ')':
			s2 = 1;
			break;
		case ']':
			s2 = 2;
			break;
		case '}':
			s2 = 3;
			break;
		}
		return s1 == s2;

	}
}
