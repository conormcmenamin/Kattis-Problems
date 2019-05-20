package Solutions;

import java.util.*;

public class Modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<>();
		int ar[] = new int[42];
		
		while(scan.hasNextLine()) {
			int m = Integer.parseInt(scan.nextLine());
			ar[m%42]++;
		}
		int counter = 0;
		for(int i = 0; i<= ar.length-1;i++) {
			if(ar[i] !=0) {
				counter++;
			}
		}
		System.out.println(counter );
	}

}
