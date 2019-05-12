package Solutions;

import java.util.Scanner;

public class CryptgraphersConundrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String per = "Per";
		int counter = 1;
		int n = 0;
		for(int i = 0; i<s.length();i++) {
			if(counter>3) {
				counter = 1;
			}
			if(s.substring(i,i+1).equalsIgnoreCase(per.substring(counter-1,counter))) {
				n++;
			}
			counter++;
		}
		System.out.println(s.length()-n);
	}

}
