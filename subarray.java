package arrays_in_java;//sum of sub array.
import java.util.*;

public class subarray {
    public static void subarray(int a[]) {
        int sum=0;
        int msum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            //int start=i;
            for(int j=i;j<a.length;j++){
                sum=0;
                //int end=j;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                    sum=sum+a[k];
                }
                System.out.println();
                System.out.println("sum of sub array is = "+sum);
                if(msum<sum){
                    msum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("maximum sum of subaarry is = "+msum);
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        subarray(a);
    }
}
