//문제명	: 이진변환 반복하기(월간 코드챌린지 시즌1)
//난이도	: Lv2
//해결일	: 21.03.26
//블로그	: 

package programmers_Lv2;

import java.util.Arrays;

public class RepeatBin {

	public static void main(String[] args) {
		String s = "1111111";
		int[] answer = solution(s);
		
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution(String s) {
		//이진 변환의 횟수(changeCount), 변환과정에서 제거된 모든 0의 갯수(count)
        int[] answer = {0,0};
        int changeCount = 0;
        int removeCount = 0;
        
        while(true) {
        	if(s.equals("1")) break;
        	else {
        		changeCount++;
        		
        		String temp = "";
        		for(int i=0; i<s.length(); i+=1) {
        			if(s.charAt(i) == '1') {
        				temp += "1";
        			}else {
        				removeCount++;
        			}
        		}
        		s = calc(temp);
        	}
        }
        answer[0] = changeCount;
        answer[1] = removeCount;
        
        return answer;
    }
	
	public static String calc(String str) {
		int num = str.length();
		String temp = "";
		
		while(num > 0) {
			temp = (num % 2) + temp;
			num /= 2;
		}
		System.out.println(temp);
		return temp;
	}
}
