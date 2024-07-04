package arrays_in_java;

import java.util.Scanner;

public class arraybasicqus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int size = sc.nextInt();
        int[] a=new int[size];//create an int arrayobj in heap area
        for(int i=0;i<a.length;i++){
            System.out.println("enter index of the array: "+i);
            a[i]=sc.nextInt();

        }
        System.out.println("the original array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        for(int i=0; i<a.length/2;i++){
             int temp = a[i];
             a[i]=a[(a.length-i)-1];
             a[(a.length-i)-1]=temp;
        }
        System.out.println("the reversal array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }



    }
}
