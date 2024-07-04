package arrays_in_java;

import java.util.*;
public class smallLgT{
    public static void main(String[] args) {
        char a[]={'a','b','c','j'};
        char key='c';
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(a[mid]>key){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        int r = s%a.length;
        System.out.println(r);
    }
}







