package TwoPointer;

public class countAllPalindromicSubstring {
    public static void main(String[] args) {
        String str="aaa";

        int n=str.length();

        int count=0;
        for(int i=0;i<n;i++){
            count+=expand(str,i,i);
            count+=expand(str,i,i+1);
        }
        expand(str, n, count);
       
       System.out.println(count);
    }
    public  static int expand(String str,int l,int r){
        int count=0;
        while(l>=0 &&  r<str.length()&& str.charAt(l)==str.charAt(r)){
            count++;
            l--;
            r++;
        }
        return  count;


    }
    
}
