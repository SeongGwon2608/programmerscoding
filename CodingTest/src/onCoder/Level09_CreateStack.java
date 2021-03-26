//문제명	: Stack 만들기(챌린지)
//난이도	: Level9
//해결일	: 2020.12.03
//블로그	: O

package onCoder;

import java.util.Arrays;
import java.util.Stack;

public class Level09_CreateStack {

	public static void main(String[] args) {
		String[] cmds = { "PUSH 1", "PUSH 2", "PUSH 3", "POP", "POP", "PUSH 4", "POP", "PUSH 5" };
		solution(cmds);
	}

	public static int[] solution(String[] cmds) {
		Stack<Integer> stack = new Stack<Integer>();
		String[] str = new String[2];

		for (int i = 0; i < cmds.length; i += 1) {
			str = cmds[i].split(" ");
			try {
				if (str[0].equals("PUSH")) {
					stack.push(Integer.parseInt(str[1]));
				} else if (str[0].equals("POP")) {
					stack.pop();
				}
				// System.out.println(stack.toString());
			} catch (Exception e) {
				System.err.println("예외 발생");
				e.getMessage();
			}
		}

		int[] answer = new int[stack.size()];
		for (int i = answer.length - 1; i >= 0; i -= 1) {
			answer[i] = stack.pop();
		}
		// System.out.println(Arrays.toString(answer));
		return answer;
	}

}
