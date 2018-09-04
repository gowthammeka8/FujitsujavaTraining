import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Password:");
		String str = sc.next();
		if(str.equals("gowtham"))
		{
			System.out.println("Access Granted");
			
		}
		else
		{
			System.out.println("Acess Denied");
		}
	}

}
