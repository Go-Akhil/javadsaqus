package arrays_in_java;

public class bubblesort {
    public static void bubblesort(int a[]){
        boolean flage=true;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flage=false;
                }
            }
            if(flage==true) break;
        }
    }
    public static void main(String[] args) {
        int a[]={89,67,97,65,2,99};
        bubblesort(a);
        System.out.println("the sorted array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
