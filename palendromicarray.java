package arrays_in_java;

import java.util.Scanner;

public class palendromicarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array is = ");
        int n = sc.nextInt();
        int[] a=new int[n];
        int len = a.length;
        int flag=0;
        for(int i=0;i<len;i++){
            System.out.println("enter index number with value is "+i);
             a[i] =sc.nextInt();
        }
        for(int i=0;i<len/2;i++){
            if(a[i] != a[(len-i)-1]){
                flag = 1;
                System.out.println("it is not a palindromic array");
                break;
            }

        }
        if(flag==0){
            System.out.println("it is a pailndromic array");
        }

        }

    }

