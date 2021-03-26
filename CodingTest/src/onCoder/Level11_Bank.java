//문제명	: 잔액계산(챌린지)
//난이도	: Level11
//해결일	: 2020.12.03
//블로그	: O

package onCoder;

public class Level11_Bank {

	public static void main(String[] args) {
		int balance = 100;
		String[] transactions = {"C 1000","D 500","D 350"};
		
		solution(balance, transactions);
	}
	
	public static int solution(int balance, String[] transactions){
        String[] str = new String[2];
        for(int i=0; i<transactions.length; i+=1){
            str = transactions[i].split(" ");
            if(str[0].equals("C")){
                balance += Integer.parseInt(str[1]);
            }else if(str[0].equals("D")){
                balance -= Integer.parseInt(str[1]);
            }
        }
        System.out.println(balance);
        return balance;
    }
}
