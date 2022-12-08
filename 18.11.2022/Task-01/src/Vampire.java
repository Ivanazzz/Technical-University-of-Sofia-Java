public class Vampire implements Monster{
    private float vampireAttackPoints = 10;

    public float attack() {
        return vampireAttackPoints;
    }

    @Override
    public String toString() {
        return "Vampire";
    }
}
