
public class ex02_jay {

	public static void main(String[] args) {
		int i1 = 10;
        long l1 = i1; // 자동 형변환
        
        System.out.println(l1);
        
        long l2 = 15;
        int i2 = (int)l2; // 강제 형변환
        
        System.out.println(i2);
        // 정수형 데이터를 실수타입 데이터에 대입할때는 자동형 변환
        int i3 = 17;
        double d1 = i3;
        float f1 = i3;
        long l3 = 23;
        float f2 = l3;
        
        System.out.println(f2);
        //시룻형 데이터를 정수타입 변수에 대입할때는 강제 형변환
        float z1 = 10.4585f;
        long c2 =(long)z1;
        
        System.out.println(c2);
        
        
        
        
        
               	
          
	}

}
