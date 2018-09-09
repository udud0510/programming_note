package baekjun;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		String arr[] = {"a","a","b","c","d","e"};
		Set<String> set = new HashSet<String>();
		
		//객체를 추가하는 두가지 방법
		for(int i=0; i<arr.length; i++) { //배열의 길이만큼 반복문
			set.add(arr[i]);
		}
		for(String str:arr) { //요소를 하나씩 저장
			set.add(str);
		}
		
		System.out.println(set);
		
		set.remove("b");
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}

}
