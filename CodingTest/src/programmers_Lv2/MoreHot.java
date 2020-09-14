//문제명	: 더맵게(Heap)
//난이도	: Lv2
//해결일	: 20.08.29
//블로그	: O

package programmers_Lv2;

import java.util.PriorityQueue;

public class MoreHot {

	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		
		int answer = solution(scoville, K);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		int num = 0;
        
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
		for(int i=0; i<scoville.length; i+=1) {
			pq.add(scoville[i]);
		}
        
		while(true) {
			//System.out.println(pq.toString());
			num = pq.poll();
			if(num >= K) {
				return answer;
			}else if(!pq.isEmpty() && num < K) {
				num += (pq.poll()*2);
				pq.add(num);
				answer +=1;
			}else {
				return -1;
			}
		}
	}

}
