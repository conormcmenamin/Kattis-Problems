package Solutions;

import java.util.Scanner;

public class Trik {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String moves = scan.nextLine();				//Take in the moves from user input
		System.out.println(findPlaceAfter(moves));
	}
	static int findPlaceAfter(String moves) {
		boolean place[] = new boolean[3]; 			//Boolean array tracking place with ball
		place[0] = true;							//The ball always starts in the leftmost cup position
		int i = 0;
		for( i = 0; i <moves.length();i++) {
			
			if(moves.charAt(i) == 'A') {
				if(place[0] || place[1]) {
					place[0] = !place[0];
					place[1] = !place[1];
				}
				
			}
			else if(moves.charAt(i) == 'B') {
				if(place[1] || place[2]) {
					place[1] = !place[1];
					place[2] = !place[2];
				}
			}
			else {
				if(place[0] || place[2]) {
					place[0] = !place[0];
					place[2] = !place[2];
				}
				
			}
		}
		i = 0;
		while(place[i] != true) {
			i++;
		}
		return (i+1);
		
		
	}
	
}
