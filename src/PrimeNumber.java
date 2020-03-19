import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int input;
        int i=2;
        boolean check=true;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number:");
        input=sc.nextInt();

        if (input<2)
        {
            System.out.printf("Number %d is not prime",input);
        }
        else
        {
            for (i=2; i<input-1; i++)
            {
                if (input%i==0)
                {
                    check=false;
                    break;
                }
            }

            if (check)
            {
                System.out.printf("Number %d is a prime", input);
            }
            else
            {
                System.out.printf("Number %d is not a prime", input);
            }
        }
    }
}
