
// -- Application 실행 스타팅 포인트
public class Application {

	public static void main(String[] args) {
             Person p = new Person(); // 내 눈앞에 보이는 거 (가시화) = 메모리에 올라와 있다. 
             p.name = "이종석";
             p.sayHello();
             
             Person p2 =new Person();
             p.name = "하악하악";
             p.sayHello();
             
             // -- 주소같 비고로 같을 수 없다. 
            
             if(p==p2) {
            	 System.out.println("p와 p2는 같아요." );
             }else {
            	 System.out.println("p와 p2는 같지 않아요.");
            	 
             }
             //-- 객체를 자체를 비교하는 것(같은 클래스 출신이냐?) = instanceof 연산자.
             if(p instanceof Person) {
              // 실행내용
             }
             if(p2 instanceof Person) {
            	  // 실행내용
             }       
             

}
	// class 문법
	//[접근한정자] class 클래스명 {//내용}

class Person1 {
	
	String name; // 속성, 필드 
	
	public void sayHello() {
		System.out.println("안녕하세요.");
	}
}