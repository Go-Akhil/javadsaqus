package arrays_in_java;

public class rotate {
    public static void rotate(int a[],int i,int j){
           while(i<=j){
               int temp = a[i];
               a[i]=a[j];
               a[j]=temp;
               i++;
               j--;
           }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int l=a.length;
        int r=3;
        int k=r%l;
        System.out.println(k);
        rotate(a,0,l-k-1);
        rotate(a,l-k,l-1);
        rotate(a,0,l-1);
        for(int x:a){
            System.out.print(x+" ");
        }

    }
}
