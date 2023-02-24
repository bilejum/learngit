package Demo5;

public class Demo5_3 {
    public static void main(String[] args) {
        SupportHero meiyin = new SupportHero();
        Hero feidinan = new Hero();
        Hero weifeilite = new Hero();
        Hero qierweisite = new Hero();
        meiyin.heal(feidinan, 20);


        meiyin.name = "梅茵";
        feidinan.name = "斐迪南";
        weifeilite.name = "韦菲利特";
        System.out.println(Math.random()* 100);

        meiyin.attack(feidinan,meiyin,weifeilite);

        SupportHero.meow();
    }
}
