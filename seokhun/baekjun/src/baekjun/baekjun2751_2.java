package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baekjun2751_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			ArrayList<Integer> data = new ArrayList<Integer>();
			for(int i=0; i<n; i++) {
				data.add(Integer.parseInt(br.readLine()));
			}
			Collections.sort(data);
			for(int i=0; i<n; i++) {
				System.out.println(data.get(i));
			}
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 :" + (end-start)/1000.0);
	}

}
