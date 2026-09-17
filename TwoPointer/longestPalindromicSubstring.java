package TwoPointer;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String s="ABA";
        System.out.println(str(s));
    }
    public static  String str(String s){
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    if((j-i+1)>res.length()){
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
       
        return res;
    }
    public  static boolean isPalindrome(String s,int l,int r){
        while (l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
            
        }
        
        return  true;
    }
    
}
