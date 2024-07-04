package arrays_in_java;//missing element.

import java.util.Scanner;

public class missingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int size = sc.nextInt();
        int a[]=new int[size];
        int sum=0,n=a.length;
        int sumn=((n+1)*(n+2))/2;//sum of n natural number.
        for(int i=0;i<size;i++){
            System.out.println("enter the index of the array: "+i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
              sum = sum+a[i];//sum of element in the array.
        }
        int miss=sumn-sum;
        System.out.println("missing element in the array: "+miss);

    }
}
