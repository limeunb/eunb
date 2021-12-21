
public class TypeCastingExample {

	
	 public static void main(String[] args) {
		 // 정수형 데이터 타입 (38p)
		 // (short)을 넣으면 오류 수정, 명시적 형변환
		 int a= 10; // 4 bytes
		 short b = (short)a; // 2 bytes

	 
		 
		 // 묵시적 형변환
		 short c = 10; // 2 bytes
		 int d = c; // 4 bytes
		 
		 
		 // byte x = 128; // 범위가 1bytes -128~127범위
		               // 범위 벗어남 
		 
		  int a1 = 128;
		  byte x1 = (byte)a1;
		  
		 System.out.println(x1); //--쓰레기값이 들어감(-128) error
		 
		 
	 }
}
