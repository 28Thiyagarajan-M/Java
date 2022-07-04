import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        //int limit = s.nextInt();
        //primeNumberSeries(limit);
        
        int n = s.nextInt();
        if(isPrime(n) == 1)
        System.out.print("YES");
        else
        System.out.print("No");
    }

    static void primeNumberSeries(int limit)
    {
       
        for(int i = 1; i<limit; i++)
        {
            if(isPrime(i)==1)
            System.out.print(i+" ");
            
        }
    }

    static int isPrime(int n)
    {
        int count = 0;
        for(int i = 2; i<n; i++)
        {
            if(n%i == 0)
            count++;
        }
        if (count == 0)
            return 1;
        else
            return 0;
    }

}
