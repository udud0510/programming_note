package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjun1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int temp=0;
		
		char []arr = new char[num.length()];
		for(int i=0; i<num.length(); i++) {
			arr[i] = num.charAt(i);
		}
		
		for(int i=0; i<num.length()-1; i++) {
			for(int j=0; j<num.length()-i-1; j++) {
				if(arr[j+1]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = (char) temp;
				}
			}
		}
		
		for(char a : arr) {
			System.out.print(a);
		}
	}
}
