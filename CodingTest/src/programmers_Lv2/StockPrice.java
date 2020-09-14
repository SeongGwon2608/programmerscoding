//문제명	: 주식가격(스택/큐)
//난이도	: Lv2
//해결일	: 20.08.25
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;

public class StockPrice {

	public static void main(String[] args) {
		int[] prices = {1,2,3,2,3};
		
		int[] answer = solution(prices);
		System.out.println("answer : " + Arrays.toString(answer));
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i+=1) {
        	int count = 0;
        	if(i == prices.length-1) {
        		answer[i] = 0;
        		break;
        	}
        	for(int j=i+1; j<prices.length; j+=1) {
        		if(prices[i] >  prices[j]) {
        			count+=1;
        			break;
        		}else {
        			count+=1;
        		}
        	}
        	answer[i] = count;
        	//System.out.println(Arrays.toString(answer));
        }
        //System.out.println(Arrays.toString(answer));
        return answer;
    }

}
