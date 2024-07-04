package arrays_in_java;//pair in array

public class pairofarray {
    public static void pairarray(int a[]){
        int t=0;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
                t++;
            }
            System.out.println();
        }
        System.out.println("total number of pair is = "+t);
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        pairarray(a);

    }
}
