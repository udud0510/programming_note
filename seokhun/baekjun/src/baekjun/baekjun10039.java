package baekjun;

import java.util.Scanner;

public class baekjun10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,result = 0;
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			arr[i] = n;
			if(arr[i]<40) {
				arr[i] = 40;
			}
			result = result + arr[i];
		}
		
		System.out.println(result/5);
		
	}

}
