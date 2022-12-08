public class Zombie implements Monster{
    private float zombieAttackPoints = 5;

    public float attack() {
        return zombieAttackPoints;
    }

    @Override
    public String toString() {
        return "Zombie";
    }
}
