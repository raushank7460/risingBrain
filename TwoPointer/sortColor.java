package TwoPointer;

public class sortColor {
    public static void main(String[] args) {
        int[]nums = {2,0,2,1,1,0};
        int n=nums.length;

        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    
}
