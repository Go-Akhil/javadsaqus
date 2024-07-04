package arrays_in_java;

public class reversearray {
    public static void main(String[] args) {
        int[] a={3,5,6,7,8,9};
        int n = a.length;
        for(int i =0;i<n/2;i++){
            int temp = a[i];
            a[i]=a[(n-i)-1];
            a[(n-i)-1] = temp;
        }
        System.out.println("reversal array is : ");
        for (int i =0;i<n;i++){
            System.out.print(a[i] );
        }
    }
}
