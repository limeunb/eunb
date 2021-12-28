
public class MonthExample {

 public static void main(String args[]) {
	 
  if(args.length == 0) {
	  System.out.println("usag: java MonthExample{month}");
  } else {
	  String[] arrMonthName = {
			  
			  "Jan",
			  "Feb",
			  "Mar",
			  "Apr",
			  "May",
			  "June",
			  "July",
			  "Aug",
			  "Sept",
			  "Oct",
			  "Nov",
			  "Dec",
	  };
	  int command = Integer.parseInt(args[0]) -1;
	  System.out.println(arrMonthName[command]);
	  
  }

 }
 
}