package Demo5;

import java.util.Arrays;

public class Demo5_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,5,6,2,1};

        int[] ints = Arrays.copyOf(a, 10);
        for (int anInt : ints) {
            System.out.println(anInt);

        }

        String string = Arrays.toString(ints);
        System.out.println(string);

        Arrays.sort(a);

        for (int i : a) {
            System.out.println(i);
        }




    }
}
