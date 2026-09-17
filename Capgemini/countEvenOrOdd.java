package Capgemini;


import java.util.*;

public class countEvenOrOdd {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9,12};
        int oddCount=0;
        int evemCount=0;
        ArrayList<Integer>res=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                evemCount++;
            }else{
                oddCount++;
            }
        }
        res.add(evemCount);
        res.add(oddCount);
        System.out.print(res+"");
        
    }

    
}