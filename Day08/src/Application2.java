
public class Application2 {
 
	public static void main(String[] args) {
//	 Korean K = new Korean();
 //    K.name = "나는 한국인";
  //   K.sayHello();
    
		
		Person p = new Janpanese();
		p.name = "나까무라";
		p.sayHello();
	}
}
// class 문법
//[접근한정자] class 클래스명 {//내용}

class Person{
	
	String name; // 속성, 필드 
		
	public void sayHello() {
		System.out.println(name+"입니다. 안녕하세요.");
	}
}

// 상속은 extends [Class명]
 class Korean extends Person{
  public void sayHello() {
	  System.out.println(name+"입니다. 안녕하세요");
  }
}

class Janpanese extends Person{
	public void sayHello() { 
	 System.out.println(name+"입니다. 안녕하세요");
	}
}

class Chinese extends Person{
	public void sayHello() { 
		 System.out.println(name+"입니다. 안녕하세요");
	
	}
}
