import java.util.Scanner;
import java.lang.Math;
public class Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle");
		int p = sc.nextInt();
		
		System.out.println("Enter rate of interest");
		int rate = sc.nextInt();
		
		System.out.println("Enter time period");
		int time = sc.nextInt();
		
		System.out.println("Menu Driven for Interest");
		System.out.println("1 -> Simple Interest");
		System.out.println("2 -> Compound Interest");
		
		System.out.println("Enter the choice");
		int choice  = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Simple Interest");
				int si = (p* rate * time) / 100;
				System.out.println(si);
				break;
			}
			
			case 2:
			{
				System.out.println("Compound Interest");
				System.out.println("Enter the time period elapsed");
				int n = sc.nextInt();
				double amount = (p * Math.pow(( 1 + ( rate / time)), n *time));
				double ci = amount - p;
				System.out.println(ci);
				break;
			}
			default:
			break;
		}
	}
}

	
		