import java.util.Scanner;
import java.util.Stack;

public class Lifo {
	public static boolean isBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '[' || input.charAt(i) == '{' || input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top_char = stack.pop();
					if (input.charAt(i) == ']' && top_char != '[') {
						return false;
					} else if (input.charAt(i) == '}' && top_char != '{') {
						return false;
					} else if (input.charAt(i) == ')' && top_char != '(') {
						return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		} else
			return true;
	}

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			boolean result = isBalanced(input);
			System.out.println(result);
		}

	}
}
