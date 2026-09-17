package tcs;
// to find a largest number in give three number
public class largestNumberAmongThree {
    public static void main(String[] args) {
        int a=-10;
        int b=-5;
        int c=-3;
        if(a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        
    }
    
}
