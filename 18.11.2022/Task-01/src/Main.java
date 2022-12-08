import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        MonsterFactory factory = new MonsterFactory();

        List<Monster> monsters = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Monster monster = factory.createMonster(rand);
            monsters.add(monster);
        }

        float totalPower = 0;
        for (Monster monster : monsters) {
            System.out.println(monster.toString());
            totalPower += monster.attack();
        }

        if (totalPower < 50) {
            System.out.println("Hero wins!");
        } else {
            System.out.println("Hero loses!");
        }
    }
}