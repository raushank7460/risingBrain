package TwoPointer;

import java.util.Arrays;

// leetcode 167
public class twoSumTWO {
    public static  int[] sum(int[]nums,int target){
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==target){
                return new int[]{l+1,r+1};
            }else if(sum>target){
                r--;

            }else{
                l++;
            }
        }
        return  new int[]{-1,-1};    }
    public static void main(String[] args) {
        int[]nums= {2,7,11,15}; 
        int target = 9;
        System.out.println(Arrays.toString(sum(nums, target)));
        
    }
    
}
