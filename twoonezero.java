package arrays_in_java;

public class twoonezero {
    public static void tzo(int a[]){
        int n=a.length;int zero=0,one=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zero++;
            }
            else if(a[i]==1){
                one++;
            }
        }
        for(int i=0;i<n;i++){
            if (i<zero){
                a[i]=0;
            }
            else if(i<zero+one){
                a[i]=1;
            }
            else{
                a[i]=2;
            }
        }




    }
    public static void main(String[] args) {
        int a[]={0,1,0,1,0,0,1,2,2,1};
        tzo(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
