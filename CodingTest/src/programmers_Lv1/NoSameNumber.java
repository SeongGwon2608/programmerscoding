//문제명	: 같은 숫자는 싫어(연습문제)
//난이도	: Lv1
//해결일	: 2020.02.19
//블로그	: O

package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class NoSameNumber {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		int[] answer = solution(arr);
		System.out.println(Arrays.toString(answer));

	}
	
	public static int[] solution(int[] arr) {
		ArrayList<Integer> mArrayList = new ArrayList<Integer>();
		
		int num = 99;   //절대로 나올수 없는 수
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != num) {
				mArrayList.add(arr[i]);
				num = arr[i];
			}
		}
		
		int[] answer = new int[mArrayList.size()];	
		for(int i=0; i<mArrayList.size(); i++) {
			answer[i] = mArrayList.get(i);
		}

		return answer;
	}

}
