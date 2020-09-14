//문제명	: 제일 작은 수 제거(연습문제)
//난이도	: Lv1
//해결일	: 2020.03.07
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class SmallestRemove {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] arr2 = {10};
		
		int[] answer = solution(arr);
		System.out.println("answer : " + Arrays.toString(answer));

	}
	public static int[] solution(int[] arr) {
		int num = 0, count = 0;
		
		if(arr.length == 1) {
			int answer[] = {-1};
			return answer;
		}
		
		int[] baseArr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			baseArr[i] = arr[i];
		}
		
		int[] answer = new int[arr.length-1];
		
		Arrays.sort(baseArr);
		num = baseArr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != num) {
				answer[count] = arr[i];
				count++;
			}
		}
		return answer;
    }

}
