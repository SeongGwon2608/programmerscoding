//문제명	: 피보나치 수
//난이도	: Lv2
//해결일	: 20.10.21
//블로그	: O

package programmers_Lv2;

public class FiboNumber {

	public static void main(String[] args) {
		int answer = solution(5);
		System.out.println("answer : " + answer);
	}
	
	//필요 공식 : (A + B) % n == ((A % n) + (B % n) % n)
	private static int solution(int n) {
		int answer = 0;
		int fibo1 = 0, fibo2 = 1;
		
		int[] arrNum = new int[n+1];
		arrNum[0] = 0;
		arrNum[1] = 1;
		for(int i=2; i<n+1; i+=1) {
			arrNum[i] = (fibo1 + fibo2) % 1234567;
			fibo1 = fibo2;
			fibo2 = arrNum[i];
		}
		answer = arrNum[n];
		
		return answer;
	}

}
