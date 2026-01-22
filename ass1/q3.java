package Assingments.ass1;
import java.util.*;

public class q3 {
    public static int[] copyOf(int[] array) {
        int copy[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] Arr = {10, 20, 30};
        int[] new_Arr = copyOf(Arr);
        new_Arr[0] = 99;
        System.out.println("Original array:");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
        System.out.println("Copied array:");
        for (int i = 0; i < new_Arr.length; i++) {
            System.out.print(new_Arr[i] + " ");
        }
    }
}
