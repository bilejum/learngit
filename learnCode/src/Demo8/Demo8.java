package Demo8;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {

    public static final int DAY = 2;

    public static void main(String[] args) throws IOException {
        var num = 1;//用var声明的变量不需要指定类型(type)

        System.out.println(num);
        System.out.println(DAY);
        //声明一个常量，注意，这个常量被声明在了方法的外部

        double pow = Math.pow(2, 16);
        System.out.println(pow);

        var a = 1;
        var b = 2;

        a += 4;

        System.out.println(a);

        String greet = "Hello";

        System.out.println(greet.repeat(3));

        greet = greet.substring(0, 3) + "p";

        System.out.println(greet);


        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("hello");
        stringBuilder.insert(1, "haha");
        System.out.println(stringBuilder);

        String string = stringBuilder.toString();

        Scanner in = new Scanner(Path.of("C:\\Users\\比乐\\Desktop\\233.txt"), StandardCharsets.UTF_8);
        String s = in.nextLine();
        System.out.println(s);
        //这居然能读

//        int i = 100;
//        first:while (i == 0) {
//            while (i == 2) {
//                System.out.println();
//                i=50;
//                break first;
//            }
//            i--;
//        }
        BigInteger bigInteger = BigInteger.valueOf(10000000);
        System.out.println(bigInteger);

        BigInteger bigInteger1 = new BigInteger("2312313123123123123123");
        System.out.println(bigInteger1);

        System.out.println(bigInteger1.multiply(bigInteger));

        int[][] array = {{1, 2, 3,}, {1, 2, 3}};

        System.out.println(Arrays.deepToString(array));


    }

    public void Meow() {
        System.out.println(DAY);

    }
}
