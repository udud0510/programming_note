package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2577 {
	
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	int result = A * B * C;
	
	int num[] = new int[9];
	
		while(result>0) {
			num[result%10]++;
			result = result/10;
		}
		
		for(int arr : num) {
			System.out.println(arr);
		}
	
	}
	
}
