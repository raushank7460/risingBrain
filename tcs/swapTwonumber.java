package tcs;

public class swapTwonumber {
    public static void main(String[] args) {
        int a=9;
        int b=5;
        // int temp=a;
        // a=b;
        // b=temp;
         a=a^b;
         b=a^b;
         a=a^b;

        System.out.print("a ="+a+"b ="+b);
    }
    
    
}
