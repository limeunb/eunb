
public class ConstExample {
	
	//-- 변수란 변할 수 있는 수
	//-- 상수는 변할 수 없는 수
	public static void main(String args[]) {
		int age = 10;
		System.out.println(age);
		
		age = 20;
		System.out.println(age);
		
		// 상수는 final 키워드를 사용
		// final 데이터타입(자료형) 상수명=값
		
		 final double PI = 3.14;
		 System.out.println(PI);
		 
		 PI =3.20; // -- 상수는 변경할 수 없으므로 에러 
		 System.out.println(PI);
		 
	}

}
