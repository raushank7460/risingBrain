package TwoPointer;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int n=s.length;
        int l=0;
        int r=n-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        for(char c:s){
            System.out.print(c+" ");
        }
    }
    
}
