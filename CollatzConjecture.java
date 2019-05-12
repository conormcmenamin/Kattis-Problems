package Solutions;

import java.util.*;

public class CollatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new 	Scanner(System.in);
		long n = scan.nextLong(), Sn = 0;
		long m = scan.nextLong(), Sm = 0;
		long c = 1;
		ArrayList<Long> arn = new ArrayList<>();
		ArrayList<Long> arm = new ArrayList<>();
		long store = 0;
		while((n>0)&&(m>0)) {
			arn = getSequence(n,arn);
			arm = getSequence(m,arm);
			
			if(m == 1) {
				System.out.println(n +" needs " + (arn.size()-1) + " steps, 1 needs 0 steps, they meet at 1");
			}else if(n==1) {
				System.out.println("1 needs 0 steps, " + m + " needs "+ (arm.size()-1) + " steps, they meet at 1");
			}else {
				store = m;
				while(m>1) {
					for(int i = 0; i<= arn.size()-1;i++) {
						if(m == arn.get(i)) {
							Sn = i;
							c = m;
							m = 1;
							i = arn.size();
						}
					}
					if(m != 1) {
						Sm++;
					}
					m = nextCollatz(m);
				}
			System.out.println(n + " needs " + Sn + " steps, " + store + " needs " + Sm + " steps, they meet at " + c);
			}
			Sn = 0;
			Sm = 0;
			c=0;
			arn.clear(); 
			arm.clear();
			n = scan.nextLong();
			m = scan.nextLong();
		}
	}
	
	public static ArrayList<Long> getSequence(long n, ArrayList<Long> arn ){
		arn.add(n);
		while(n>1) {
			if(n%2==0) {
				n /=2;
			}else {
				n *= 3;
				n+=1;
			}
			arn.add(n);
		}
		return arn;
	}
	static long nextCollatz(long n) {
		if(n == 1) {
			return 1;
		}else if(n%2==0) {
			return n/2;
		}else {
			return 3*n+1;
		}
	}

}
