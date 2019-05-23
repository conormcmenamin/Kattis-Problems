package Solutions;


import java.util.*;
public class Provinces_and_Gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int gold = scan.nextInt(), silver = scan.nextInt(), copper = scan.nextInt();
		int power = (gold*3) + (silver*2) + copper;
		
		if(power>=8) {
			System.out.println("Province or Gold");
		}else if(power>=5) {
			System.out.print("Duchy");
			if(power>=6) {
				System.out.print(" or Gold");
			}else {
				System.out.print(" or Silver");
			}
		}else if(power>=2) {
			System.out.print("Estate");
			if(power>=3) {
				System.out.print(" or Silver");
			}else {
				System.out.print(" or Copper");
			}
		}else {
			System.out.println("Copper");
		}
	}

}
