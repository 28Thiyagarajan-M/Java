public class MyClass {
    public static void main(String args[]) {
      int heights []= {1,0,2,1,3,1,2,0,3};
      
      TrappedWater problem = new TrappedWater();
      
      System.out.println(problem.solve(heights));
    }
}

class TrappedWater{

    public int solve(int[] heights){
        
        if (heights.length < 3){
            return 0;
        }
        
        int leftMax[] = new int[heights.length];
        int rightMax[] = new int[heights.length];
        
        leftMax[0] = 0;
        rightMax[heights.length-1] = 0;
        
        for(int i = 1; i < heights.length ; i++){
            leftMax[i] = Math.max(leftMax[i-1], heights[i-1]);
        }
        
        for(int i = rightMax.length-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], heights[i+1]);
        }
        
        int trapped = 0;
        
        for(int i = 1; i< heights.length-1 ; i++){
            if(Math.min(leftMax[i],rightMax[i]) > heights[i])
            trapped += Math.min(leftMax[i],rightMax[i]) - heights[i];
        }
        
        return trapped;
    }    
}
