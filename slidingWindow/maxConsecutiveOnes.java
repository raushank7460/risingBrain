package slidingWindow;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[]nums={1,1,1,0,1,0,1,0,1};

        int n=nums.length;
        int left=0;
        int max=0;
        for(int right=0 ; right<n;right++){
            if(nums[right]==1){

                max=Math.max(max,right-left+1);
            }else{
                left=right+1;
            }


        }
        System.out.println(max);
    }
    
}
