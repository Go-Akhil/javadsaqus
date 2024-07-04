package arrays_in_java;

public class zerostpont {
    public static void pzero(int a[]){
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(a[i]==0){
                i++;
            }
            else if(a[j]==1){
                j--;
            }
            else if(a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++;j--;
            }
        }



    }
    public static void main(String[] args) {
        int a[]={0,0,0,1,1,1};
        pzero(a);
        for(int x :a){
            System.out.print(x+" ");
        }
    }
}
