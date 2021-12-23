
public class AssignExample {

	public static void main(String[] args) {
		
		// -- 할당연산은 우에서 좌로
		// -- 좌측은 변수/상수, 우측은 데이터(값
		//-- '=' 할당 연산자라고 합니다.
		
		int age = 44; //변수를 선언과 동시에 44라는 값을 '할당'
		
		int age2 = 10;
		int age3 = age + age2 + 10*20;
		
		
		// 44 = int age2; < 안됨
		
		
		System.out.println("age:"+age);
		age = age + 10;
	    System.out.println("age:"+age);
	    
	    //--- 변수를 선언 후 할당
	    int age4; // 변수를 선언하고 
		
	    
	    age4 = age*10/20;
	    System.out.ptintln(age4);
	    
	    
	}
}
