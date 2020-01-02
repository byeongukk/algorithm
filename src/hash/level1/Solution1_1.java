package hash.level1;

import java.util.Arrays;

public class Solution1_1 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i=0; i<completion.length; i++) {
			
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		
		return participant[i];
	}
}
