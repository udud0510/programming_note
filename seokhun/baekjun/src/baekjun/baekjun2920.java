package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int asc = 0,desc = 0,mix = 0,n;
		int arr[] = new int[8];
		for(int i=0; i<8; i++) {
			n = sc.nextInt();
			arr[i] = n;
			if(arr[i]==i+1) {
				asc++;
			}else if(arr[i]==8-i) {
				desc++;
			}else {
				mix++;
			}
		}
		
		if(asc==8) {
			System.out.println("ascending");
		}else if(desc==8) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
		/*Scanner sc = new Scanner(System.in);
		
		String asc = "1 2 3 4 5 6 7 8";
		String desc = "8 7 6 5 4 3 2 1";
		
		String n = sc.nextLine();
		
		if(n.equals(asc)) {
			System.out.println("ascending");
		}else if(n.equals(desc)) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}*/
	}

}
