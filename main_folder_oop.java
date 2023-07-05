import java.util.ArrayList;
import java.util.Random;

//Проанализировать и описать персонажей:
//Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
//На базе описания персонажей описать простейшую иерархию классов.
//В основной программе создать по одному экземпляру каждого класса.
public class main_folder_oop {
    public static void main(String[] args) {
        Heros monk = new Monk(getName());
        Heros peasant = new peasant(getName());
        Heros robber = new Robber(getName());
        Heros superman = new superman(getName());
        Heros magician = new magician(getName());
        Heros shooters = new shooters(getName());
//
//        System.out.println(monk.getInfo());
//        System.out.println(peasant.getInfo());
//        System.out.println(robber.getInfo());
//        System.out.println(superman.getInfo());
//        System.out.println(magician.getInfo());
//        System.out.println(shooters.getInfo());

        ArrayList<Heros> allheros = new ArrayList<>();

        allheros.add(peasant); allheros.add(monk); allheros.add(robber);
        allheros.add(superman); allheros.add(magician); allheros.add(shooters);

        ArrayList<Heros> team1 = new ArrayList<>();
        ArrayList<Heros> team2 = new ArrayList<>();

        for (int i = 0; i < 6; i++){
            int j = new Random().nextInt(0, 6);
            switch (j){
                case 0: team1.add(new Monk(getName()));break;
                case 1: team1.add(new peasant(getName()));break;
                case 2: team1.add(new Robber(getName()));break;
                case 3: team1.add(new superman(getName()));break;
                case 4: team1.add(new magician(getName()));break;
                case 5: team1.add(new shooters(getName()));break;
                }

//            team1.add(allheros.get(new Random().nextInt(0, allheros.size())));
//            team2.add(allheros.get(new Random().nextInt(0, allheros.size())));
        }
        for (int m = 0; m <6; m++){
            int k = new Random().nextInt(0,6);
            switch (k){
                case 0: team2.add(new Monk(getName()));break;
                case 1: team2.add(new peasant(getName()));break;
                case 2: team2.add(new Robber(getName()));break;
                case 3: team2.add(new superman(getName()));break;
                case 4: team2.add(new magician(getName()));break;
                case 5: team2.add(new shooters(getName()));break;
            }
        }
//
        System.out.println("team1");
        team1.forEach(i -> System.out.println(i.getInfo()));
        System.out.println("team2");
        team2.forEach(m -> System.out.println(m.getInfo()));
    }

    public enum Names {
        Name, Loli, Kolia, name, Bara, GoldD, Monika, Kuba, Kitty, Drobi
    }
    private static String getName(){
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }
}
