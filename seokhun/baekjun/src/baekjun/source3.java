package baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class source3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a=0,i=0,j=0,k=0,cnt=0,count=0;
		
		int arr[][]=null;
		for(i=0; i<t; i++) {
			a = sc.nextInt();
			arr = new int[a][a];
			System.out.println(arr.length);
			for(j=0; j<arr.length; j++) {
				for(k=0; k<arr[j].length; k++) {
					arr[j][k] = sc.nextInt();
					
				}
				
			}
			
			 
            for(int m=1; m<arr.length-1; m++) {
                for(int n=1; n<arr[m].length-1; n++) {
                   
                         
                    /*if(arr[m-1][n-1] != 0 && arr[m-1][n] != 0 &&
                            arr[m-1][n+1] != 0 && arr[m][n-1] !=0 && arr[m][n] !=0
                            && arr[m][n+1]!=0 && arr[m+1][n-1] !=0 && arr[m+1][n] !=0
                            && arr[m+1][n+1] !=0) {
                        count++;
                    }*/
                	if(arr[m-1][n-m] != 0 && arr[m-1][n] != 0 &&
                            arr[m-1][n+m] != 0 && arr[m][n-m] !=0 && arr[m][n] !=0
                            && arr[m][n+m]!=0 && arr[m+1][n-m] !=0 && arr[m+1][n] !=0
                            && arr[m+1][n+m] !=0) {
                        count++;
                    }
                }
                }
			
			System.out.println("#"+(i+1)+" "+(count));
		}
		
	}

}