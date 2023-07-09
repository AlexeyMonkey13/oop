package units;

public class peasant extends closery_fight{
    public peasant(String loli, int x, int y) {
        super(3, 40, loli, "units.peasant", 0,2, x, y);
    }
    @Override
    public String toString(){
        return (name + " " + tipe + " " + "life"+ healthLevel + " " + "iniciative" + iniciative + " " + id + " " + "step" + " " +
                step.x + " " + "step"+ " " + step.y);
    }
}


