//문제명	: 전화번호 목록(해시)
//난이도	: Lv2
//해결일	: 20.08.24
//블로그	: O

package programmers_Lv2;

import java.util.Arrays;

public class PhoneNumList {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		boolean answer = solution(phone_book);
		System.out.println("answer : " + answer);

	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length; i+=1) {
        	for(int j=i+1; j<phone_book.length; j+=1) {
        		String[] arrStr = phone_book[j].split(phone_book[i]);
        		//System.out.println(Arrays.toString(arrStr));
        		if(arrStr.length >= 2) {
        			//System.out.println("false");
        			return false;
        		}
        	}
        	//System.out.println(Arrays.toString(arrStr));
        }
        //System.out.println("true");
        return answer;
    }

}
