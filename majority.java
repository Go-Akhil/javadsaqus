package arrays_in_java;

import java.util.*;

public class majority {
    public static int major(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elemnts");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int r = major(a);
        System.out.println(r);


    }
}
