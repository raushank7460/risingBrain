package Capgemini;
import java.util.*;
public class countPosAndNeg {
    public static void main(String[] args) {
        int[]nums={1,-1,2,-2,3,-3,-4,4,5};
        int posCount=0;
        int negCount=0;
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posCount++;
            }else{
                negCount++;

            }
        }
        res.add(posCount);
        res.add(negCount);
        System.out.print(res+"");
    }
    
}
