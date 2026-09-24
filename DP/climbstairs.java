package DP;



public class climbstairs {
    public static void main(String[] args) {
        int n=3;
         System.out.println(solve(n));

    }
    // using recursion method
    // public static int solve(int n){
    //     if(n<=1){
    //         return 1;
    //     }
    //     return solve(n-1)+solve(n-2);
// }

// public static int solve(int n){
//     int[]dp=new int[46];
//     if(n<=1){
//         return 1;
//     }

//     if(dp[n]!=0){
//         return dp[n];
//     }
//     dp[n]=solve(n-1)+solve(n-2);
//     return dp[n];
    
// }

public int solve(int n) {

        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
        
    
    
}
