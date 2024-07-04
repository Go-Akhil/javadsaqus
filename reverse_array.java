package arrays_in_java;

public class reverse_array {
    public static void swap(int a[]){
        int l=a.length;
        int mid =l/2;
        for (int i=0;i<mid;i++){
            int temp=a[l-1-i];
            a[l-1-i]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        swap(a);
        System.out.println("the swapping array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }

    }
}
