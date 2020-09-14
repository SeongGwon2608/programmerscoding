//문제명	: 체육복(탐욕법)
//난이도	: Lv1
//해결일	: 2020.08.26
//블로그	: O

package programmers_Lv1;

import java.util.Arrays;

public class Sportwear {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = { 1,3,5};
		
		int answer = solution(n, lost, reserve);
		System.out.println("answer : " + answer);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer1 = 0;
        int answer2 = 0;
        int lostStudent = 0;
        int reserveStudent = 0;
        
        int[] nClass = new int[n];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //배열 세팅
        for(int i=0; i<nClass.length; i+=1) {
        	nClass[i] = 1;
        	
        	if(i == lost[lostStudent]-1) {
        		nClass[i] -= 1;
        		lostStudent += 1;
        		if(lostStudent == lost.length)
        			lostStudent -=1;
        	}
        	if(i == reserve[reserveStudent]-1) {
        		nClass[i] += 1;
        		reserveStudent +=1;
        		if(reserveStudent == reserve.length)
        			reserveStudent -=1;
        	}
        }
        //System.out.println(Arrays.toString(nClass));
        
        answer1 = maxCloth(nClass.clone(), 2);
        answer2 = maxCloth(nClass.clone(), 1);
        
        //System.out.println("answer1 : " + answer1);
        //System.out.println("answer2 : " + answer2);
        
        if(answer1 > answer2)
        	return answer1;
        else
        	return answer2;
    }
	private static int maxCloth(int[] nClass, int startPosition) {
		int answer = 0;

		//앞에서부터 뒤로 진행
		if (startPosition % 2 == 0) {
			for (int i = 0; i < nClass.length - 1; i += 1) {
				if (nClass[i] == 2 && nClass[i + 1] == 0) {
					nClass[i] = 1;
					nClass[i + 1] = 1;
				}
			}
			System.out.println(Arrays.toString(nClass));
			for (int i = nClass.length - 1; i > 0; i -= 1) {
				if (nClass[i] == 2 && nClass[i - 1] == 0) {
					nClass[i] = 1;
					nClass[i - 1] = 1;
				}
			}
			System.out.println(Arrays.toString(nClass));
		} else {
			//뒤에서 앞으로 진행 
			for (int i = nClass.length-1; i > 0; i -= 1) {
				if (nClass[i] == 2 && nClass[i - 1] == 0) {
					nClass[i] = 1;
					nClass[i - 1] = 1;
				}
			}
			System.out.println(Arrays.toString(nClass));
			for (int i = 0; i < nClass.length - 1; i += 1) {
				if (nClass[i] == 2 && nClass[i + 1] == 0) {
					nClass[i] = 1;
					nClass[i + 1] = 1;
				}
			}
			System.out.println(Arrays.toString(nClass));
		}
		
		//결과 카운트 
		for (int i = 0; i < nClass.length; i += 1) {
			if (nClass[i] >= 1) {
				answer += 1;
			}
		}
		return answer;
	}

}
