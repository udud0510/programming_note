package baekjun;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Management {
	
	Scanner sc = new Scanner(System.in);
	Set<String> hs = new HashSet<String>();
	
	public void Run() {
		int key = 0;
		while((key = selectMenu())!=0) {
			switch(key) {
			case 1 : addMember(); break;
			case 2 : removeMember(); break;
			case 3 : searchMember(); break;
			case 4 : listMember(); break;
			default : System.out.println("잘못 골랐다");
			}
		}
		System.out.println("종료");
	}
	int selectMenu() {
		System.out.println("1:추가 2:삭제 3:검색 4:목룍 0:종료");
		int key = sc.nextInt();
		sc.nextLine();
		return key;
	}
	void addMember() {
		String name ="";
		System.out.println("추가할 회원 이름 : ");
		name = sc.nextLine();
		
		if(hs.add(name)) {
			System.out.println("추가되었습니다");
		}else {
			System.out.println("이미 존재합니다");
		}
	}
	void removeMember() {
		String name="";
		System.out.println("삭제할 회원 이름 : ");
		name = sc.nextLine();
		
		if(hs.remove(name)) {
			System.out.println("삭제되었습니다");
		}else {
			System.out.println("존재하지 않는 회원입니다");
		}
	}
	void searchMember() {
		String name="";
		System.out.println("검색할 회원 이름 : ");
		name = sc.nextLine();
		
		if(hs.contains(name)) {
			System.out.println("검색되었습니다" + name);
		}else {
			System.out.println("검색되지 않습니다.");
		}
	}
	void listMember() {
		System.out.println("전체 목록");
		int cnt = hs.size();
		System.out.println("회원 수 : " + cnt);
		for(String name : hs) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
