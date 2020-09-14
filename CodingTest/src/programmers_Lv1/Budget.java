//문제명	: 예산(summer/winter Coding(~2018))
//난이도	: Lv1
//해결일	: 2020.03.03
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class Budget {

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		int[] d2 = {2,2,3,3};
		int budget2 = 10;
		
		int answer = solution(d, budget);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int[] d, int budget) {
		int answer = 0, sum = 0;
		
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			sum += d[i];
			if(sum <= budget) 
				answer++;
		}
		return answer;
    }

}
