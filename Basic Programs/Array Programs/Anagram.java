import java.util.*;

public class Anagram
{
    public static void main(String args[]) {
     
     System.out.println(check("levhel".toCharArray(), "levhel".toCharArray()));
      
    }
    
    public static boolean check(char c1[], char c2[]){
        
        if(c1.length != c2.length) return false;
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        for(int i =  0; i < c1.length; i++){
            if(c1[i] != c2[i]) return false;
        }
        
        
        return true;
        
    }
}
