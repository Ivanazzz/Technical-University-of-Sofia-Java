public class Dragon implements Monster{
    private float dragonAttackPoints = 20;

    public float attack() {
        return dragonAttackPoints;
    }

    @Override
    public String toString() {
        return "Dragon";
    }
}
