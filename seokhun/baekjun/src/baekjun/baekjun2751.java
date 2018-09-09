package baekjun;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class baekjun2751 {
	
	private static void QuickSort(int[] arr, int left, int right) {
		// TODO Auto-generated method stub
		if(left<right) {
			int newPivot = partition(arr,left,right);
			QuickSort(arr,left,newPivot-1); //ÇÇº¿ ¿ÞÂÊ Á¤·Ä
			QuickSort(arr,newPivot+1,right);
		}
	}
	public static int partition(int arr[], int left, int right) {
	      
        int pivot = arr[(left + right) / 2];
      
        while (left < right) {
            while ((arr[left] < pivot) && (left < right))
                left++;
            while ((arr[right] > pivot) && (left < right))
                right--;
      
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
      
        return left;
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine().trim());
    int arr[] = new int[N];
    
    for(int i=0;i<N;i++) {
        arr[i] = Integer.parseInt(br.readLine().trim());
    }
    QuickSort(arr,0,N-1);
    
    for(int i=0;i<N;i++)
        sb.append(arr[i]+"\n");
    
    System.out.println(sb);
    
    }

	
}