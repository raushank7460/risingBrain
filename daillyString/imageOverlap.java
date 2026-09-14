package daillyString;

// LeetCode 835

public class imageOverlap {

    public static void main(String[] args) {

        int[][] img1 = {
            {1, 1, 0},
            {0, 1, 0},
            {0, 1, 0}
        };

        int[][] img2 = {
            {0, 0, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        int n=img1.length;
        int maxOverlap=0;
        for(int row=-(n-1);row<n-1;row++){
            for(int col=-(n-1);col<n-1;col++){
                int overlap=0;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        int newrow= i+row;
                        int newcol= j+col;

                        if(newrow>=0 && newrow<n && newcol>=0 && newcol<n){
                            if(img1[i][j]==1 && img2[newrow][newcol]==1){
                                overlap++;
                            }
                        }
                    }
                }
                maxOverlap=Math.max(maxOverlap, overlap);
            }
        }
        System.out.println(maxOverlap);
    }
}