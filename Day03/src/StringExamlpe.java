
public class StringExamlpe {

	public static void main(String[]args) {
		
		// 변수 선언, 사용
		// 데이터 타입(자료형) 변수명; <--선언
		// 데이터타입(자료형) 변수명 = 값; <-- 선언과 동시에 초기화 
		
		
		// string name = "임은비";
		String name;
		String home;
		String description;
		
		name="임은비";
		home="광명";
		
	    description=name+"는 집은"+home+"이다.";
		
		char c_name=description.charAt(0);
		
		
		//문자형은 "청수형"
		
		System.out.println(c_name);
		System.out.println(description);
		

	
	}
}
