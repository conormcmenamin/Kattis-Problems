package thePackage;

import java.util.HashSet;
import java.util.Scanner;

public class Celverta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuple ar[]= new Tuple[4];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<3;i++) {
			ar[i] = new Tuple(Integer.parseInt(scan.next()),Integer.parseInt(scan.next()));
		}
		ar[3]=new Tuple();
		if(ar[0].getX()==ar[1].getX()) {
			ar[3].setX(ar[2].getX());
		}else if(ar[0].getX()==ar[2].getX()){
			ar[3].setX(ar[1].getX());
		}else if(ar[1].getX()==ar[2].getX()){
			ar[3].setX(ar[3].getX());
		}
		
		if(ar[0].getY()==ar[1].getY()) {
			ar[3].setY(ar[2].getY());
		}else if(ar[0].getY()==ar[2].getY()){
			ar[3].setY(ar[1].getY());
		}else if(ar[1].getY()==ar[2].getY()){
			ar[3].setY(ar[0].getY());
		}
		System.out.println(ar[3].getX()+" "+ar[3].getY());
	}
	
	

}

class Tuple{
	private int y;
	private int x;
	
	public Tuple() {}
	public Tuple(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		this.x = x;
		
	}
	public void setY(int y) {
		this.y = y;
		
	}
	public int getY() {
		return this.y;
	}
	
	public int getX() {
		return this.x;
	}
}
