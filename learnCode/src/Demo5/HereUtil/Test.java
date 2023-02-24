package Demo5.HereUtil;

public class Test {
    public static void main(String[] args) {
        Hero meiyin = new ADHero();
        Hero feidinan = new SupportHero();
        Hero luzi = new Hero();


        meiyin.attack();
        luzi.attack();
        feidinan.attack();

        meiyin.kill(feidinan);
        meiyin.kill(luzi);

    }
}
