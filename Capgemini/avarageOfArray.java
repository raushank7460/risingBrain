package Capgemini;

public class avarageOfArray {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        int len=nums.length;
        double sum=0;
        for(int i=1;i<len;i++){
            sum+=nums[i];

        }
        double ava=(int)(sum/len);
        System.out.println(ava); 
    }
    
}
