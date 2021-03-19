
public class Stringmethods {

	public static void main(String[] args) {

		 String str = new String("hello javatpoint how r u");  
	      char[] ch = new char[10];  
	         str.getChars(1, 7, ch, 0);  
	         System.out.println(ch); 

	}

}
