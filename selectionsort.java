package arrays_in_java;//selecton sort

import java.util.Scanner;

public class selectionsort {
    public static void selection(int a[]){
        for (int i = 0; i <a.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={90,7,40,5,50,6,78};
        selection(a);
        System.out.println("the seletion sort value is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }



    }
}
