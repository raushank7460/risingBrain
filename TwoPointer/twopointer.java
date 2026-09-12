package TwoPointer;

import java.util.Arrays;

public class twopointer {
    public static int[]sum(int[]num,int target){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int sum=num[left]+num[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return  new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]num={1,2,3,4,5,6,7};
        int target=12;
        System.out.println(Arrays.toString(sum(num, target)));
       
    }
    
}
