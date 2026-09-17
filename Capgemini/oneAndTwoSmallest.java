package Capgemini;

import java.util.*;

public class oneAndTwoSmallest {
    public static void main(String[] args) {
        int[]nums={1,1,1};
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<one){
                two=one;
                one=nums[i];
            }else if(nums[i]<two && nums[i]!=one){
                two=nums[i];
            }

        }
        if(two==Integer.MAX_VALUE){
            res.add(-1);
        }else{
            res.add(one);
            res.add(two);
        }
        System.out.print(res+"");
    }
    
}
