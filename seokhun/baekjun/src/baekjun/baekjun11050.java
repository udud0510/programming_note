package baekjun;

import java.util.Scanner;

public class baekjun11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = bin(a,b);
		System.out.println(result);
	}

	private static int bin(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0 || a==b) {
			return 1;
		}else {
			return bin(a-1,b-1) + bin(a-1,b);
		}
	}
}
