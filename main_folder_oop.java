import units.*;

import java.util.ArrayList;
import java.util.Random;

//Проанализировать и описать персонажей:
//Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//На базе описания персонажей описать простейшую иерархию классов.
//В основной программе создать по одному экземпляру каждого класса.
public class main_folder_oop {
    public enum Names {
        Name, Loli, Kolia, name, Bara, GoldD, Monika, Kuba, Kitty, Drobi, Noon, Monica, Krol, Brigadir, Tolik, Gloria, Tatiana,
        Noodik, Kompot, Sarjik
    }
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;

    }
    static ArrayList<Heros> team1 = new ArrayList<>();
    static ArrayList<Heros> team2 = new ArrayList<>();
    static ArrayList<Heros> unatedTeam = new ArrayList<>();
    public static void main(String[] args) {
//        units.Heros monk = new units.Monk(getName());
//        units.Heros units.peasant = new units.peasant(getName());
//        units.Heros robber = new units.Robber(getName());
//        units.Heros units.superman = new units.superman(getName());
//        units.Heros units.magician = new units.magician(getName());
//        units.Heros units.shooters = new units.shooters(getName());
//
//        System.out.println(monk.getInfo());
//        System.out.println(units.peasant.getInfo());
//        System.out.println(robber.getInfo());
//        System.out.println(units.superman.getInfo());
//        System.out.println(units.magician.getInfo());
//        System.out.println(units.shooters.getInfo());

//        ArrayList<units.Heros> allheros = new ArrayList<>();
//
//        allheros.add(units.peasant); allheros.add(monk); allheros.add(robber);
//        allheros.add(units.superman); allheros.add(units.magician); allheros.add(units.shooters);



        for (int i = 1; i < 11; i++){
            int j = new Random().nextInt(0, 7);
            int count = new Random().nextInt(1, 11);
            switch (j){
                case 0: team1.add(new Monk(getName(), 1, i)); break;
                case 1: team1.add(new peasant(getName(), 1,i)); break;
                case 2: team1.add(new Robber(getName(), 1, i)); break;
                case 3: team1.add(new superman(getName(), 1, i)); break;
                case 4: team1.add(new magician(getName(), 1, i)); break;
                case 5: team1.add(new shooters(getName(), 1, i)); break;
                case 6: team1.add(new arba(getName(), 1, i));break;
                }

//            team1.add(allheros.get(new Random().nextInt(0, allheros.size())));
//            team2.add(allheros.get(new Random().nextInt(0, allheros.size())));
        }
        for (int m = 1; m <11; m++){
            int k = new Random().nextInt(0,7); //перебор героев
            int count = new Random().nextInt(1, 11);
            switch (k){
                case 0: team2.add(new Monk(getName(), 10, m));break;
                case 1: team2.add(new peasant(getName(), 10, m));break;
                case 2: team2.add(new Robber(getName(), 10,m));break;
                case 3: team2.add(new superman(getName(), 10, m));break;
                case 4: team2.add(new magician(getName(), 10, m ));break;
                case 5: team2.add(new shooters(getName(), 10, m ));break;
                case 6: team2.add(new arba(getName(), 10, m));break;
            }
        }


        unatedTeam.addAll(team1);
        unatedTeam.addAll(team2);
        unatedTeam.sort(((o1, o2) -> o2.getIniciative()- o1.getIniciative()));

//        System.out.println("team1");
//        team1.forEach(item -> System.out.println(item.getInfo()));
//        System.out.println("team2");
//        team2.forEach(item -> System.out.println(item.getInfo()));
        View.view();

        for (Heros item : unatedTeam) {
            if(team1.contains(item)){
                item.Step(team2, team1);
            } else{
                item.Step(team1, team2);
            }
//            System.out.println(item.getIniciative());
        }

//
//        System.out.println("_".repeat(20));
//        team1.forEach(item -> System.out.println(item.getInfo()));
//        System.out.println("_".repeat(12));
//        team2.forEach(item -> System.out.println(item.getInfo()));
        View.view();
    }
}
