package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0, check=0;
		
		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			check = 0;
			for(int j=1; j<=a; j++) {
				if(a%j ==0 ) {
					check++;
				}
			}
			
			if(check == 2) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
