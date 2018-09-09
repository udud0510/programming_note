package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
	    int n = sc.nextInt();
	    
	    sc.nextLine();
	    
	   
	   for(int i=0; i<n; i++) {
		   String str = sc.nextLine();
		   int cnt=0;
		   int sum=0;
		   for(int j=0; j<str.length(); j++) {
			   if(str.charAt(j)=='O') {
				   cnt++;
				   sum = sum + cnt;
			   }else {
				   cnt=0;
			   }
		   }
		   System.out.println(sum);
	   }	   
	}
}
