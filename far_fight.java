public abstract class far_fight extends Heros {
    public far_fight(int id, int healthLevel, String name, String tipe, int baseAttack, int iniciative, int heal) {
        super(id, healthLevel, name, tipe, baseAttack, iniciative);
        this.heal = heal;
    }
    int heal;
}
