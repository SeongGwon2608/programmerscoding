//문제명	: 콜라츠 추측(연습문제)
//난이도	: Lv1
//해결일	: 2020.04.20
//블로그	: O

package programmers_Lv1;

public class Collatz {

	public static void main(String[] args) {
		int num = 6;
		int num2 = 16;
		int num3 = 626331;
		
		int answer = solution(num3);
		System.out.println("answer : " + answer);
	}
	
	public static int solution(int num) {
		int answer = 0;
		 long number = num;
		
		for(int i=0; i<500; i++) {
			if(number == 1)
				break;
			
			if(i == 499) {
				return -1;
			}
			
			if(number % 2 == 0) {
				number /= 2;
				answer += 1;
			}else {
				number = (number * 3) + 1;
				answer += 1;
			}			
		}
		return answer;
  }

}
