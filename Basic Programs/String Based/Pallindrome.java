import java.util.*;

public class Pallindrome
{
    public static void main(String args[]) {
     System.out.println(check("levely".toCharArray()));
    }
    
    public static boolean check(char c1[]){
        
        int lowIndex = 0;
        int highIndex = c1.length-1;
        
        while(lowIndex < highIndex ){
            if(c1[lowIndex++] == c1[highIndex--]) continue;
            else return false; 
                
        }
        
        
        return true;
        
    }
}
