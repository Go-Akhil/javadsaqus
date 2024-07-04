package arrays_in_java;

import java.util.Scanner;

public class min_max_arraye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[]={2,3,4,5,6,12,5,5};
        int n=a.length;
        int max=a[0],i;
        int smax=a[0];
        for(i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("maximum valu of array is "+max);
        for(i=0;i<n;i++){
            if(a[i]> smax && max != a[i]){
                smax=a[i];
            }
        }
        System.out.println("smax element is = "+smax);
    }
}
