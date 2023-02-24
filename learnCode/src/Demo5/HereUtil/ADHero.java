package Demo5.HereUtil;

import Demo5.HereUtil.AttackStyle.PhysicAttack;

public class ADHero extends Hero implements PhysicAttack {
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");

    }
}
