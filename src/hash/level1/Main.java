package hash.level1;

public class Main {
	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
			
		String[] participant = new String[] {"leo","kiki","eden"};
		String[] completion = new String[] {"eden","kiki"};
		
		String[] participant2 = new String[] {"marina","josipa","nikola","vinko","filipa"};
		String[] completion2 = new String[] {"josipa","filipa","marina","nikola"};	
		
		String[] participant3 = new String[] {"mislav","stanko","mislav","ana"};
		String[] completion3 = new String[] {"stanko","ana","mislav"};
		
		String[] participant4 = new String[] {"mislav","stanko","mislav","ana","stanko"};
		String[] completion4 = new String[] {"stanko","ana","mislav","stanko"};
		
		System.out.println(s.solution(participant, completion));
		System.out.println(s.solution(participant2, completion2));
		System.out.println(s.solution(participant3, completion3));
		System.out.println(s.solution(participant4, completion4));
	}
}
