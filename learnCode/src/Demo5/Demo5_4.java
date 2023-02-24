package Demo5;

public class Demo5_4 {
    public static void main(String[] args) {
        Heros heros = Heros.TANK;
        switch (heros) {
            case TANK -> System.out.println("坦克");
            case SUPPORT -> System.out.println("支援");


        }
    }
}
