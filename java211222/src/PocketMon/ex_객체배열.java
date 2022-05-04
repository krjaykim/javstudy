package PocketMon;

import java.util.Arrays;

public class ex_객체배열 {

	public static void main(String[] args) {
	
		//객체배열 생성
		PocketMon[]bag	=	new PocketMon[3];
		//생성 되지 않는다면 기본값으로 null값을 갖는다
		System.out.println(bag[2]);
		
		
		//bag >> 3칸짜리 매열이 저장되어 있는 주소값을 가진 레퍼런스 변수
		System.out.println(bag);
		
		//bag[0]에 값 넣기!
		bag[0] = new PocketMon("롱스톤", "돌", 1, "머리박치기", 100, 100, 100);	
		//실제로 생성한 객체가 어디 저장되어있는지를 가리키는 주소값
		System.out.println(bag[0].getName());
		
		
		
		
		
		
	}

}
