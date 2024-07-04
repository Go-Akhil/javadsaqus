package arrays_in_java;//frequncy of char of an  array.

public class revomove {
    public static void remove(int a[],int visit,int f[]){
       for(int i=0;i<a.length;i++){
           int count=1;
           for (int j=i+1;j<a.length;j++){
               if(a[i]==a[j]){
                   count++;
                   f[j]=-1;

               }

           }
           if(f[i]!=visit){
               f[i]=count;
           }
       }
       for(int i=0;i<a.length;i++){
           if(f[i]!=visit){
               System.out.println(a[i]+"| "+f[i]);
           }
       }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,8,2,2,2,8,2,1};
        int f[]=new int[a.length];
        int visit=-1;
        remove(a,visit,f);


    }
}
