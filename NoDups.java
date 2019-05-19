package Solutions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class NoDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String ar[] = scan.nextLine().split(" ");
		
		HashMap<String, Integer> map  = new HashMap<>();
		
		for(int i = 0; i<=ar.length-1;i++) {
			if(map.containsKey(ar[i])) {
				map.replace(ar[i], map.get(ar[i]) + 1);
			}else {
				map.put(ar[i],1);
			}
		}
		int max = Collections.max(map.values());
		
		if(max>1) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
		
	}

}
