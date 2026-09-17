package tcs;

public class productOfdigit {
    public static void main(String[] args) {
        int num=123;
        int product=1;
        while(num>0){
            int digit=num%10;
            product*=digit;
            num/=10;
        }
        System.out.println(product);
    }
    
}
