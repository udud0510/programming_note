package baekjun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjun1260_1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //정점의 개수
		int m = sc.nextInt(); //간선의 개수
		int v = sc.nextInt(); //시작할 정점의 번호
		
		//배열을 1로 초기화
		int matrix[][] = new int [n+1][n+1];
		for(int i=1; i<=m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			matrix[x][y]=1;
			matrix[y][x]=1;
		}
		
		//DFS and BFS
		int check[] = new int [matrix[0].length];
		System.out.println("matrix[0].length : " + matrix[0].length);
		DFS(matrix, check, v);
		System.out.println("");
		check = new int[matrix[0].length];
		BFS(matrix, check, v);
	}

	private static void BFS(int[][] matrix, int[] check, int m) {
		// TODO Auto-generated method stub
		//인접리스트를 사용해 구현시
		//속도 측면에서 좋음
		Queue<Integer> q = new LinkedList<Integer>();
		
		check[m]=1;
		q.add(m);
		
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for(int i=0; i<matrix[0].length; i++) {
				if(matrix[node][i]==1 && check[i]==0) {
				check[i]=1;
				q.add(i);
				}
			}
			
		}
		
	}

	private static void DFS(int[][] matrix, int[] check, int m) {
		// TODO Auto-generated method stub
		System.out.print(m+" "); //스택에 담긴 노드를 출력하고
		check[m]=1; //방문했으니 1로
		
		for(int i=1; i<matrix[0].length; i++) {
			//길이 있고, 아직 방문하지 않았으면
			if(matrix[m][i]==1 && check[i]==0) {
				//자식노드 호출(재귀함수)
				DFS(matrix, check, i);
			}
		}
	}

}





