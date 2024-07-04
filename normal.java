package arrays_in_java;//number is prime or not.

import java.util.Scanner;

public class normal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n =sc.nextInt();
        int a=0;
        if(n>=1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    a = 1;
                    break;
                }
            }
        }
        else{
            System.out.println("invalid number");
        }
      if(n==1){
          System.out.println("it is neither prime nor composite");
      }
      else if(a==0){
          System.out.println("it is a prime number");
      }
      else if(a==1){
          System.out.println("it is not prime number");
      }

    }
}
