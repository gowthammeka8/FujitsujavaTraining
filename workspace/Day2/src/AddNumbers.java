import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		int total = add(n1,n2,n3);
		System.out.println(total);

	}
	static int add(int n1,int n2,int n3)
	{
		int t = n1+n2+n3;
		return t;
		
	}

}
