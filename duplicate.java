package arrays_in_java;

public class duplicate {
    public static void main(String[] args) {
        int[] a={1,5,5,7,7,8};
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println("the dublicate element is = "+a[i] + "the idex is = "+i);

                    count +=1;
                }
            }
        }

        System.out.println("number of dublicate element present in the array: "+count);
    }
}
