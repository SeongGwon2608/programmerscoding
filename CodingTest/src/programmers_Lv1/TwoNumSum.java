//문제명	: 두개 뽑아서 더하기(월간 코드 챌린지 시즌1)
//난이도	: Lv1
//해결일	: 2020.09.15
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumSum {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] numbers2 = {5,0,2,7};
		int[] answer = solution(numbers2);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	
	public static int[] solution(int[] numbers) {
        HashMap<Integer, Object> numMap = new HashMap<Integer, Object>();
        
        for(int i=0; i<numbers.length; i+=1) {
        	for(int j=i+1; j<numbers.length; j+=1) {
        		numMap.put(numbers[i] + numbers[j],numbers[i] + numbers[j]);
        	}
        }
        
        int[] answer = new int[numMap.size()];
        int i=0;
        for(Integer key : numMap.keySet()) {
        	Object value = numMap.get(key);
        	answer[i] = (int)value;
        	i+=1;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}
