
public class MultipleArrayExample2 {

	public static void main(String[] args) {
		
		char[][] arr=new char[2][];
		
		arr[0] = new char[3];
		arr[1] = new char[3];
		
		for(int x =0;x<2;x++) {
		    for(int y =0;y<3;y++) {
		    	arr[x][y]=(char)y;
		    	
		    }
		}
		
		for(int x =0;x<2; x ++) {
		    for(int y =0;y<3;y++) {
		    	System.out.println("arr["+x+"]["+y+"]="+(int)arr[x][y]);
		   }
		}
	}
}
