package Solutions;
import java.util.*;
public class Oddities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int counter = 1;
		while(counter<=n) {
			int current = scan.nextInt();
			if(current%2==0) {
				System.out.println(current + " is even");
			}else {
				System.out.println(current + " is odd");
			}
			
			counter++;
		}
	}

}
