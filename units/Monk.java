package units;

import java.util.ArrayList;

public class Monk extends magic{
    public Monk(String name, int x, int y) {
        super(2, 90, name,
                "units.Monk", 15, 90, 6, x, y, 33);
    }

    @Override
    public void Step(ArrayList<Heros> ours) {

    }
}

