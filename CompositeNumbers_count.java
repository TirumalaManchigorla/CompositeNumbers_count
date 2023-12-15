import java.util.Scanner;

class CompositeNumbers_count
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum value:");
        int min = sc.nextInt();
        System.out.println("Enter maximum value:");
        int max = sc.nextInt();
        int compositeCount = 0;

        System.out.println("Composite numbers between " + min + " and " + max + ":");

        for (int num = min; num <= max; num++) 
		{
            int count = 0;
            for (int i = 1; i <= num; i++)
			{
                if (num % i == 0) 
				{
                    count++;
                }
            }
           if (count > 2)
			{				// A number is composite if it has more than two divisors
                System.out.print(num + " ");
                compositeCount++;
            }
        }

       System.out.println("\nNumber of composite numbers: " + compositeCount);
    }
}
