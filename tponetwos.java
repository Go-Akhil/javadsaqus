package arrays_in_java;

public class tponetwos {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void tpzo(int a[]){
        int n=a.length,low=0,mid=0,high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,mid,low);
                low++;mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                swap(a,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={0,2,2,0,1,2,1,0,1};
        tpzo(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
