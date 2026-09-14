package TwoPointer;

public class validPalindrome {
    public  static  boolean isPalindrome(String s){
        int n=s.length();
        int l=0;
        int r=n-1;

        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;

            }
            l++;
            r--;
        }
        return  true;
    }
    public static void main(String[] args) {
        String s="race a car";
        //  String s="apa";
        System.out.println(isPalindrome(s));

        
        
        
    }
    
}
