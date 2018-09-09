package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a;
		int arr[] = new int[n];
		int temp;
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			arr[i] = a;
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}

}
