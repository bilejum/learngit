package Demo5.HereUtil;

import Demo5.HereUtil.AttackStyle.MagicAttack;
import Demo5.HereUtil.AttackStyle.PhysicAttack;

public class ADAPHero extends Hero implements MagicAttack, PhysicAttack {
    @Override
    public void magicAttack() {
        System.out.println("物理");
    }

    @Override
    public void physicAttack() {
        System.out.println("魔法");

    }
}
