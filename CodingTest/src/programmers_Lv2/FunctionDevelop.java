//문제명	: 기능개발(스택/큐)
//난이도	: Lv2
//해결일	: 20.07.17
//블로그	: X

package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDevelop {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		
		int[] answer = solution(progresses, speeds);
		System.out.println(Arrays.toString(answer));

	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] days = new int[progresses.length];
		
		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i =0; i<progresses.length; i++) {
			days[i] = dayCalc(progresses[i], speeds[i]);
		}
		
		int num = days[0], count = 1;
		
		for(int i=1; i<progresses.length; i++) {
			if(num >= days[i]) {
				count++;
			}else {
				arrayList.add(count);
				num = days[i];
				count = 1;
			}
		}
		arrayList.add(count);
		
		int[] answer = new int[arrayList.size()];
		
		for(int i=0; i<arrayList.size(); i++) {
			answer[i] = arrayList.get(i);
		}
		
		return answer;
    }
	
	public static int dayCalc(int progresses, int speeds) {
		int result = 0;
		
		while(true) {
			if(progresses >=100)
				break;
			else {
				progresses +=speeds;
				result++;
			}
		}
		
		return result;
	}

}
