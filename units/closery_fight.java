package units;

import java.util.ArrayList;

public abstract class closery_fight extends Heros {
    public closery_fight(int id, int healthLevel, String name, String tipe, int baseAttack, int maximumLive, int iniciative, int x, int y) {
        super(id, healthLevel, name, tipe, baseAttack, maximumLive, iniciative, x, y);
    }


    @Override
    public void Step(ArrayList<Heros> namies, ArrayList<Heros> ours) {
        if (this.healthLevel <= 0) return;
        Heros tmp = FindHeros(namies);
        tmp.healthLevel -= this.BaseAttack;
        if (this.step.calcCoordinate(tmp.step) <= 2) {
            tmp.getDamage(this.BaseAttack);
            return;
        }
        coordinate tmpc = new coordinate(step.x, step.y);

        if (Math.abs(this.step.x - tmp.step.x) > Math.abs(this.step.y - tmp.step.y)) {
            if (this.step.x < tmp.step.x) {
            tmpc.x += 1;
            }else {
                tmpc.x -= 1;
            }


//        int[] tmp = FindHeros(namies);
//        System.out.println("Length= " + tmp[0] + " enemyNames " + namies.get(tmp[1]).name);

        } else {
            if (this.step.y < tmp.step.y) {
                tmpc.y += 1;
            } else {
                tmpc.y -= 1;
            }
//    public String getInfo(){
//        return (name + " " + tipe + " " + "life" + healthLevel + " " + "iniciative" + iniciative + " "
//                + id + " " + "atack" + BaseAttack + " " + "step_x" + " "
//                + step.x + " " + "step_y" + " " + step.y);
//    }
        }
        boolean flag = false;
        for(Heros item: ours){
            if(item.step.x == tmpc.x & item.step.y == tmpc.y & item.healthLevel > 0) flag=true;
        }
        if(flag) return;
        this.step.x = tmpc.x;
        this.step.y = tmpc.y;
    }
}
