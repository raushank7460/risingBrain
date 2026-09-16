package TwoPointer;

public class validpalindromeTwo {
    public static boolean isPalindrome(String s){
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return palindrome(s,l+1,r)||
                palindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        palindrome(s, l, r);
        return  true;
    }
    public  static boolean palindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return  true;
    }
   
    
    public static void main(String[] args) {
        String s= "abcaf";
        System.out.println(isPalindrome(s));
       
      


    }
    
}


