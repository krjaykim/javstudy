package Baseball;
import java.util.Random;
import java.util.Scanner;

public class ���� {

	public static void game(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		      Random rd = new Random();
		      int locationnum = 1; // ������ġ ��ȣ �������� ���� ����
		      int row = 0; // ���� ��ġ ��
		      int column = 0;// ���� ��ġ ��(Ÿ�� ���忡���� Ȩ�� Ÿ��)
		      int swing_row = 0;// ���� ��ġ ��
		      int swing_column = 0;// ���� ��ġ ��
		      int[][] strikezone = new int[5][5];
		      
		      int ���� = 0;
		      int Ȩ�� = 0;
		      int strike��� = 0;
		      int ball���=0;
		      int ball = 0;
		      int strike = 0;
		      int out = 0;
		      int ��Ÿ = 0;
		     
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
				
			 
		      System.out.print("  ���� �Ͻʽÿ�   >> ");
		      int location = sc.nextInt();/// ������ġ ��ȣ ���� �ϱ�!

		      System.out.println("Ÿ�� ����!");
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
		      System.out.println("���� ��"+"("+row+")"+"���� �� "+"("+column+")"+" = "+location);
		      System.out.print(swing_row + "+" + swing_column);
		      System.out.println("Ÿ�� ��"+"("+swing_row+")"+"+"+"Ÿ�ڿ�"+"("+swing_column+")"+" = "+strikezone[swing_row][swing_column]);
		      if (swing_row == row) {
		         if (swing_column == column) {
		            System.out.println("Ȩ���̴�!");
		            System.out.println("����   :  ����~~~~~~~~~ (����� ��ü���߽��ϴ�)");
		            ++Ȩ��;
		            break;
		            
		         } else {
		            if (location == 1 || location == 5 || location == 21 || location == 25) {
		               System.out.println("��~~~~����~~~~");
		               ++strike;
		               System.out.println("(��Ʈ����ũ)"+strike+" , "+"(��)"+ball+" , "+"(�ƿ�)"+out);
		               System.out.println();
		            } else {
		               System.out.println("��Ÿ�̴�!");
		               ++��Ÿ;
		               strike = 0;
		               ball =0;
		              System.out.println();
		               if(��Ÿ>=4) {
		            	   System.out.println("���� : ����~~~~~~~~~~~~~~~ (����� ��ü�Ǿ����ϴ�)");
		            	   System.out.println();
		            	   break;
		               }
		            }
		         }
		      } else {
		    	  if(location == 1 || location == 5 || location == 21 || location == 25) {
		    		  System.out.println("ball");
		    		  ++ball���;
		    		  ++ball;
		    		  
		    		  if(ball==4) {
		    			 ball = 0; strike =0;
		    			  
		    			++��Ÿ;
		    			  
		    		  }
		    		  System.out.println("(��Ʈ����ũ)"+strike+" , "+"(��)"+ball+" , "+"(�ƿ�)"+out);
		    		  System.out.println();
		    	  }else {
		    		  
		    	
		         System.out.println("��~~Ʈ~~����ũ~");
		         ++strike���;
		         ++strike;
		         System.out.println("(��Ʈ����ũ)"+strike+" , "+"(��)"+ball+" , "+"(�ƿ�)"+out);
		         System.out.println();
		         if(strike==3) {
		        	 System.out.println("���� �ƿ�~~~~~~~~~~~~~~~~~~~!!!");
		        	 ++����;
		        	 strike = 0;
		        	 ball = 0;
		        	 ++out;
		        	 System.out.println();
		         }
		      }  }

		
		      
		      
		      }
		
		
	}
	}


