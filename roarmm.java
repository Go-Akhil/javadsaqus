package arrays_in_java;
import java.lang.*;//by default in the java program.

import java.util.Scanner;

public class roarmm {
    public static void s(int a[]){
        int i=0,j=a.length-1;
        while(i<=j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }
    public static void b(int a[]){
        for(int i=1;i<a.length;i++){
           int j=i;
           while((j>=1)&&(a[j]<a[j-1])){
               int temp=a[j];
               a[j]=a[j-1];
               a[j-1]=temp;
               j--;
           }
        }
    }
    public static void main(String[] args) {
       int size;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter size of the array: ");
       size = sc.nextInt();
       int a[]=new int[size];
       System.out.print("enter array element: ");
       for(int i=0;i<a.length;i++){
           a[i]=sc.nextInt();
       }
       System.out.print("array elements are: ");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
       b(a);
       System.out.print("\nafter sorting the elements are: ");
       for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       s(a);
       System.out.print("\nafter reverse the elemnts are: ");
       for(int i:a){
           System.out.print(i+" ");
       }
       int b[]=new int[a.length];
       for(int i=0;i<a.length;i++){
           b[i]=a[i];
       }
       System.out.print("\nb array elements are: ");
       for(int i:b){
           System.out.print(i+" ");
       }



    }
}
