package units;

import java.util.ArrayList;
import java.util.Map;

public abstract class magic extends Heros {
    public magic(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative, int heal, int x, int y) {
        super(id, healthLevel, name, tipe, baseAttack, iniciative, x, y);
        this.heal = heal;
    }

    int heal;

    @Override
    public String toString() {
        return (name + " " + tipe + " " + "life" + healthLevel + " " + "iniciative" + iniciative + " " + id + " " + "atack" + BaseAttack + " " + "heal" + " " + heal + " " +
                step.x + " " + "step" + " " + step.y);
    }

    @Override
    public void Step(ArrayList<Heros> namies) {
        int[] tmp = FindHeros(namies);
        System.out.println("Length= " + tmp[0] + " enemyNames " + namies.get(tmp[1]).name);

    }
}