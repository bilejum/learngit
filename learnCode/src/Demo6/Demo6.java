package Demo6;

import java.util.Random;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int scint = Integer.parseInt(s);

        int[] ints = new int[scint];

        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {

            int suijishu = random.nextInt(0, 100);

            ints[i] = suijishu;
        }

        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }
}
