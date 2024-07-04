package arrays_in_java;
import java.util.*;


public class arrayqus1 {
    public static void main(String[] args) {
        int size;
        System.out.println("enter a number: ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter array elements: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a);
        System.out.println("\nafter sorting the elements are: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
