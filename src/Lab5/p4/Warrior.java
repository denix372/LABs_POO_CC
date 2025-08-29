package com.POOCC.lab05;

public abstract class Warrior {
    private int health; // 0 = dead, 100 = full strength
    private String name;

    public Warrior(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metodă abstractă implementată în clasele derivate
    public abstract int getDamage();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {name='" + name + "', health=" + health + "}";
    }
}
