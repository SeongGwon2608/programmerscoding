//문제명	: 프린터(스택/큐)
//난이도	: Lv2
//해결일	: 20.08.27
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;
import java.util.LinkedList;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		
		int answer = solution(priorities, location);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int[] priorities, int location) {
		LinkedList<Integer> printQueue = new LinkedList<Integer>();
		int answer = 0;
		int count = priorities.length-1;
		int target = 0;
		
		for(int i=0; i<priorities.length; i+=1) {
			if(i == location) {
				target = priorities[i];
				printQueue.add(priorities[i]*10);
			}else {
				printQueue.add(priorities[i]);
			}
		}
		Arrays.sort(priorities);
		
		while(true) {
			if(priorities[count] == printQueue.get(0)) {
				printQueue.poll();
				priorities[count] = 0;
				count -=1 ;
				answer +=1 ;
			}else if(priorities[count] == target && printQueue.get(0) >= 10){
				answer +=1;
				//System.out.println(answer);
				return answer;
			}else {
				printQueue.add(printQueue.poll());
			}
			//System.out.println("printQueue : " + printQueue.toString());
		}

	}

}
