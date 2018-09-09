package baekjun;

import java.util.Scanner;

public class baekjun11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char c = sc.next().charAt(0);
		int a;
		char d;
		if(Character.isUpperCase(c)) {
			a = c;
			System.out.println(a);
		}else if(Character.isLowerCase(c)) {
			a = c;
			System.out.println(a);
		}else {
			d = c;
			a = d;
			System.out.println(a);
		}
	}

}
