package TwoPointer;

public class validpalindromeTwo {
    public  static  boolean isflag(String s){
        String s1=s;
        for(int i=0;i<s.length();i++){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "abc";
        int n=s.length();
        System.out.println(isflag(s));


    }
    
}


