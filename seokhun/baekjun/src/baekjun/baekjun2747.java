package baekjun;

import java.util.Scanner;

public class baekjun2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		result = fibonacci(n);
		System.out.println(result);
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		int a = 0;
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			a = fibonacci(n - 1) + fibonacci(n - 2);
		return a;
	}
}
