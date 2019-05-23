package Solutions;
import java.util.*;
public class Planina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long points = (long)(Math.pow((Math.pow(2, n)+1),2));
		System.out.println(points);
	}

}
