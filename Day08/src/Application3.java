
public class Application3 {

	public static void main (String args[]) {
		// -- 객체를 생성하는 방법
		
		MathExample math = new MathExample();
	    int sum = math.plus(10,20);
	    System.out.println(sum);
	    
	    //Stack 구조 Last In First out (LIFO)
	    System.out.println(math.minus(math.plus(10, 20),100));


	}
}


//-- 1. 클래스 정의
 
class MathExample {
	
	// f(x,y) = (x+y)
	
	 //ㅡㅡㅡ속성(필드)ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
	//String name;
	//int age;
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	//-- 메소드들 (행위)
	//-- 메소드 문법
	//-- [접근한정자] 리턴데이터타입 메소드명 (매게변수){
	// 행동문단
	//}
	
	//void sayHello(String name) {
		//System.out.println(name);
	
	// void 리턴이 없는 메소드 
	void printName() {
		System.out.println("안녕");
	}
	
	int plus(int x, int y) {
		return x +y;
	}
	 int minus(int x, int y) {
		 return x-y;
		
	}
}