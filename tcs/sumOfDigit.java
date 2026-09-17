package tcs;

public class sumOfDigit {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println(sum);
    }
    
}
