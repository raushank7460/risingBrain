package TwoPointer;

public class trapingRainWater {
    public static void main(String[] args) {
        int[]nums={4,2,0,3,2,5};

        int n=nums.length;
        int l=0;
        int r=n-1;

        int leftmax=0;
        int rightmax=0;
        int water=0;

        while(l<r){
            if(nums[l]<=nums[r]){
                if(nums[l]>=leftmax){
                    leftmax=nums[l];
                }else{
                    water+=leftmax-nums[l];
                }
                l++;
            }else{
                if(nums[r]>=rightmax){
                    rightmax=nums[r];
                    
                }else{
                    water+=rightmax-nums[r];

                }
                r--;
            }
        }
        System.out.println(water);
        
    }
    
}
