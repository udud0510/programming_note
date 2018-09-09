package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class baekjun1181 {
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Set<String> hash = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			hash.add(st.nextToken());
		}
		
		int hashSize = hash.size();
		String sortArr[] = new String[hashSize];
		
		hash.toArray(sortArr); //해쉬에 담긴 값을 배열에 담아줌
		Arrays.sort(sortArr);
		
		Arrays.sort(sortArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});
		
		for(String result : sortArr) {
			bw.write(result);
			bw.write("\n");
		}
		bw.flush();
	}

}


