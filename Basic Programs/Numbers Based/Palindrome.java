import java.util.Scanner;

public class Palindrome
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        char str[] = s.next().toCharArray();
        //isNumPali(n);
        isStrPali(str);
    }    
    
    static void isNumPali(int n)
    {
        int n1 = n;
        int temp,sum = 0;
        while(n1>0)
        {
            temp = n1%10;
            sum = sum*10 + temp;
            n1 = n1/10;
        }

        if(n == sum)
        System.out.println("Yes!! Palindrome");
        else
        System.out.println("No!! Not a Palindrome");
    }

    static void isStrPali(char str[])
    {
        char str_cpy[] = str;
        char rev[] = new char[10];
        int len = str_cpy.length;
        //System.out.println("LEN"+len);
        for(int i = 0; i<len; i++)
        {
            //System.out.println(i);        
            rev[i] = str_cpy[len-i-1]; 
        }
        System.out.println(rev);
    }
}
