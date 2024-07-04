package arrays_in_java;

import java.util.Scanner;

public class lowerbound {
    public static int lb(int a[],int key){
        int s=0;int e=a.length-1;
        int lb=a.length;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(a[mid]>key){
                lb=Math.min(lb,mid);
                e=e-1;
            }else s=s+1;
        }
        return lb;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.print("enter array elemnt: ");
        for (int i = 0; i <a.length ; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("array elemnts are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nenter key: ");
        int key=sc.nextInt();
        int r=lb(a,key);
        System.out.println("lower bound is: "+r);
    }
}
