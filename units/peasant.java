package units;

import java.util.ArrayList;

public class peasant extends Heros {
    public peasant(String loli, int x, int y) {super(3, 40, loli, "units.peasant",
                0,2, x, y);
    }
//    @Override
//    public String getInfo(){
//        return (name + " " + tipe + " " + "life"+ healthLevel + " " + "iniciative" + iniciative + " "
//                + id + " " + "step" + " "
//                + step.x + " " + "step"+ " " + step.y);
//    }

    boolean busy = false;
    @Override
    public void Step(ArrayList<Heros> namies) {
        if (this.healthLevel > 0) this.busy = false;
    }
}



