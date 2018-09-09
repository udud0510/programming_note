package baekjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjun10828 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		String command;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if(command.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}else if(command.equals("pop")) {
				if(stack.size()>0) {
					bw.write(stack.pop()+"\n");
				}else {
					bw.write("-1"+"\n");
				}
			}else if(command.equals("size")) {
				bw.write(stack.size()+"\n");
			}else if(command.equals("empty")) {
				if(stack.isEmpty()) {
					bw.write("1"+"\n");
				}else {
					bw.write("0"+"\n");
				}
			}else if(command.equals("top")) {
				if(stack.isEmpty()) {
					bw.write("-1"+"\n");
				}else {
					bw.write(stack.get(stack.size()-1)+"\n");
				}
			}
			bw.flush();
		}
	}

}
