
public class Application5 {

}

class Bus {
	
	int wheel = 4;
	
	void pushButton() {
        System.out.println("문열림");
	}
	void pushButton(int count) {
		if(count <= 3) {
			System.out.println("문열림");
		}else {
			System.out.println("그만 누르세요");
		}
	}
	
}
