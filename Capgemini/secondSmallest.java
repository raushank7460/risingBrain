package Capgemini;

public class secondSmallest {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<one){
                two=one;
                one=nums[i];
            }else if(nums[i]<two && nums[i]!=one){
                two=nums[i];
            }
        }
        if(two==Integer.MAX_VALUE){
            System.out.println("-1");
        }
        System.out.println(two);
        
    }
    
}
