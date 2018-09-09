package baekjun;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjun1152 {
//String str[] = sc.nextLine().split(" ");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println(st.countTokens());
		
	}

}
