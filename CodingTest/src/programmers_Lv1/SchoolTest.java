//문제명	: 모의고사(완전탐색)
//난이도	: Lv1
//해결일	: 2020.02.20
//블로그	: O

package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolTest {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] answers2 = {1,3,2,4,2};
		
		int[] result = solution(answers2);
		System.out.println("result : " + Arrays.toString(result));
	}
	
	public static int[] solution(int[] answers) {
		int[] noMath1 = {1,2,3,4,5};
		int[] noMath2 = {2,1,2,3,2,4,2,5};
		int[] noMath3 = {3,3,1,1,2,2,4,4,5,5};
		
		int grade1 = checkGrade(answers, noMath1, answers.length);
		int grade2 = checkGrade(answers, noMath2, answers.length);
		int grade3 = checkGrade(answers, noMath3, answers.length);
		
		ArrayList<Integer> mArrayList = new ArrayList<Integer>();
		
		//비교하여 가장 큰 수 찾기
		int max = (grade1 >= grade2)?grade1: grade2;
		max = (max >= grade3)?max: grade3;
		
		if(grade1 == max) 
			mArrayList.add(1);
		if(grade2 == max) 
			mArrayList.add(2);
		if(grade3 == max) 
			mArrayList.add(3);

		int[] answer = new int[mArrayList.size()];
		for(int i=0; i<mArrayList.size(); i++) {
			answer[i] = mArrayList.get(i);
		}
		
		return answer;
    }
	
	//정답 확인 및 채점
	private static int checkGrade(int[] answers, int[] noMath, int length) {
		int num = 0, grade = 0;
		
		for(int i=0; i<length; i++) {
			if(num >= noMath.length) {
				num =0;
			}
			if(answers[i] == noMath[num]) {
				grade++;
				num++;
			}
			else
				num++;
		}
		
		return grade;
	}

}
