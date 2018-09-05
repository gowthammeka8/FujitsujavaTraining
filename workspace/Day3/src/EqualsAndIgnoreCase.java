import java.util.Scanner;

public class EqualsAndIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string you want to compare with :");
		 String str1 = sc.next();
		 String str2 = "Fujitsu";
		 sc.close();
		String x = equalsIgnoreCase(str1,str2);
	  System.out.println(x);
	    
	  }
	    static String equalsIgnoreCase(String str1, String str2) {
		
		String result = null;
		
		 if(str1.equalsIgnoreCase(str2)==true)
		 {
			result = "correct";
			 
		 }
		 else
		 {
			 result = "Incorrect";
		 }
		 
		 return result;

	       }

		
	}
