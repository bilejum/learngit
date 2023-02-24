package Demo5;

public class Hero {
    String name;
    double hp;
    double armor;
    double speedMove;

    void keng() {
        System.out.println("kengduiyou");
    }

    void addSpeed(int addMove) {
        speedMove = speedMove + addMove;
    }

    double getHp() {
        return hp;
    }

    void recovery(double addHP) {
        hp = hp + addHP;
    }

    void attack(Hero hero) {
        System.out.println(this.name + "攻击" + hero.name);
    }

    void attack(Hero hero1, Hero hero2) {

    }

    void attack(Hero... heroes) {

        for (int i=0;i<heroes.length;i++) {
            System.out.println("攻击"+heroes[i].name);
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.armor = 233;
        garen.name = "盖伦";
        garen.speedMove = 2;
        garen.hp = 555;
        garen.keng();
        garen.addSpeed(20);
        System.out.println(garen.speedMove);

        System.out.println(garen.getHp());
        garen.recovery(233);

        SupportHero.meow();
    }
}
