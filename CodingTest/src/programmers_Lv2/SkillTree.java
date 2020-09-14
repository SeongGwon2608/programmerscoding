//문제명	: 스킬트리(Summer/Winter Coding(2019))
//난이도	: Lv2
//해결일	: 20.03.12
//블로그	: O

package programmers_Lv2;

public class SkillTree {

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int answer = solution(skill, skill_trees);
		System.out.println("answer : " + answer);

	}
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for(int i =0; i<skill_trees.length; i++) {
			if(skillCheck(skill, skill_trees[i])) {
				answer++;
			}
		}
		//System.out.println(answer);
		
		return answer;
    }
	
	public static Boolean skillCheck(String skill, String skill_trees) {
		Boolean answer = true;
		int count = 0;
		
		for(int i=0; i<skill_trees.length(); i++) {
			if(skill.charAt(count) == skill_trees.charAt(i)) {
				count++;
				if(count == skill.length())
					break;
			}else {
				for(int j=0; j<skill.length(); j++) {
					if(skill.charAt(j) == skill_trees.charAt(i))
						return false;
				}
			}
		}
		return answer;
	}
}
