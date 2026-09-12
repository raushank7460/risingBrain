package TwoPointer;

public class ContinerWithMostWater {
    public  static  int CWMW(int[]height){
        int n=height.length;

        int l=0;
        int r=n-1;

        int maxAreas=0;

        while(l<r){

            int width= r-l;
            int minheight=Math.min(height[l],height[r]);

            int Area= width * minheight;

            maxAreas=Math.max(maxAreas, Area);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        
        }
        return  maxAreas;
    }
    public static void main(String[] args) {
         int[]height = {1,8,6,2,5,4,8,3,7};
        
        System.out.println(CWMW(height));
        

        
    }
    
}
