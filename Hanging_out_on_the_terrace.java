package thePackage;

import java.util.Scanner;

public class Hanging_out_on_the_terrace {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int limit = scan.nextInt(), events= scan.nextInt(),rejections =0;
		int current=0, n =0;
		scan.nextLine();
		for(int i=1; i<=events;i++) {
			String cmd = scan.nextLine();
			if(cmd.startsWith("enter"))
			{
				n= Integer.parseInt(cmd.substring(cmd.indexOf(' ')+1));
				if(current+n>limit) {
					rejections++;
				}else {
					current+=n;
				}
					
			}else {
				n= Integer.parseInt(cmd.substring(cmd.indexOf(' ')+1));
				current-=n;
			}
		}
		System.out.println(rejections);
		scan.close();
	}
}
