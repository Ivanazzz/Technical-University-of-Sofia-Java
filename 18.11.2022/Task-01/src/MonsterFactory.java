import java.util.Random;

public class MonsterFactory {
    public static Monster createMonster(Random rand) {
        int number = rand.nextInt(3);

        switch (number) {
            case 0:
                return new Zombie();
            case 1:
                return new Vampire();
            case 2:
                return new Dragon();
            default:
                return null;
        }
    }
}
