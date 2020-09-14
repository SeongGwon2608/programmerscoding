//문제명	: 최대값과 최소값(연습문제)
//난이도	: Lv2
//해결일	: 20.08.24
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String s2 = "-1 -2 -3 -4";
		
		String answer = solution(s2);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(String s) {        
        String[] arrStr = s.split(" ");
        
        int[] nTemp = new int[arrStr.length];
        
        for(int i=0; i<arrStr.length; i+=1) {
        	nTemp[i] = Integer.parseInt(arrStr[i]);
        }
        
        Arrays.sort(nTemp);
        
        String answer = nTemp[0] + " " + nTemp[nTemp.length-1];

        return answer;
    }

}
