//문제명	: 크레인 인형뽑기 게임(Kakao개발자 겨울 인턴쉽 - 2019)
//난이도	: Lv1
//해결일	: 2020.08.24
//블로그	: O

package programmers_Lv1;

import java.util.Stack;

public class CraneDollCatcher {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = solution(board, moves);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int[][] board, int[] moves) {
		Stack<Integer> saveStack = new Stack<Integer>();
        int answer = 0;
        int nTemp = 0;
        
        for(int i=0; i<moves.length; i+=1) {
        	for(int j=0; j<board[0].length; j+=1) {
        		nTemp = board[j][moves[i]-1];
        		if(nTemp != 0) {
        			saveStack.push(nTemp);
        			board[j][moves[i]-1] = 0;
        			if(saveStack.size() > 1 && saveStack.get(saveStack.size()-1) == saveStack.get(saveStack.size()-2)) {
        				saveStack.pop();
        				saveStack.pop();
        				answer += 2;
        			}
        			break;
        		}
        	}
        }
        return answer;
	}

}
