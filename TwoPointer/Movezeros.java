package TwoPointer;

public class Movezeros {
    public static void main(String[] args) {
        int[]num={1,0,2,0,1,0,2,3,2,3};
        int n=num.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(num[j]!=0){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                i++;
            }
        }
        
    }
    
}
