//문제명	: 수열 중복 제거(챌린지)
//난이도	: Level13
//해결일	: 2020.12.07
//블로그	: O

package onCoder;

import java.util.ArrayList;

public class Level13_Overlap {

	public static void main(String[] args) {
		int[] sequence = {1,5,5,1,6,1};
		solution(sequence);

	}
	
	public static int[] solution(int[] sequence){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//수열 중복 확인
		for(int i=0; i<sequence.length; i+=1) {
			if(!list.contains(sequence[i])) {
				list.add(sequence[i]);
			}else {
				list.remove(list.indexOf(sequence[i]));
				list.add(sequence[i]);
			}
			System.out.println(list);
		}
		
		//결과값 작성
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i+=1) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}
