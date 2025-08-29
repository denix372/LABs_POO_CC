package com.POOCC.lab05;

public class TestWarriors {
    public static void main(String[] args) {
        WarriorPack pack = new WarriorPack();

        pack.addWarrior(new SnakeWarrior(100, "Cobra"));
        pack.addWarrior(new OgreWarrior(80, "Shrek"));
        pack.addWarrior(new MarshmallowManWarrior(50, "Fluffy"));

        System.out.println(pack);
    }
}
