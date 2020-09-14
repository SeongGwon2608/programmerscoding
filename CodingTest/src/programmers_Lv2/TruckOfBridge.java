//문제명	: 다리를 건너는 트럭(스택/큐)
//난이도	: Lv2
//해결일	: 20.08.18
//블로그	: O

package programmers_Lv2;

import java.util.LinkedList;

public class TruckOfBridge {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		int answer = solution(bridge_length, weight, truck_weights);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		//LinkedList 선언(데이터 삽입, 삭제에 용이)
		LinkedList<Integer> road = new LinkedList<Integer>();
		
		int answer = 0;
		int temp = 0, nCount = 0;
		int nLength = truck_weights.length;

		while (true) {
			answer += 1;
			if (nCount < nLength && weight - truck_weights[nCount] >= 0) {
				road.add(truck_weights[nCount]);
				weight -= truck_weights[nCount];
				nCount += 1;
			} else {
				road.add(0);
			}

			//LinkedList의 크기가 bridge_length와 같아질 때부터 앞에서부터 하나씩 삭제
			if (road.size() == bridge_length) {
				temp = road.get(0);
				weight += temp;
				road.remove();
			}
			if(nCount == nLength && temp == truck_weights[nCount-1]) {
				int check = 0;
				for(int j=0; j<road.size(); j+=1) {
					check += road.get(j);
				}
				if(check == 0) {
					answer += 1;
					break;
				}
			}
		}
		
		return answer;
	}

}
