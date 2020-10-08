//문제명	: 소수 만들기
//난이도	: Lv2
//해결일	: 20.10.09
//블로그	: O

package programmers_Lv2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MakePrimeNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int answer = solution(nums);
		
		System.out.println("answer : " + answer);

	}
	
	private static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length-2; i+=1) {
        	for(int j=i+1; j<nums.length-1; j+=1) {
        		for(int k=j+1; k<nums.length; k+=1) {
        			list.add(nums[i] + nums[j] + nums[k]);
        			 System.out.println(list);
        		}
        	}
        }

        for(int i=0; i<list.size(); i+=1) {
        	if(checkPrime(list.get(i))) {
        		answer +=1;
        	}
        }
        
        return answer;
    }
	
	private static boolean checkPrime(int num) {
		for(int i=2; i<num; i+=1) {
			if(num % i == 0)
				return false;
		}
		return true;
	}

}

//private static int solution(int[] nums) {
//    int answer = 0;
//    HashSet<Integer> set = new HashSet<Integer>();
//    ArrayList<Integer> list = new ArrayList<Integer>();
//    
//    for(int i=0; i<nums.length-2; i+=1) {
//    	for(int j=i+1; j<nums.length-1; j+=1) {
//    		for(int k=j+1; k<nums.length; k+=1) {
//    			set.add(nums[i] + nums[j] + nums[k]);
//    			 System.out.println(list);
//    		}
//    	}
//    }
//   
//    Iterator<Integer> iter = set.iterator();
//    while(iter.hasNext()) {
//    	if(checkPrime(iter.next()))
//    		answer +=1;
//    }
//    
//    return answer;
//}