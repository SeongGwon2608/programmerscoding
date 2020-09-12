//문제명	: 짝지어 제거하기(2017팁스타운)
//난이도	: Lv2
//해결일	: 20.09.12
//블로그	: O

package programmers_Lv2;

import java.util.Stack;

public class PairRemove {

	public static void main(String[] args) {
		String s1 = "baabaa";
		String s2 = "cdcd";

		System.out.println(solution(s2));
	}
	
	private static int solution(String s) {
		Stack<String> strStack = new Stack<String>();
		
		for(int i=0; i<s.length(); i+=1) {
			if(strStack.size()>0 && strStack.lastElement().equals(s.charAt(i)+"")) {
				strStack.pop();
			}else {
				strStack.push(s.charAt(i) + "");
			}
		}
		
		//모두 제거되면 1, 남아있으면 0을 반환
		if(strStack.isEmpty())
			return 1;
		else
			return 0;
	}

}
