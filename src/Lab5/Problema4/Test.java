package Lab5.Problema4;

public class Test {
    public static void main(String[] args) {
        WarriorPack p = new WarriorPack();
        p.addWarrior(new SnakeWarrior(34, "Snake"));
        p.addWarrior(new OgreWarrior(65, "Ogre"));
        p.addWarrior(new MarshmallowManWarrior(21, "Marshmallow"));

        System.out.println(p);
        System.out.println("Total Damage: " + p.calculateDamage());
    }
}
