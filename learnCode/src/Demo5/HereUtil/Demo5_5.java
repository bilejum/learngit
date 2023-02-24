package Demo5.HereUtil;

import java.util.Random;
import java.util.Scanner;

public class Demo5_5 {
    public static void main(String[] args) {
        int i = 5;


        String str = String.valueOf(i);

        System.out.println(str);

        String StringFormat = "你%s死了，我杀了你%s";
        String format = String.format(StringFormat, "妈", "妈");

        System.out.println(format);

        char c = 'c';

        Character character = Character.valueOf(c);
        System.out.println(character);
        StringBuilder builder = new StringBuilder();

        for (int i1 = 0; i1 < 5; i1++) {
            Random random = new Random();
            int i2 = random.nextInt(98, 122);

            char c2 = (char) i2;

//            System.out.print(c2);

            builder.append(c2);
            System.out.println(builder);

        }

        String string = builder.toString();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your yanzhengma");
        String s = scanner.nextLine();



        if (s.equals(string)) {
            System.out.println("验证成功");

        } else {
            System.out.println("fail");
        }
    }
}
