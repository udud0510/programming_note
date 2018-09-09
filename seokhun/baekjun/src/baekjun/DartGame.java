package baekjun;

import java.util.ArrayList;
import java.util.Arrays;

public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testCase[] = {"1S2D*3T","1D2S#10S","1D2S0T","1S*2T*3S","1D#2S*3S","1T2D3D#","1D2S3T*"};
		for(String result : testCase) {
			System.out.println(Solution(result));
		}
	}
	
	private static int Solution(String result) {
		// TODO Auto-generated method stub
		String[] num = result.split("[SDT][\\#]*[\\*]*");
		String[] str = result.split("\\d{1,2}[\\#]*[\\*]*");
		String[] str1 = result.split("[\\#]*[\\*]*\\d{1,2}");
		String[] spestr = result.split("\\d{1,2}[SDT]");
		String z = "";
		for(int i=0; i<spestr.length; i++) {
			z = z+spestr[i];
		}
		char[] t = z.toCharArray();
		System.out.println("asdf : "+Arrays.toString(t));
		System.out.println(z);
		int[] Score = new int[str1.length];
		/*String[] sdt = new String[str.length];
		for(int i=0; i<str.length; i++) {
			String s = str[i];
			switch(s){
				case "S" : sdt[i]=s; break;
				case "D" : sdt[i]=s; break; 
				case "T" : sdt[i]=s; break; 
			}
		}*/
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str1));
		System.out.println(Arrays.toString(spestr));
		
		
		for(int i=0; i<num.length; i++) {
			String s = str1[i+1];
			//t = Character.toString(spestr[i+1]);
			switch(s) {
				case "S": Score[i] = Integer.parseInt(num[i]); break;
				case "D": Score[i] = Integer.parseInt(num[i]) * Integer.parseInt(num[i]); break;
				case "T": Score[i] = Integer.parseInt(num[i]) * Integer.parseInt(num[i]) * Integer.parseInt(num[i]); break;
			}
			System.out.println("sdt스코어 : "+Arrays.toString(Score));
			
			//if(spestr[i+1])
			/*switch(t) {
				case "*": Score[i] = Integer.parseInt(num[i]) * 2; break;
				case "#": Score[i] = Integer.parseInt(num[i]) * -1; break;
			}
			System.out.println("*#스코어 : "+Arrays.toString(Score));*/
		}
		
		int answer=0;
		for(int a : Score) {
			answer = answer + a;
		}
		return answer;
		
	}

}
