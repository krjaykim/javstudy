package Baseball;
import java.util.Random;
import java.util.Scanner;

public class 게임 {

	public static void game(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		      Random rd = new Random();
		      int locationnum = 1; // 던질위치 번호 넣으려고 만든 변수
		      int row = 0; // 던진 위치 행
		      int column = 0;// 던진 위치 열(타자 입장에서는 홈런 타점)
		      int swing_row = 0;// 스윙 위치 행
		      int swing_column = 0;// 스윙 위치 열
		      int[][] strikezone = new int[5][5];
		      
		      int 삼진 = 0;
		      int 홈런 = 0;
		      int strike기록 = 0;
		      int ball기록=0;
		      int ball = 0;
		      int strike = 0;
		      int out = 0;
		      int 안타 = 0;
		     
		      System.out.print("NAME >>");
				String name = sc.next(); 
		      
				
		 
		      
		      for (int i = 0; i < strikezone.length; i++) {
		         for (int j = 0; j < strikezone.length; j++) {
		            strikezone[i][j] = locationnum;
		            locationnum++;
		            System.out.print(strikezone[i][j] + "\t");
		         }
		         System.out.println();

		      }

		      while (out<4) {
				
			 
		      System.out.print("  투구 하십시오   >> ");
		      int location = sc.nextInt();/// 던진위치 번호 저장 하기!

		      System.out.println("타자 스윙!");
		      swing_row = rd.nextInt(5);
		      swing_column = rd.nextInt(5);

		      for (int i = 0; i < strikezone.length; i++) {
		         for (int j = 0; j < strikezone.length; j++) {

		            if (location == strikezone[i][j]) {
		               row = i;
		               column = j;
		            }
		         }
		      }
		      System.out.print(row + "+" + column);
		      System.out.println("투수 행"+"("+row+")"+"투수 열 "+"("+column+")"+" = "+location);
		      System.out.print(swing_row + "+" + swing_column);
		      System.out.println("타자 행"+"("+swing_row+")"+"+"+"타자열"+"("+swing_column+")"+" = "+strikezone[swing_row][swing_column]);
		      if (swing_row == row) {
		         if (swing_column == column) {
		            System.out.println("홈런이다!");
		            System.out.println("감독   :  나가~~~~~~~~~ (당신은 교체당했습니다)");
		            ++홈런;
		            break;
		            
		         } else {
		            if (location == 1 || location == 5 || location == 21 || location == 25) {
		               System.out.println("헛~~~~스윙~~~~");
		               ++strike;
		               System.out.println("(스트라이크)"+strike+" , "+"(볼)"+ball+" , "+"(아웃)"+out);
		               System.out.println();
		            } else {
		               System.out.println("안타이다!");
		               ++안타;
		               strike = 0;
		               ball =0;
		              System.out.println();
		               if(안타>=4) {
		            	   System.out.println("감독 : 나가~~~~~~~~~~~~~~~ (당신은 교체되었습니다)");
		            	   System.out.println();
		            	   break;
		               }
		            }
		         }
		      } else {
		    	  if(location == 1 || location == 5 || location == 21 || location == 25) {
		    		  System.out.println("ball");
		    		  ++ball기록;
		    		  ++ball;
		    		  
		    		  if(ball==4) {
		    			 ball = 0; strike =0;
		    			  
		    			++안타;
		    			  
		    		  }
		    		  System.out.println("(스트라이크)"+strike+" , "+"(볼)"+ball+" , "+"(아웃)"+out);
		    		  System.out.println();
		    	  }else {
		    		  
		    	
		         System.out.println("스~~트~~라이크~");
		         ++strike기록;
		         ++strike;
		         System.out.println("(스트라이크)"+strike+" , "+"(볼)"+ball+" , "+"(아웃)"+out);
		         System.out.println();
		         if(strike==3) {
		        	 System.out.println("삼진 아웃~~~~~~~~~~~~~~~~~~~!!!");
		        	 ++삼진;
		        	 strike = 0;
		        	 ball = 0;
		        	 ++out;
		        	 System.out.println();
		         }
		      }  }

		
		      
		      
		      }
		
		
	}
	}


