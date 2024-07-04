package arrays_in_java;

import java.util.Scanner;

public class basicarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int size = sc.nextInt();
        int[] arr=new int[size];
        int i,count=0;
        int len=arr.length;
        for(i=0;i<len;i++){
            System.out.println("enter idex number : "+i);
            arr[i]=sc.nextInt();
        }
        for(i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(i=0;i<len;i++){
            if(arr[i]<35){
                System.out.println("the roll number of the student which mark is less than 35 = " +i+ " "+"and mark is "+arr[i]);
                count = count+1;
            }
        }
        System.out.println("total student score mark lessthan 35 is = "+count);
    }
}
