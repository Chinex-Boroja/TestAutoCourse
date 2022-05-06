package exercises.inheritance;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake() {
        setFlavor("Almond oil");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
