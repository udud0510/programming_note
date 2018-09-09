package baekjun;

import java.util.Scanner;

public class Deque {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		String command = null;
		
		ArrayDeck deck = new ArrayDeck(k);
		
		for(int i=0; i<k; i++) {
			command = sc.nextLine();
			String[] temp = command.split(" ");
			
			if(temp[0].equals("push_front")) {
				deck.push_front(Integer.parseInt(temp[1]));
			}else if(temp[0].equals("push_back")) {
				deck.push_back(Integer.parseInt(temp[1]));
			}else if(temp[0].equals("pop_front")){
				System.out.println(deck.pop_front());
			}else if(temp[0].equals("pop_back")){
				System.out.println(deck.pop_back());
			}else if(temp[0].equals("size")){
				System.out.println(deck.size());
			}else if(temp[0].equals("empty")){
				System.out.println(deck.empty());
			}else if(temp[0].equals("front")){
				System.out.println(deck.front());
			}else if(temp[0].equals("back")){
				System.out.println(deck.back());
			}
			
		}
		sc.close();		
	}

}
class ArrayDeck{
	private int[] deck;
	private int rear = -1;
	
	public ArrayDeck(int n) {
		deck = new int[n];
	}
	
	public void push_front(int value) {
		rear++;
		//System.out.println("rear : "+  rear);
		for(int i=rear; i>0; i--) {
			deck[i] = deck[i-1];
		}
		deck[0] = value;
		
	}
	
	public void push_back(int value) {
		rear ++;
		deck[rear] = value;		
	}
	
	public int pop_front() {
		if(rear <= -1) {
			return -1;
		}
		int temp = deck[0];
		
		for(int i=0; i<rear; i++) {
			deck[i] = deck[i+1];
		}
		
		rear--;
		return temp;
	}
	
	public int pop_back() {
		if(rear <= -1) {
			return -1;
		}
		int temp = deck[rear];
		rear --;
		return temp;
	}
	
	public int size() {
		if(rear <= -1) {
			return 0;
		}else {
			return rear + 1;
		}
	}
	
	public int empty() {
		
		if(rear <= -1) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int front() {
		if(rear <= -1) {
			return -1;
		}else {
			return deck[0];
		}
	}
	
	public int back() {
		System.out.println("backÀÇ rear :"+rear);
		if(rear <= -1) {
			return -1;
		}else {
			for(int i=0; i<deck.length; i++) {
			System.out.println("µ¦ :"+deck[i]);
			}
			return deck[rear];
		}
	}
}
