package arrays_in_java;//binary search

import java.util.*;

public class rougharray {
    public static int binarry(int a[],int key){
        int start=0;int end = a.length-1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if(a[mid]==key){
                return mid;
            }
            else if (a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
       int a[]={2,4,6,8,9};
       Scanner sc = new Scanner (System.in);
        System.out.println("enter a key for search: ");
       int key=sc.nextInt();
       int r=binarry(a,key);
       if(r ==-1){
           System.out.println("index is  out of range: "+r);
       }else{
           System.out.println("key is found in the index: "+r);
       }

    }
}
