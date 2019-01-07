package collection;

import java.util.Stack;
import java.util.Vector;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");

		while (stack.isEmpty() == false) {
			String value = stack.pop();
			System.out.println(value);
		}
		// 비어있는 경우, 예외 발생
//		stack.pop(); 
		stack.push("둘리");
		stack.push("또치");
		stack.push("희동이");

		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
	}
}
