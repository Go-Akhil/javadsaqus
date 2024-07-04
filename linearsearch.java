package arrays_in_java;

import java.util.Scanner;

public class linearsearch {
    public static int linear(int a[],int key){
        int idex =-1;
        for (int i=0;i<a.length;i++){
            if(a[i]==key){
                idex = i;
                return idex;
            }
        }
        return idex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[]={3,4,5,6,8,9};
        System.out.println("enter key : ");
        int key = sc.nextInt();
        int result =linear(a,key);
        if(result==-1){
            System.out.println("index is out of range: "+result);
        }else{
            System.out.println("index number of key is : "+result);
        }


    }
}
