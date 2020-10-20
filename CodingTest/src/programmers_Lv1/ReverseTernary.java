//문제명	: 3진법 뒤집기(월간코드챌린지)
//난이도	: Lv1
//해결일	: 2020.10.21
//블로그	: O

package programmers_Lv1;

import java.util.ArrayList;

public class ReverseTernary {

	public static void main(String[] args) {
		int answer = solution(125);
		System.out.println("answer : " + answer);
	}

	public static int solution(int n) {
		int answer = 0;
		
		answer = changeBin(n);
		
		return answer;
	}
	
	private static int changeBin(int n) {
		String strNum = "";
		
		while(n > 0) {
			strNum += (n%3) +"";
			n/=3;
		}
		
		int result = reBin(Long.parseLong(strNum));
		
		return result;
	}
	
	private static int reBin(Long n) {
		Long temp = n;
		int result = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(temp > 0) {
			list.add((int)(temp%10));
			temp /= 10;
		}
		
		for(int i=0; i<list.size(); i+=1) {
			result += list.get(i) * square(3, i);
		}
		
		return result;
	}
	
	private static int square(int bin, int size) {
		int result = 1;

		for(int i=0; i<size; i+=1) {
			result *= bin;
		}

		return result;
	}

}
