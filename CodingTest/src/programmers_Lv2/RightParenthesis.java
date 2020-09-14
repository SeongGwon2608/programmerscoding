//문제명	: 올바른 괄호(연습문제)
//난이도	: Lv2
//해결일	: 20.08.04
//블로그	: O

package programmers_Lv2;

import java.util.Stack;

public class RightParenthesis {

	public static void main(String[] args) {
		String s = "()()";
		String s2 = "(())()";
		String s3 = "(()(";
		
		boolean answer = solution(s3);
		System.out.println("answer : " + answer);

	}
	
	public static boolean solution(String s) {
		boolean answer = true;

		Stack<String> checkStr = new Stack<String>();

		for (int i = 0; i < s.length(); i += 1) {
			try {
				if (s.charAt(i) == '(') {
					checkStr.push("(");
				} else if (s.charAt(i) == ')') {
					checkStr.pop();
				}
			} catch (Exception e) {
				answer = false;
			}
		}

		if (answer == true && checkStr.empty())
			answer = true;
		else
			answer = false;
		return answer;
	}

}
