public class ReverseAnArray {
  
    public static void main(String args[]) {
      
      int[] arr = {1,2,3,4,5};
      int len = arr.length;
      
      int lowIndex = 0;
      int highIndex = len-1;
      
      while(lowIndex < highIndex){
        
          int temp = arr[lowIndex];
          arr[lowIndex] = arr[highIndex];
          arr[highIndex] = temp;
          
          lowIndex++;
          highIndex--;
      }
     
     for(int i : arr){
      System.out.println(i);   
     }
      
    }
}
