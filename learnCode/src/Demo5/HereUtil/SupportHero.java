package Demo5.HereUtil;

import Demo5.HereUtil.AttackStyle.Heal;

public class SupportHero extends Hero implements Heal {
    @Override
    public void heal() {
        System.out.println();
    }
}
