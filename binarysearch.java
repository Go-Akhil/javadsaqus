package arrays_in_java;

import java.util.Scanner;

public class binarysearch {
    public static int search(int a[],int key){
        int start=0,end = a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }else if(a[mid]<key){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int a[]={1,2,3,4,5,6,7};
        System.out.println("enter key is = ");
        int key =sc.nextInt();
        int result = search(a,key);
        System.out.println("index of key is = "+result);


    }
}
