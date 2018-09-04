import java.util.Scanner;

public class stringlength {

	

	public static void main(String[] args) 
	
	        {
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter the string :");
		
		String str = sc.next();
		
		int length = strLen(str);
		
	   System.out.println(length);
		
			}
	
	static int strLen(String x)
	
	{
		
	 int L = x.length();
	 
	 return L;
	 
	}
	 
    }
