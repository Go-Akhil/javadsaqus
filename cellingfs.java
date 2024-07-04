package arrays_in_java;

import java.util.*;

public class cellingfs {
    public static int cellings(int a[],int key){
        int s=0;
        int e=a.length-1;
        if(key>a[e]){
            return -1;
        }
        while(s<=e){
            int mid = s+(e-s)/2;
            if (a[mid]==key){
                return a[mid];
            }else if (a[mid] > key){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return a[s];
    }
    public static void main(String[] args) {
        int a[]={22,45,8,67,90};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a key : ");
        int target=sc.nextInt();
        int r = cellings(a,target);
        if(r==-1){
            System.out.println("index not found"+r);
        }else{
            System.out.println("index found at index:"+r);
        }


    }
}
