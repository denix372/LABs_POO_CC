package com.POOCC.lab05;

import java.util.Vector;

public class WarriorPack {
    private Vector<Warrior> warriors;

    public WarriorPack() {
        warriors = new Vector<>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector<Warrior> getWarriors() {
        return warriors;
    }

    public int calculateDamage() {
        int damage = 0;
        for (Warrior w : warriors) {
            damage += w.getDamage();
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WarriorPack:\n");
        for (Warrior w : warriors) {
            sb.append("  ").append(w).append("\n");
        }
        sb.append("Total Damage: ").append(calculateDamage());
        return sb.toString();
    }
}
