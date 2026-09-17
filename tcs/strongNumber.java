package tcs;

public class strongNumber {
    public static void main(String[] args) {
        int num=145;
        int original=num;
        int sum=0;

        while(num>0){
            int digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if(original==sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
