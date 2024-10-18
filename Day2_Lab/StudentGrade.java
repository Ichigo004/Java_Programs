import java.util.Scanner;

public class StudentGrade
{
	public static void main(String [] args)
	{
		Scanner ref = new Scanner (System.in);
		
		System.out.print("Enter the Grade of Student : ");
		int grade = ref.nextInt();
		
		System.out.println("Result of Student");
		
		if(grade <= 50)
		{
			System.out.println("Pass");
		}
		else if(grade > 50 && grade <= 60)
		{
			System.out.println("Second Class");
		}
		else if(grade > 60 && grade <= 75)
		{
			System.out.println("First Class");
		}
		else
		{
			System.out.println("Distinction");
		}
	}
}