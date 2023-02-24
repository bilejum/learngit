package Demo5.HereUtil;

import Demo5.HereUtil.AttackStyle.Heal;

public class SupportHero extends Hero implements Heal {
    @Override
    public void heal() {
        System.out.println();
    }

    public void attack() {
        System.out.println("治疗自己");
    }

    @Override
    public void die() {
        System.out.println("死的很辅助");

    }
}
