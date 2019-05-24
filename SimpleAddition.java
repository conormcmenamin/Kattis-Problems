package Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BigInteger  n = new BigInteger(scan.nextLine());
		BigInteger m = new BigInteger(scan.nextLine());
		System.out.println(n.add(m));
	}

}
