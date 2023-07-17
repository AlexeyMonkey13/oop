package units;

import java.security.SecureRandom;
import java.util.ArrayList;

public abstract class Heros implements Actions {
    int id;
    int healthLevel;
    int maximumLive;
    String name;
    String tipe;
    int BaseAttack;
    int iniciative;
    int place;

    protected coordinate step;

    public coordinate getStep() {
        return step;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public Heros(int id, int healthLevel, String name, String tipe, int baseAttack, int maximumLive, int iniciative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.maximumLive = maximumLive;
        this.name = name;
        this.tipe = tipe;
        this.BaseAttack = baseAttack;
        this.iniciative = iniciative;
        step = new coordinate(x, y);
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }

    public int getIniciative(){
        return iniciative;
    }


    public void Step(ArrayList<Heros> namies, ArrayList<Heros> ours) {

    }

    protected void getDamage(float damage){
        this.healthLevel-=damage;
        if (healthLevel < 0) healthLevel = 0;
        if(healthLevel > maximumLive) healthLevel = maximumLive;
    }
    public String getInfo() {
        return ("♡" + healthLevel + " " + "⚔" + BaseAttack + " " + tipe + " " + name);
    }

    protected Heros FindHeros(ArrayList<Heros> namies) {
        double min = 10000;
        int count = 0;
        for (int i = 0; i < namies.size(); i++) {
            if (step.calcCoordinate(namies.get(i).step) < min & namies.get(i).healthLevel > 0) {
                min = step.calcCoordinate(namies.get(i).step);
                count = i;
            }
        }
        return namies.get(count);

//        return new int[]{ (int) Math.round(min), count};

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

