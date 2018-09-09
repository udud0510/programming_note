package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result1, result2;
		
		result1 = ((a%10) * 100) + ((a%100)/10 * 10) + a/100;
		result2 = ((b%10) * 100) + ((b%100)/10 * 10) + b/100;
		
		if(result1>result2) {
			System.out.println(result1);
		}else {
			System.out.println(result2);
		}
	}

}
