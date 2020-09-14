//문제명	: 문자열 내림차순 배치(연습문제)
//난이도	: Lv1
//해결일	: 2020.03.04
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = solution(s);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(String s) {
		String answer = "";
		
		char[] temp = s.toCharArray();
		String upper = "", lower = "";
		
		Arrays.sort(temp);
		
		for(int i=temp.length-1; i>=0; i--) {
			if(temp[i] >= 'a') {
				lower += temp[i];
			}else {
				upper += temp[i];
			}
		}
		answer = lower + upper;
				
		return answer;
    }

}
