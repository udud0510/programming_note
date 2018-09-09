package baekjun;



import java.util.Scanner;

public class baekjun2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String croatia[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String str = sc.nextLine();
				
		for(int i=0; i<8; i++) {
			str = str.replace(croatia[i], "a");
		}
        
		System.out.println(str.length());				
	}
}
