
//단항연산자(증감연산)

public class OpExample {

	
	public static void main(String[]args) {
		
	}

			  // 1. ++
			int a = 10;
	        a ++; // a=a+1;
            
	        System.out.println("a++=" +a);
            ++a; // a+1;
            System.out.println("++a=" +a); //12
            
           
            int b = 10;
            System.out.println(b++);  //10
            System.out.println(b);   // 11
            
            // 두번째에 내려가면서 덥셈
             
            int c= 10;
            System.out.println(++c); //11
            System.out.println(c); // 11
            
            //--
            
            // 
            int d = 10;
            System.out.println(d--);  // 10
            System.out.println(d);    // 9
            
            int e = 10;
            System.out.println(--e); //9 
            System.out.println(e);  //9
            
            
            
}
	
	
