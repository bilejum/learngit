package Demo5.HereUtil;

public class Hero {
    private String name;
    private int hp;
    private double att;
    private double armor;


    public Hero() {
    }

    public Hero(String name, int hp, double att, double armor) {
        this.name = name;
        this.hp = hp;
        this.att = att;
        this.armor = armor;
    }



    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 设置
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * 获取
     * @return att
     */
    public double getAtt() {
        return att;
    }

    /**
     * 设置
     * @param att
     */
    public void setAtt(double att) {
        this.att = att;
    }

    /**
     * 获取
     * @return armor
     */
    public double getArmor() {
        return armor;
    }

    /**
     * 设置
     * @param armor
     */
    public void setArmor(double armor) {
        this.armor = armor;
    }

    public String toString() {
        return "Hero{name = " + name + ", hp = " + hp + ", att = " + att + ", armor = " + armor + "}";
    }

    public void attack() {
        System.out.println("攻击");

    }

    public void die() {
        System.out.println("死的很高清");

    }

    public void kill(Hero hero) {
        hero.die();
    }
}
