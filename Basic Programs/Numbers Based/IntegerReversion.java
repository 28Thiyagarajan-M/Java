import java.util.*;

public class IntegerReversion
{
    public static void main(String args[]) {
     int n = 1234;
     System.out.println(reversion(n));
      
    }
    
    public static int reversion(int n ){
        
        int c = n;
        int rev = 0;
        
        while(n > 0){
                int rem = n%10;
                rev = rev*10 + rem;
                n = n/10;
        }
        
        
        return rev;
        
    }
}
