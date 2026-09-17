package Capgemini;

import java.util.ArrayList;

public class oneAndTwoLargest {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int one=Integer.MIN_VALUE;
        int two=Integer.MIN_VALUE;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>one){
                two=one;
                one=nums[i];
            }else if(nums[i]>two && nums[i]!=one){
                two=nums[i];
            }
        }
        if(two==Integer.MIN_VALUE){
            res.add(-1);
        }
        else{
            res.add(one);
            res.add(two);
        }
        System.out.print(res+"");
    }
    
}
