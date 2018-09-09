package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class baekjun2448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[]= new String[n];
	    
		int i,j,m;
        int height = 3;
        int k = (int) (Math.log(n/3) / Math.log(2)); 
        
    	arr[0] = "  *  ";
        arr[1] = " * * ";
        arr[2] = "*****";
        
        String space = "   ";
        
       for(i=0; i<k; i++) {
    	   for(j=0; j<height; j++) {
    		   arr[height + j] = arr[j] + " " + arr[j];
    		   for(m=0; m<height/3; m++) {
    			   arr[j] = space + arr[j] + space;
    		   }
    	   }
    	   height = height + height;
       }
       
        
        for(String star : arr) {
        	System.out.println(star);
        }
	}
}
