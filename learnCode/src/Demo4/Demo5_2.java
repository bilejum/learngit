package Demo4;

public class Demo5_2 {
    public static void main(String[] args) {
        Weapon suozijia = new Weapon();
    }
}

class Item {
    String name;
    int price;
}

class Weapon extends Item {
    int ac;
}
