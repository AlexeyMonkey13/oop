package units;

import java.util.ArrayList;

public abstract class far_fight extends Heros {
    public far_fight(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative, int shot, int x, int y) {
        super(id, healthLevel, name, tipe, baseAttack, iniciative, x, y);
        this.shot = shot;
    }

    @Override
    public String getInfo(){
        return (name + " " + tipe + " " + "life" + healthLevel + " " + "iniciative"
                + iniciative + " " + id + " " + "atack" + BaseAttack + " " + " shot " + shot + " " + "step_x" + " "
                + step.x + " " + "step_y" + " " + step.y);
    }

    protected int shot;
    @Override
    public void Step(ArrayList<Heros> namies, ArrayList<Heros> ours) {
        if ((this.healthLevel <=0) || (this.shot == 0)) return;

        Heros tmp = FindHeros(namies);
        tmp.healthLevel -= this.BaseAttack;
        for (Heros item:ours) {
            if (item.tipe.contains("peasant") && !((peasant)(item)).busy && item.healthLevel > 0){
                ((peasant)(item)).busy = true;
                return;
            }
        }
        this.shot--;
    }
}
