package baekjun;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjun1260 {
	
	//n= 정점의개수, m= 간선의개수, v=시작할 정점의 번호
	public static int n, m, v;
	//간선이 연결하는 두 정점의 번호
	public static int x, y;
	
	public static int graph[][] = new int[1001][1001];
	public static boolean visited[] = new boolean[10001];
	
	public static void DFS(int v) {
		System.out.print(v + " "); //방문된 점 출력
		visited[v] = true; //방문했으니 true
		
		for(int i=1; i<=n; i++) {
			//정점 v와 i가 연결되어있고 ==1 , 아직 방문하지 않았으면 visited==false
			if(graph[v][i] == 1 && visited[i] == false) {
				DFS(i); // 재귀함수 호출
			}
		}
		
	}
	
	public static void BFS(int v) {
		//연결리스트를 사용한 큐 생성
		Queue<Integer> queue = new LinkedList<Integer>();
		int out;
		
		//큐에 시작점 추가
		queue.offer(v);
		visited[v] = true; //방문표시
		
		
		//큐에 값이 없을때까지 실행
		while(!queue.isEmpty()) {
			//큐에서 값 가져옴
			
			out = queue.poll();
			System.out.print(out + " ");
			for(int i=1; i<=n; i++) {
				if(graph[out][i] == 1 && visited[i] == false) {
					queue.offer(i); //방문안한 점을 찾으면 큐에 저장
					visited[i]=true;					
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		v = sc.nextInt();
		
		//입력받은 간선의 개수만큼
		for(int i=1; i<=m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			//양방향 이므로
			graph[x][y] = graph[y][x] = 1;
		}
		
		DFS(v);
		
		//dfs가 수행된 후 visited를 초기화시켜야 bfs 수행시 문제가 안생김
		for(int i=1; i<=n; i++) {
			visited[i] = false;
		}
		
		System.out.println();
		BFS(v);
		
		sc.close();
	}

}
