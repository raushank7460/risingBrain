package Capgemini;

public class largestEleArray {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
    
}
