public class Heros implements Actions{
        int id;
        int healthLevel;
        String name;
        String tipe;
        int BaseAttack;
        int iniciative;

    public Heros(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.tipe = tipe;
        this.BaseAttack = baseAttack;
        this.iniciative = iniciative;
    }
    @Override
    public String toString(){
        return (name + " " + tipe + " " + healthLevel + " " + iniciative + " " + id + " " + BaseAttack);
    }

    @Override
    public void Step() {

    }

    @Override
    public String getInfo() {
        return toString();
    }
}
