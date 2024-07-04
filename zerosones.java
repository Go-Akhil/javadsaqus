package arrays_in_java;

public class zerosones {
    public static void zero(int a[]){
        int zero=0;
        for (int i=0;i<a.length;i++){
            if(a[i]==0){
                zero++;
            }
        }
        for(int i=0;i<a.length;i++){
            if(i<zero){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,0,1,0};
        zero(a);
        for(int x:a){
            System.out.print(x+" ");
        }


    }
}
