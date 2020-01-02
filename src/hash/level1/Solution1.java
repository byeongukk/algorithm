package hash.level1;

public class Solution1 {
    
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		
		for(int i=0; i < participant.length; i++) {
			for(int j=0; j < completion.length; j++) {
				
				//참가자와 완주자가 같을 경우 공백으로 배워냄
				if((participant[i].equals(completion[j]))) {
		   			participant[i] = "";
		   			completion[j] = "";
					break;
				}
				
				//완주자 목록에 참가자가 없을 경우 answer에 입력
				if(j == completion.length-1) {
					answer = participant[i];
				}
			}
		}
		
	
		
		
		return answer;
	}

}

