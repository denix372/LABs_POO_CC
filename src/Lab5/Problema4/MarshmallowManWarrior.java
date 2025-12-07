package Lab5.Problema4;

public class MarshmallowManWarrior extends Warrior{
    public MarshmallowManWarrior(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 1;
    }
}
