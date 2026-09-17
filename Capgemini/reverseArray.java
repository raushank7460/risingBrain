package Capgemini;

public class reverseArray {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    
}
