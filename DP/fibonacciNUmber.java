
package DP;
import java.util.*;


public class fibonacciNUmber {
    // using Recursion method
    public static void main(String[] args) {
        int n = 2;
        // System.out.println(solve(n)); 
        // System.out.println(fib(n));
        System.out.println(fibo(n));
    }

    // public static int solve(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return solve(n - 1) + solve(n - 2);
    // }


    //  Memoization up to bottom 

    // public static int fib(int n){
    //     if(n<=1){
    //         return n;
    //     }
    //     int []dp=new int[n+1];
    //     Arrays.fill(dp, -1);

    //     if(dp[n]!=-1){
    //         return dp[n];
    //     }
    //     dp[n]=fib(n-1)+fib(n-2);

    //     return dp[n];
    // }

    //  Tabulation - bottom to up

    public static int fibo(int n){
        if(n<=1){
            return n;
        }

        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=fibo(i-1)+fibo(i-2);
        }
        return dp[n];
    }
}
