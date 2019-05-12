package Solutions;

import java.util.*;

public class Bijele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int should[] = {1,1,2,2,2,8};
		int has[] = new int[6];
		for(int i = 0; i<= 5; i++) {
			has[i] = should[i] -Integer.parseInt(scan.next());
		}
		
		for(int i = 0; i<= 5; i++) {
			System.out.print(has[i] + " " );
		}
	}

}
