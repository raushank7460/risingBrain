package tcs;

public class palindromeNumber {
    public static boolean isFlag(int num){
        int original=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(original==rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num=121;
        System.out.println(isFlag(num));
    }
    
}
