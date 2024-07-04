package arrays_in_java;

public class qusadd {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};//1+3+5=9 2+4+6=12
        int i,n=a.length,sodd=0,seven=0;
        int b=12;
        for(i=0;i<n;i++){
            if(i%2==0){
                seven=seven+a[i];
            }
            else{
                sodd = sodd+a[i];
            }
        }
        int d = seven-sodd;
        System.out.println(d);


    }
}
