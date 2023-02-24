package Demo5;

public class SupportHero extends Hero{
    void heal() {
        System.out.println("给自己加血");
    }

    void heal(Hero hero) {
        System.out.println("给"+hero.name+"加血");
    }

    void heal(Hero hero,int hp) {
        System.out.println("给自己加血");
    }

    static void meow() {

        System.out.println("我被调用惹");
    }
}
