package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// �ܺ� jar ���� �ִ� ���
		// ������Ʈ ���콺 ��Ŭ�� >> build path >> configure build path
		// �� �ټ����߿� libraries ������ ����
		// module path�� class path �� ���еǾ��ִٸ� �ݵ�� class path �����ϱ�
		// �ϳ��� �ֵ��� �������
		// 1) Add jars >> workspace ���ο� �ִ� jar ���ϸ� ���� ����
		// 2) Add external jars >> workspace�� ��� �ٸ� ������ jar ���ϵ� ���� ����

		// �뷡�� ����� �� �ִ� ���� �����ϱ�
		MP3Player mp3 = new MP3Player();
		// �뷡 ����ϱ�
		// ���� �ּ��ϳ� �����
		String path = "C:\\Users\\SMHRD\\Desktop\\jay\\java211223\\player";
//		mp3.play(path+"\\Butterfly.mp3");
//		mp3.stop();
//		mp3.play(path+"\\Rollin.mp3");
		// �뷡�� ��������� ���� �Ǵ��ϴ� �޼ҵ�
//		System.out.println(mp3.isPlaying());

		// Music ���赵���� ������� �� 4���� ��ü ����
		// 1. m1 >> Butterfly, ����ȣ, �ּҰ�
		// 2. m2 >> Rollin, �극�̺�ɽ�, �ּҰ�
		// 3. m3 >> Dolphin, �����̰�, �ּҰ�
		// 4. m4 >> Peaches, ����ƾ���, �ּҰ�

//		Music m1 = new Music("Betterfly", "����ȣ", path+"\\Butterfly.mp3");
//		Music m2 = new Music("Rollin", "�극�̺�ɽ�", path+"\\Rollin.mp3");
//		Music m3 = new Music("Dolphin", "�����̰�", path+"\\Dolphin,mp3");
//		Music m4 = new Music("Peaches", "����ƾ���", path+"\\Peaches,mp3");
//		

		ArrayList<Music> mList = new ArrayList<Music>();

		mList.add(new Music("Betterfly", "����ȣ", path + "\\Butterfly.mp3"));

		mList.add(new Music("Rollin", "�극�̺�ɽ�", path + "\\Rollin.mp3"));

		mList.add(new Music("Dolphin", "�����̰�", path + "\\Dolphin.mp3"));

		mList.add(new Music("Peaches", "����ƾ���", path + "\\Peaches.mp3"));

		int i = 0;
		
		while (true) {
			System.out.println("[1]��� [2]���� [3]������ [4]������ [5]���� >>>> ");
			int put = sc.nextInt();
			if (put == 1) {
				System.out.println("====���====");
				
				//1. �뷡�� ��������� ���θ� �Ǵ�
				if(mp3.isPlaying()) {
				mp3.stop();
			
				}
					
				mp3.play(mList.get(i).getParh());
				
				//2. ������̶�� ���߱�
				
				//3. ������� �ƴ϶�� ���
			} else if (put == 2) {
				System.out.println("====����====");
				
				//1. �뷡�� ��������� , ���� �Ǵ��ϱ�
				if(mp3.isPlaying()==true) {
					System.out.println("�뷡 ����");
					mp3.stop();
				}else {
					System.out.println("������� �뷡�� �����ϴ�.");
				//2. ������̶�� �뷡�� ���߱�
				
				//3. ������� �ƴ϶�� ������� �뷡�� �����ϴ�. ����ϱ�
				}		
				
				
				
				
				
			} else if (put == 3) {
				System.out.println("====������====");
				
				if(mp3.isPlaying()) {
					mp3.stop();
				}
	            i--;
	            if (0 > i) {
	               System.out.println("�������� �����ϴ�.");
	               i++;
	            } else {
	               mp3.play(mList.get(i).getParh());
	            }

					
					
						
		
			} else if (put == 4) {
				   System.out.println("======������======");

		            // 1. ������� �뷡�� �ִٸ�
		            if (mp3.isPlaying()) {
		               // 2. �뷡���߱�
		               mp3.stop();
		            }
		            // 3. musicList�ȿ� �ִ� ������ ����ϱ�
		            i++;
		            // ��, musicList�ȿ� �������� ���ٸ� �������� �����ϴ� ����ϱ�
		            // Hint! �������� ���ٴ� �� musicList�� ũ�⸦ ����ٴ� ��
		            if (3 < i) {
		               System.out.println("�������� �����ϴ�.");
		               // i��� ���� musicList�� ������ �ε����� �ٲٱ�
		               i--;
		            } else {
		               mp3.play(mList.get(i).getParh());
		            }
	
				
				
				
			} else if (put == 5) {
				System.out.println("====����====");
				break;
			
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			
			
			} 
			
			
			
			
			
			
			
			
			}	

		}

	}
	
	
