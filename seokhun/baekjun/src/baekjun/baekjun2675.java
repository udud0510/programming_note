package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2675 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		String str;
		String answer = "";
		int count;
		for (int i = 0; i < testCase; i++) {
			count = sc.nextInt();
			str = sc.next();
			answer = "";
			for (int k = 0; k < str.length(); k++) {
				for (int j = 0; j < count; j++)
					answer += str.charAt(k);
			}
			System.out.println(answer);
		}
	}
}
