//--  상속과 오버라이딩 /오버로딩
public class Application4 {

	 public static void main(String args[]) {
		 
		 Asian[] arr = new Asian[3];
		 arr[0]=new Asian();
		 arr[1]=new Japanese2();
		 arr[2]=new Korea2();
		 
		 for(int i = 0; i < arr.length; i ++) {
			 System.out.println(arr[i].getAge());
		 }
	 }
}

class Asian {
	
	String name; // 이름
	int age = 20;  // 나이
	
	void sayHello() {
	 System.out.println("hello");	
	}
	 
	int getAge() { //나이 메서드
       return age;
		
	}
}

// 상속은 class 클래스명 extends 아빠클래스명 
// 1. 오버라이딩 (중첩)
// 오버라이딩은 린턴타입 / 메소드명 / 매게변수가 모두 동일 
class Japanese2 extends Asian {
    int getAge() {
    	return age -1;
    	
    }
}
class Korea2 extends Asian {
	int getAge() {
	 return age;
	}
}