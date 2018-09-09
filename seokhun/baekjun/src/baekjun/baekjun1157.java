package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase();
		
		int arr[] = new int[26];
		int n;
		int max = 0;
		char answer = 0;
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-65]++;
			if(arr[str.charAt(i)-65]>max) {
				answer = str.charAt(i);
				max = arr[str.charAt(i)-65];
			}else if(max == arr[str.charAt(i)-65]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
		
	}

}
