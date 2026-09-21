package tcs;

public class validPalindrome {
    public  static boolean isPalindrome(String str){
        int n=str.length();
        int l=0;
        int r=n-1;
        while(l<=r){
            if(str.charAt(l)==str.charAt(r)){
                l++;
                r--;

            }else{
                return  false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
        
        
    
}
