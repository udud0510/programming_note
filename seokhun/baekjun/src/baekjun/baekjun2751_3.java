package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjun2751_3 {
	static int result[];
	private static void mergeSort(int left, int right, int[] arr) {
		// TODO Auto-generated method stub
		int mid;
		if(left<right) {
			mid = (left + right)/2;
			mergeSort(left,mid,arr);
			mergeSort(mid+1,right,arr);
			merge(left,mid,right,arr); //다 쪼갠 후 하나로 합친다.
		}
	}
	private static void merge(int left, int mid, int right, int[] arr) {
		// TODO Auto-generated method stub
		int l = left; //쪼개진 첫 번째 배열의 첫 인덱스
		int m = mid+1; //쪼개진 두 번째 배열의 첫 인덱스
		int k = left; //새로 삽입될 배열의 첫 인덱스
		
		while(l<=mid || m<=right) { //쪼개진 두 배열의 원소를 비교해가면서 새로운 배열에 삽입 
			if(l<=mid && m<=right) { // 두 배열 모두 비교가 필요한 원소가 남아있다면
				if(arr[l]<=arr[m]) { //첫 번째 배열과 두 번째 배열을 비교해서 작은 값 삽입
					result[k] = arr[l++];
				}else {
					result[k] = arr[m++];
				}
			}else if(l<=mid && m > right) {//두 번째 배열은 비교할 원소가 남아 있지 않은경우
				result[k] = arr[l++];
			}else {	//첫 번째 배열은 비교할 원소가 남아 있지 않은 경우
				result[k] = arr[m++];				
			}
			k++;			
		}
		for(int i=left; i<right+1; i++) {
			arr[i] = result[i];
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		result = new int[n];
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(0,n-1,arr);
		
		for(int i=0; i<n; i++) {
			sb.append(result[i]+"\n");
			System.out.println(sb);
		}
	}
	

}
