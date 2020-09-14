//문제명	: 문자열 내마음대로 정렬하기(연습문제)
//난이도	: Lv1
//해결일	: 2020.08.24
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;
import java.util.LinkedList;

public class StringSort {

	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		String[] strings2 = {"abcd", "abce", "cdx"};
		int n2 = 2;

		String[] answer = solution(strings, n);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] result = new String[strings.length];
        String[] strSplit = {"", ""};
        int i=0;
        
        LinkedList<String> strList = new LinkedList<String>();
               
        for(i=0; i<strings.length; i+=1) {
        	String strTemp = strings[i].substring(n) + "," + strings[i];
        	result[i] = strTemp;
        }
		Arrays.sort(result);
        
		char cKeep = result[0].charAt(0);
        
		for (i = 0; i < result.length; i += 1) {
			try {			
				if (result[i].charAt(0) == cKeep) {
					strSplit = result[i].split(",");
					strList.add(strSplit[1]);
				} else if (strList.size() == 1) {
					answer[i-1] = strList.poll();
					cKeep = result[i].charAt(0);
					i-=1;
				} else {
					answer = seatChange(strList, answer, i);
					cKeep = result[i].charAt(0);
					strList.clear();
					i-=1;
				}
			} catch (Exception e) {
				System.err.println("2차 정렬 예외 발생");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		if (!strList.isEmpty()) {
			answer = seatChange(strList, answer, i);
		}
		
        return answer;
	}
	
	public static String[] seatChange(LinkedList<String> list, String[] answer, int num) {
		list.sort(null);
		int temp = 0;
		
		for(int i=num-list.size(); temp<list.size(); i+=1) {
			answer[i] = list.get(temp);
			temp+=1;
		}
		
		return answer;
	}
}
