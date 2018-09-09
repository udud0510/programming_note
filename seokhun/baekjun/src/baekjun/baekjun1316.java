package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjun1316 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int count = n;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String word = st.nextToken();
	
			boolean check[] = new boolean[26]; //boolean ±âº»°ª true
			
			for(int j=1; j<word.length(); j++) {
				if(word.charAt(j-1) != word.charAt(j)) {
					if(check[word.charAt(j)-97]==true) {
					count--;
					break;				
					}
					check[word.charAt(j-1)-97] = true;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
	}
}
