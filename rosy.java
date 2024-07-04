package arrays_in_java;

import java.util.Scanner;

public class rosy {
    public static void swap(int a[],int l,int m){
       int temp=a[l];
       a[l]=a[m];
       a[m]=temp;
    }
    public static void f(int a[]){
       int l=0,m=0,h=a.length-1;
       while(m<=h){
           if(a[m]==0){
               swap(a,l,m);
               l++;m++;
           }else if(a[m]==1){
               m++;
           }else if(a[m]==2){
               swap(a,m,h);
               h--;
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int a[]=new int[size];
        System.out.print("enter arrya elemnts ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.printf("array elements are: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        f(a);
        System.out.print("\narray elements: ");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
