//문제명	: 정수 제곱근 판별(연습문제)
//난이도	: Lv1
//해결일	: 2020.08.26
//블로그	: O

package programmers_Lv1;

public class SquareRoot {

	public static void main(String[] args) {
		long n = 121;
		long n2 = 3;
		
		long answer = solution(n);
		System.out.println("answer : " + answer);

	}
	
	public static long solution(long n) {
		double dSqrt = Math.sqrt(n);
		int nSqrt = (int)dSqrt;
        
		if(dSqrt-nSqrt == 0) {
			return (long)Math.pow(nSqrt+1, 2);
		}else {
			return -1;
		}
	}

}
