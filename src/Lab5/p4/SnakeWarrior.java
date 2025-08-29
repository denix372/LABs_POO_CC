package com.POOCC.lab05;

public class SnakeWarrior extends Warrior {
    public SnakeWarrior(int health, String name) {
        super(health, name);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}