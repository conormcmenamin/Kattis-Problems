package Solutions;
import java.util.*;
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ar[][] = new int [5][4];
		int sum = 0;
		int maxsum = 0;
		int pos = 0;
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j<=4;j++) {
				sum += scan.nextInt();;
			}
			if(sum>maxsum) {
				maxsum = sum;
				pos = i;
			}
			sum = 0;
		}
		System.out.println(pos + " " +maxsum);
	}

}
