package com.POOCC.lab05;

public class OgreWarrior extends Warrior {
    public OgreWarrior(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 6;
    }
}