//문제명	: K번째수(정렬)
//난이도	: Lv1
//해결일	: 2020.02.20
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class KNumber {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1},{1,7,3}};
		
		int[] answer = solution(array, commands);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		
		int num = 0;
		for(int i = 0; i<commands.length; i++) {
			int[] temp = new int[commands[i][1] - commands[i][0]+1];
			
			for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++) {
				
				temp[num] = array[j];
				num++;
			}
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
			num = 0;
		}
		return answer;
    }

}
