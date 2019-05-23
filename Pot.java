package Solutions;


import java.util.*;
public class Pot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0; i <n;i++) {
			int num = scan.nextInt();
			int power = num%10;
			num/=10;
			sum += Math.pow(num, power);
		}
		System.out.println(sum);
	}

}
