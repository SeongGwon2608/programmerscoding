//문제명	: 키패드 누르기(카카오 인턴쉽 - 2020)
//난이도	: Lv1
//해결일	: 2020.09.26
//블로그	: O

package programmers_Lv1;

public class KeyPad {

	public static void main(String[] args) {
		//int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		//String hand = "right";
		
		//int[]numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		//String hand = "left";
		
		int[]numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		
		String answer = solution(numbers, hand);
		System.out.println("answer : " + answer);

	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        String temp = "";
        int leftPos = 10, rightPos = 12;
        
        for(int i=0; i<numbers.length; i+=1) {
        	switch (numbers[i]) {
			case 1:
			case 4:
			case 7:
				answer += "L";
				leftPos = numbers[i];
				break;
			case 3:
			case 6:
			case 9:
				answer += "R";
				rightPos = numbers[i];
				break;
			default:
				temp = returnHand(numbers[i], hand, rightPos, leftPos);
				answer += temp;
				if(temp.equals("L"))
					if(numbers[i] != 0)
						leftPos = numbers[i];
					else
						leftPos = 11;
				else
					if(numbers[i] != 0)
						rightPos = numbers[i];
					else
						rightPos = 11;
				break;
			}
        }
        return answer;
    }
	
	private static String returnHand(int number, String hand, int rightPos, int leftPos) {
		if(number == 0) {
			number = 11;
		}
		int left = 0, right = 0;
		
		if(leftPos == 2 || leftPos == 5 || leftPos == 8 || leftPos == 11) {
			if(number - leftPos >= 0) {
				left = ((number - leftPos)/3);
			}else {
				left = ((number - leftPos)/(-3));
			}
		}else {
			if(number - leftPos >= 0) {
				left = ((number - 1 - leftPos)/3) + 1;
			}else {
				left = ((number - 1 - leftPos)/(-3)) + 1;
			}
		}
		
		if(rightPos == 2 || rightPos == 5 || rightPos == 8 || rightPos == 11) {
			if(number - rightPos >= 0) {
				right = ((number - rightPos)/3);
			}else {
				right = ((number - rightPos)/(-3));
			}
		}else {
			if(number - rightPos >= 0) {
				right = ((number + 1 - rightPos)/3) + 1;
			}else {
				right = ((number + 1 - rightPos)/(-3)) + 1;
			}
		}
		
		if(right > left) {
			return "L";
		}else if(right < left) {
			return "R";
		}else if(right == left && hand.equals("right")){
			return "R";
		}else {
			return "L";
		}
	}

}
