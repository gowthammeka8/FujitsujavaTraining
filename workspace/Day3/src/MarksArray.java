import java.util.Scanner;

public class MarksArray {
	
	public static void main(String[]args){
		int[] marks = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values into Marks String:");
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		sc.close();
		int totalscore = 0;
		for(int i=0 ; i<marks.length ;i++)
		{
			
			totalscore = totalscore+marks[i];
			
		}
		
		int averagescore = (totalscore)/marks.length;
		
		System.out.println("The sum of all 3 scores :"+totalscore+"The average of all scores :" + averagescore);
		
	}

}
