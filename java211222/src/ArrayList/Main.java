package ArrayList;

import java.util.ArrayList;

import PocketMon.PocketMon;

public class Main {

	public static void main(String[] args) {
		
		// 가변적인 배열과 같은 형태를 가지고있는 클래스 ArrayList
		// ArrayList 생성하기
		// ArrayList <저장할 데이터 자료형> 변수명
		// <> >> 제네릭기법
		// : ArrayList 를 생성하는 순간에 저장할 자료형을 결정하는 기법
		
		// 객체형태의 자료만 저장 가능하다 (int boolean, cha등  기본자료형은 저장이 안된다.)
		 
		ArrayList<String> list = new ArrayList<String>();
		//갑 추가하기
		
		list.add("gkdl");
		list.add("진로");
		list.add("바다");
		
		// 값 가져오기
		System.out.println(list.get(0));
		
		// 값 지우기
		list.remove(0);
		
		System.out.println(list.get(1));
		
		list.add("백반");
		list.add("라면");
		
		// 저장되어있는 데이터의 총 크기 가져오기
		System.out.print(list.size());
		System.out.println("");
		
		// 전부 출력
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
			
		// ArrayList안에 있는 모든 데이터 삭제하기
		list.clear();
		System.out.println(list.size());
		
		}
		
		
		
		
	}

}
