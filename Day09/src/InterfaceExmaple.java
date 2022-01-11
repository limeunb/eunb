
// 인터페이스는
// 접근제한자 interface 인터페이스명 

// ---- 인터넷 접속용 인터페이스
public class InterfaceExmaple {
    public static void main(String[] arge) {
    // 1. 추상 클래스는 new는 객체생성 가능 ? > 불가능
    // 이유는 구현이 모두 안되어 있다
    // 2. 인터페이스는 new 로 객체생성 가능 ? > 불가능
    // 이유는 a) interface는 class가 아니라서 객체생성이 불가능하다. 
    // b) 구현이 없어 > 객체생성 불가능
    // !) intetface는 너와 나의 통신규약을 만드는거 
    
    InterfaceExmaple im = new SKInternet();
    InterfaceExmaple im2 = new LGInternet();
    
    im.connect();
    im2.connect();
    
    
    }
    }
	