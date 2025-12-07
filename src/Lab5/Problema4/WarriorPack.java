package Lab5.Problema4;

import java.util.*;

public class WarriorPack {
    private Vector<Warrior> warriors ;

    public WarriorPack () {
        warriors = new Vector<>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector<Warrior> getWarriors() {
        return warriors ;
    }

    public int calculateDamage() {
        int damage = 0;
        // am definit metoda abstracta getDamage() in fiecare subclasa
        for (Warrior warrior : warriors)
            damage += warrior.getDamage();

        return damage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Warrior warrior: warriors)
            sb.append(warrior).append('\n');
        return sb.toString();
    }
}
