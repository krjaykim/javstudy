package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 외부 jar 파일 넣는 방법
		// 프로젝트 마우스 우클릭 >> build path >> configure build path
		// 탭 다섯개중에 libraries 탭으로 들어가기
		// module path와 class path 로 구분되어있다면 반드시 class path 선택하기
		// 하나만 있따면 상관없음
		// 1) Add jars >> workspace 내부에 있는 jar 파일만 접근 가능
		// 2) Add external jars >> workspace를 벗어난 다른 공간의 jar 파일도 접근 가능

		// 노래를 재생할 수 있는 도구 생성하기
		MP3Player mp3 = new MP3Player();
		// 노래 재생하기
		// 공통 주소하나 만들기
		String path = "C:\\Users\\SMHRD\\Desktop\\jay\\java211223\\player";
//		mp3.play(path+"\\Butterfly.mp3");
//		mp3.stop();
//		mp3.play(path+"\\Rollin.mp3");
		// 노래가 재생중인지 여부 판단하는 메소드
//		System.out.println(mp3.isPlaying());

		// Music 설계도면을 기반으로 총 4개의 객체 생성
		// 1. m1 >> Butterfly, 전영호, 주소값
		// 2. m2 >> Rollin, 브레이브걸스, 주소값
		// 3. m3 >> Dolphin, 오마이걸, 주소값
		// 4. m4 >> Peaches, 저스틴비버, 주소값

//		Music m1 = new Music("Betterfly", "전영호", path+"\\Butterfly.mp3");
//		Music m2 = new Music("Rollin", "브레이브걸스", path+"\\Rollin.mp3");
//		Music m3 = new Music("Dolphin", "오바이걸", path+"\\Dolphin,mp3");
//		Music m4 = new Music("Peaches", "저스틴비버", path+"\\Peaches,mp3");
//		

		ArrayList<Music> mList = new ArrayList<Music>();

		mList.add(new Music("Betterfly", "전영호", path + "\\Butterfly.mp3"));

		mList.add(new Music("Rollin", "브레이브걸스", path + "\\Rollin.mp3"));

		mList.add(new Music("Dolphin", "오바이걸", path + "\\Dolphin.mp3"));

		mList.add(new Music("Peaches", "저스틴비버", path + "\\Peaches.mp3"));

		int i = 0;
		
		while (true) {
			System.out.println("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>>> ");
			int put = sc.nextInt();
			if (put == 1) {
				System.out.println("====재생====");
				
				//1. 노래가 재생중인지 여부를 판단
				if(mp3.isPlaying()) {
				mp3.stop();
			
				}
					
				mp3.play(mList.get(i).getParh());
				
				//2. 재생중이라면 멈추기
				
				//3. 재생중이 아니라면 재생
			} else if (put == 2) {
				System.out.println("====정지====");
				
				//1. 노래가 재생중인지 , 여부 판단하기
				if(mp3.isPlaying()==true) {
					System.out.println("노래 멈춰");
					mp3.stop();
				}else {
					System.out.println("재생중인 노래가 없습니다.");
				//2. 재생중이라면 노래를 멈추기
				
				//3. 재생중이 아니라면 재생중인 노래가 없습니다. 출력하기
				}		
				
				
				
				
				
			} else if (put == 3) {
				System.out.println("====이전곡====");
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
	            i--;
	            if (0 > i) {
	               System.out.println("이전곡이 없습니다.");
	               i++;
	            } else {
	               mp3.play(mList.get(i).getParh());
	            }

					
					
						
		
			} else if (put == 4) {
				   System.out.println("======다음곡======");

		            // 1. 재생중인 노래가 있다면
		            if (mp3.isPlaying()) {
		               // 2. 노래멈추기
		               mp3.stop();
		            }
		            // 3. musicList안에 있는 다음곡 재생하기
		            i++;
		            // 단, musicList안에 다음곡이 없다면 다음곡이 없습니다 출력하기
		            // Hint! 다음곡이 없다는 건 musicList의 크기를 벗어났다는 거
		            if (3 < i) {
		               System.out.println("다음곡이 없습니다.");
		               // i라는 값을 musicList의 마지막 인덱스로 바꾸기
		               i--;
		            } else {
		               mp3.play(mList.get(i).getParh());
		            }
	
				
				
				
			} else if (put == 5) {
				System.out.println("====종료====");
				break;
			
			} else {
				System.out.println("잘못 입력했습니다.");
			
			
			} 
			
			
			
			
			
			
			
			
			}	

		}

	}
	
	
