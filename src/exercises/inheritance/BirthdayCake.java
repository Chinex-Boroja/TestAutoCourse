package exercises.inheritance;

public class BirthdayCake extends Cake {

    private String candle;

    public BirthdayCake() {
        setFlavor("Foster stark");
    }

    public String getCandle() {
        return candle;
    }

    public void setCandle(String candle) {
        this.candle = candle;
    }
}
