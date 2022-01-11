import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



public class NaverPriceAPP {

 public static void main (String []args) throws Exception {
	 
	 // 사용자가 규칙을 어기고 맥북프로 50000 1000000
	 // 이란 값을 넣었을 떄, maxprice에는 십만원을 integer로 변환이 불가
	 // 따라서 exception을 발생시킨다. 
//	 String goodsName = args[0];
//     int minPrice = Integer.parseInt(args[1]);
//     int maxPrice=  Integer.parseInt(args[2]);
//
     // 1. 개발자가 처리하는 방식
     // try {} catch() {} finally {}
	     
	 String goodsName= "";
	 int minPrice = 0, maxPrice = 0;
	 
	 try {
	 goodsName = args[0];
     minPrice = Integer.parseInt(args[1]);
     maxPrice=  Integer.parseInt(args[2]);
	 } catch(NumberFormatException ne) {
		 System.out.println ("사용법 > java NaverPriceAPP 상품명 최소가격 최대가격");
		 System.out.println ("ex > java NaverPriceAPP 아이패드 50000 1000000");
		 
	     	// return;
	       } catch(ArrayIndexOutOfBoundsException ae) {
			 System.out.println("3개 넣어");
			// return; 
	       } catch(Exception ae) {
	         System.out.println("왜 틀린거야");
	      //   return; 
		 }finally {
			 System.out.println("왜!! 틀리는거");
		 
	 }
	 	String URL = "https://search.shopping.naver.com/search/all?maxPrice=50000&minPrice=10000&query=아이패드&sort=price_asc";
	 	URL = String.format(URL, maxPrice, minPrice,goodsName);
	 	 System.out.println(URL);
//         String html = getHtml(URL);
//         System.out.println(html);
	 	 
	 	//getHtmlByJsoup(URL);
 }
  
        private static void getHtmlByJsoup(String pUrl) throws  Exception {
        	
        	Connection conn =Jsoup.connect(pUrl);
        	Document html =conn.get();
        	System.out.println(html.toString());
        	
        }
 
	 	 private static String getHtml(String pUrl) throws Exception {
	
	 		 String result = "";
	 		 HttpURLConnection conn; // 웹 연결 클래스
	 		 BufferedReader rd;   // 라인단위 input 클래스
	 		 String line;              // 라인단위로 읽을 string을 임시 저장 
	 		 
	 		 URL url = new URL(pUrl);
	 		 conn = (HttpURLConnection)url.openConnection();
	 		 conn.setRequestMethod("GET");
	 		 
	 		 rd = new BufferedReader (new InputStreamReader (conn.getInputStream()));
	 		while((line = rd.readLine()) != null) {
	 		 result +=line + "n"; 
	 		}
	 		rd.close();
	 		 return result;
	 		 
//	 	 //String.format(URL, args) // string 클래스의 static 메소드 
//     // '이종석'의 '집'은 '독산동입'니다. 
//         string name = "이종석";
//         string name = "집";
//         string dong = "독산동";
//         
//         System.out.println(name +"의+ "+ home +"은" +dong + "입니다");
//         string format = "%s의 %s의 %s입니다; // %s  문자열 %d 숫자 "
//         format = s
 }

}
