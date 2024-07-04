package arrays_in_java;

import java.util.Scanner;

public class pair {
    public static int binary(int a[],int key){
        int start =0,end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return mid;
            }else if(a[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[]={4,5,6,7,8,9};
        System.out.println("enter key: ");
        int key = sc.nextInt();
        int index =binary(a,key);
        if(index==-1){
            System.out.println("index is out of range: "+index);
        }else{
            System.out.println("key found in the index number : "+index);
        }
    }
}
