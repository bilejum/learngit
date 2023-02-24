package Demo5.HereUtil;

import Demo5.HereUtil.AttackStyle.PhysicAttack;

public class ADHero extends Hero implements PhysicAttack {
    @Override
    public void physicAttack() {
        System.out.println("物理攻击");

    }

    public void attack() {
        System.out.println("物理攻击");
    }

    @Override
    public void die() {
        System.out.println("死的很暴力");
    }
}
