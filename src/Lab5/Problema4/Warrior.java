package Lab5.Problema4;

public abstract class Warrior {
    //0 = dead, 100 = full strength
    public int health;
    public String name;

    public Warrior (int health, String name) {
        this.health = health;
        this.name = name;
    }

    public abstract int getDamage();

    @Override
    public String toString() {
        return "Type: " + getClass() + "\nName: " + name + "\nhealth: " + health;
    }
}
