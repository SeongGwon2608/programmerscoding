//문제명	: Queue 만들기(챌린지)
//난이도	: Level8
//해결일	: 2020.12.03
//블로그	: O

package onCoder;

import java.util.LinkedList;
import java.util.Queue;

public class Level08_CreateQueue {

	public static void main(String[] args) {
		String[] cmds = {"PUSH 1","PUSH 2","PUSH 3","POP","PUSH 7","POP"};
		
		solution(cmds);
	}

	public static int[] solution(String[] cmds) {
		Queue<String> queue = new LinkedList<String>();
		String[] str = new String[2];

		for (int i = 0; i < cmds.length; i += 1) {
			str = cmds[i].split(" ");

			try {
				if (str[0].equals("PUSH")) {
					queue.add(str[1]);
				} else if (str[0].equals("POP")) {
					queue.poll();
				}
			} catch (Exception e) {}
			//System.out.println(queue);
		}
		
		int[] answer = new int[queue.size()];
		//queue.size()로 반복횟수 설정시 poll 사용할때 크기가 변할수 있어 정수형 변수 생성하여 값 저장
		int count = queue.size();		
		for(int i=0; i<count; i+=1) {
			try {
				answer[i] = Integer.parseInt(queue.poll());
			} catch (Exception e) {
				System.err.println("parseInt가 불가능한 상황발생");
				e.getMessage();
			}
		}
		
		//System.out.println(Arrays.toString(answer));
		return answer;
	}
}
