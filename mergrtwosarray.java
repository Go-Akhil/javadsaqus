package arrays_in_java;

public class mergrtwosarray {
    public static void merge(int a[],int b[],int c[]){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;k++;
            }else{
               c[k]=b[j];
               j++;k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k]=b[j];
                j++;k++;
            }
        }
        else if(j==b.length){
            while(i<a.length){
                c[k]=a[i];
                i++;k++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={34,78,79,90};
        int b[]={23,44,67,89,90};
        int n=a.length+b.length;
        int c[]=new int[n];
        merge(a,b,c);
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}
