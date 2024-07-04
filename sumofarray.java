package arrays_in_java;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array is = ");
        int size = sc.nextInt();
        int[] a=new int[size];
        int i,p=1;
        int len=a.length;
        for(i=0;i<len;i++){
            System.out.println("enter index of array: "+i);
            a[i]=sc.nextInt();
        }
        for(i=0; i<len;i++){

            if(a[i]%2!=0){
                p=p*a[i];
            }

        }
        System.out.println(p);

    }
}
