package Capgemini;

public class secondLargest {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int one=Integer.MIN_VALUE;
        int two=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>one){
                two=one;
                one=nums[i];
            }else if(nums[i]>two && nums[i]!=one){
                two=nums[i];
            }
        }
        if(two==Integer.MIN_VALUE){
            System.out.println("-1");
        }
        System.out.println(two);
    }
    
}
