package tcs;

public class smollestNumber {
    public static void main(String[] args) {
        int a=5;
        int b=1;
        int c=2;

        if(a<b && a<c){
            System.out.println(a);
        }else if(b<a && b<c){
            System.out.println(b);

        }else{
            System.out.println(c);
        }
    }
    
}
