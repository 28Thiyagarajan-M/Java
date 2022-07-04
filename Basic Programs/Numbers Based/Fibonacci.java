import java.util.Scanner;
public class Fibonacci
{
    public static void main(String [] args)
    {   
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int n0 = 0;
        int n1 = 1;
        fib(limit,n0,n1);
     }

    static void fib(int limit,int n0, int n1){
        System.out.print(n0+" "+n1+" ");
         int n2;
        for(int i = 0; i<limit; i++)
        {
            n2 = n0+n1;
            n0 = n1;
            n1 = n2;
            System.out.print(n2);
            System.out.print(" ");
        }        
    }
}
