package tcs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153; //100 pr false
        int original=num;
        int sum=0;
        while (num>0) {
            int digit=num%10;
            sum+=digit*digit*digit;
            num/=10;
            
        }
        if(original==sum){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    
}
