import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		
		int n1 = sc.nextInt();
		
	    int n2 = sc.nextInt();
	    
	    int add = addition (n1,n2);
	    		
	    int sub = subtraction (n1,n2);	
	    
	    int mul = multiplication (n1,n2);
	    
	    System.out.println("Sum of numbers is :"+add);
	    
	    System.out.println("Sub of numbers is :"+sub);
	    
	    System.out.println("mul of numbers is :"+mul);;
	    
	    }
	
	static int addition(int n1 , int n2)
	{
		int x = n1+n2;
		return x;
	}
	
	static int subtraction(int n1 , int n2)
	{
		int x = n1-n2;
		return x;
	}
	
	static int multiplication(int n1 , int n2)
	{
		int x = n1*n2;
		return x;
	}

     }
