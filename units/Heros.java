package units;

import java.util.ArrayList;

public abstract class Heros implements Actions {
    int id;
    int healthLevel;
    String name;
    String tipe;
    int BaseAttack;
    int iniciative;

    protected coordinate step;

    public Heros(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.tipe = tipe;
        this.BaseAttack = baseAttack;
        this.iniciative = iniciative;
        step = new coordinate(x, y);
    }


    @Override
    public String toString() {
        return (name + " " + tipe + " " + "life" + healthLevel + " " + "iniciative" + iniciative + " " + id + " " + "atack" + BaseAttack + " " + "step" + " " +
                step.x + " " + "step" + " " + step.y);
    }

    @Override
    public void Step(ArrayList<Heros> namies) {

    }

    @Override
    public String getInfo() {
        return toString();
    }

    protected int[] FindHeros(ArrayList<Heros> namies) {
        double min = 10000;
        int count = 0;
        for (int i = 0; i < namies.size(); i++) {
            if (step.calcCoordinate(namies.get(i).step) < min) {
                min = step.calcCoordinate(namies.get(i).step);
                count = i;
            }
        }
        return new int[]{ (int) Math.round(min), count};

//    protected void FindHeros(ArrayList<Heros> namies) {
//        double min = 10000;
//        String enemiesName = null;
//        for (Heros item : namies) {
//            if (step.calcCoordinate(item.step) < min) {
//                min = step.calcCoordinate(item.step);
//
////          Math.sqrt((item.step.x - step.x) * (item.step.x - step.x) + (item.step.x - step.y) * (item.step.x - step.y)) < min) {
////          min = Math.sqrt((item.step.x - step.x) * (item.step.x - step.x) + (item.step.x - step.y) * (item.step.x - step.y));
//                enemiesName = item.name;
//            }
//        }
//        System.out.println("Ln= " + Math.round(min) + "enemiesName= " + enemiesName);
    }
}

