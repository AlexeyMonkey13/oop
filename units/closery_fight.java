package units;

import java.util.ArrayList;

public abstract class closery_fight extends Heros {
    public closery_fight(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative, int x, int y) {
        super(id, healthLevel, name, tipe, baseAttack, iniciative, x, y);
    }
    @Override
    public void Step(ArrayList<Heros> namies) {
        int[] tmp = FindHeros(namies);
        System.out.println("Length= " + tmp[0] + " enemyNames " + namies.get(tmp[1]).name);

    }
}
