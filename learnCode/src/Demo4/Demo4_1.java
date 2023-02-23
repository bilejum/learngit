package Demo4;

public class Demo4_1 {

    public static void main(String[] args) {
        String qq = "12403";

        System.out.println(check(qq));
    }

    public static boolean check(String qq) {
        int length = qq.length();
        char c = qq.charAt(0);
        boolean isZero = qq.startsWith("0");

        for (int i = 0; i < length; i++) {
            char c1 = qq.charAt(i);
            System.out.println(c1);
        }

        if (length < 6 || length > 20) {
            return false;
        }

        if (isZero) {
            return false;
        }
        return true;
    }
}
