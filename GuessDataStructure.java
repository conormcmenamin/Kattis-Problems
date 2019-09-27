package Solutions;

import java.util.Scanner;

public class GuessDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean array[] = new boolean[3];
		while(scan.hasNext()) {
			int n = scan.nextInt();
			array[0] = true;
			array[1] = true;
			array[2] = true;
			
			PriorityQueue PQ = new PriorityQueue();
			Queue q = new Queue();
			Stack stk = new Stack();
			
			int ar[][] = new int[n][2];
			for(int i = 0; i<= ar.length-1;i++) {
				for(int j = 0; j<= ar[i].length-1;j++) {
					ar[i][j] = scan.nextInt();
				}
			}
			
			for(int i = 0; i<= ar.length-1;i++) {
				if(ar[i][0] == 1) {
					PQ.insertSorted(ar[i][1]);
					q.insert(ar[i][1]);
					stk.push(ar[i][1]);
				}else if(ar[i][0] == 2) {
					if(PQ.dequeue() != ar[i][1]) {
						array[2] = false;
					}
					if(stk.pop() != ar[i][1]) {
						array[0] = false;
					}
					if(q.dequeue() != ar[i][1]) {
						array[1] = false;
					}
				}
			}
			
			int counter =0;
			int pos = 0;
			for(int i = 0; i <=2;i++) {
				if(array[i] == true) {
					counter++;
					pos = i;
				}
			}
			
			if(counter==0) {
				System.out.println("impossible");
			}else if(counter == 1) {
				if( pos == 0) {
					System.out.println("stack");
				}else if(pos == 1) {
					System.out.println("queue");
				}else {
					System.out.println("priority queue");
				}
			}else {
				System.out.println("not sure");
			}
		}
	}

}
class Node{
	public Node next;
	public int data;
	
	public Node() {}
	public Node(int data){
		this.data = data;
	}
}
class Stack{
	public Node head=null;
	
	public Stack() {}
	
	public boolean isEmpty() {
		return head==null;
	}
	public void push(int n) {
		Node newNode = new Node(n);
		if(this.isEmpty()) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public int pop() {
		if(this.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		else {
			Node oldhead = head;
			head = head.next;
			return oldhead.data;
		}
	}
	public int peek() {
		return head.data;
	}
	public void clear() {
		head = null;
	}
}

class Queue{
	public Stack main;
	public Stack temp;
	
	public Queue() {
		main = new Stack();
		temp = new Stack();
	}
	public boolean isEmpty() {
		return main==null;
	}
	public void insert(int n) {
		main.push(n);
	}
	public int dequeue() {
		if(main.isEmpty()) {
			return Integer.MIN_VALUE;
		}
		else {
			Node current = main.head;
			while(current.next != null) {
				temp.push(main.pop());
				current = current.next;
			}
			int n = main.pop();
			current = temp.head;
			while(current!=null) {
				main.push(temp.pop());
				current = current.next;
			}
			return n;
		}
	}
	public void clear() {
		main.head = null;
		temp.head = null;
	}
}
class PriorityQueue {
	public Node head = null;
	
	public PriorityQueue () {}
	
	public void insertSorted(int s){
		Node newNode = new Node(s);
		if(head == null) {
			head = newNode;
		}
		else{
			Node current = head;
			Node prev = null;
			while(current != null && check(current.data, newNode.data)){
				prev = current;
				current = current.next;
			}
			if(prev == null){
				newNode.next = head;
				head = newNode;
			}
			else{
				prev.next = newNode;
				newNode.next = current;
			}
		}
	}
	public boolean check(int current, int newNode )
	{
		if(newNode<current) {
			return true;
		}else {
			return false;
		}
	}
	public int dequeue() {
		if(head==null) {
			return Integer.MIN_VALUE; 
		}else {
			Node prevHead = head;
			head = head.next;
			return prevHead.data;
		}
	}
	public boolean isEmpty(){
		return(head == null);
	}
	public void clear() {
		head = null;
	}
}
