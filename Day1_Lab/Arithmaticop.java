import java.util.Scanner;
public class Arithmaticop
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter Second number");
		int b = sc.nextInt();

		 
		System.out.println("Menu");
		System.out.println("1.Addition");
		System.out.println("2.Sbstraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		
		System.out.println("Enter choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 :
			{
			 System.out.println("Addition of two number is ");
			 int c = a + b;
			 System.out.println(c);
			 break;
			}
			
			case 2 :
			{
			 System.out.println("Substraction of two number is ");
			 int c = a - b;
			 System.out.println(c);
			 break;
			}
			
			case 3 :
			{
			 System.out.println("Multiplication of two number is ");
			 int c = a * b;
			 System.out.println(c);
			 break;
			}
			
			case 4 :
			{
			 System.out.println("Division of two number is ");
			 int c = a / b;
			 System.out.println(c);
			 break;
			}
			default :
			break;
		}
	}
}