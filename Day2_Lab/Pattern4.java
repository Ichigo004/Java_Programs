public class Pattern4
{
	public static void main(String [] args)
	{
		int rows = 3;
		
		for(int i = rows; i >= 1; i--)
		{
			for(int j = 1; j <= (2 * i - 1); j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i >= 1; i--)
		{
			 for (int j = 1; j <= (2 * i - 1); j++) 
			{
                System.out.print("*");
            }
            System.out.println();
	}
}