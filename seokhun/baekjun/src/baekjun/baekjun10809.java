package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char word[] = str.toCharArray();
		int arr[] = new int[26];
		
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}
		
		for(int i=0; i<word.length; i++) {
			for(int j=97; j<=122; j++) {
				if(j == word[i] && arr[j-97] == -1) {
					arr[j-97] = i;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
