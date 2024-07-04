package arrays_in_java;//first occuernce of the element or lower bound.

import java.util.Scanner;

public class find1stoccuernce {
    public static int findoccer(int[] a,int target){
        int low =0,high=a.length-1;
        int result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(a[mid]==target){
                result = mid;
                high = mid-1;//traverse an array.
            }else if(a[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size =sc.nextInt();
        int[] a=new int[size];
        for(int i =0;i<size;i++){
            System.out.println("enter array index number: "+i);
            a[i]=sc.nextInt();
        }
        System.out.println("enter the target element: ");
        int target = sc.nextInt();
        int result = findoccer(a,target);
        if(result == -1){
            System.out.println("the occuerance is not found is = "+result);
        }else{
            System.out.println("the 1st occuerance is = "+result);
        }
    }
}
