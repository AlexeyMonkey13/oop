package units;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public abstract class magic extends Heros {
    public magic(int id, int healthLevel, String name, String tipe, int baseAttack, int maximumLive, int iniciative, int x, int y, int heal) {
        super(id, healthLevel, name, tipe, baseAttack, maximumLive, iniciative, x, y);
        this.heal = heal;
    }

    int heal;

    @Override
    public String getInfo() {
        return ("♡" + healthLevel + " " + "⚔" + BaseAttack + "✋" + heal + " " + tipe + " " + name);
    }
//    @Override
//    public String toString() {
//        return (name + " " + tipe + " " + "life" + healthLevel + " " + "iniciative" + iniciative + " "
//                + id + " " + "atack" + BaseAttack + " " + "heal" + " " + heal + " " +"step_x" +
//                + step.x + " " + "step_y" + " " + step.y);
//    }

    @Override
    public void Step(ArrayList<Heros> namies, ArrayList<Heros> ours) {
        if (this.healthLevel > 0){
            for(Heros item : ours){
                if (item.healthLevel > 0 & item.healthLevel < maximumLive) {
                    healthLevel += this.heal ;
                    int b = this.maximumLive;
                    if (healthLevel+this.heal >= maximumLive){
                        maximumLive = b;
                    }
                    System.out.println("sdf " + item.name);
                }return;
            }

        }

        for (Heros item : ours) {
            if (item.healthLevel > maximumLive) {
                boolean b = healthLevel == maximumLive;
            }
            return;
        }

    }
}

//        int[] tmp = FindHeros(namies);
//        System.out.println("Length= " + tmp[0] + " enemyNames " + namies.get(tmp[1]).name);

