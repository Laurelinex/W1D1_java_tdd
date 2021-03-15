public class WaterBottle {
    private double volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double drink() {
        return this.volume - 10;
    }

    public double empty() {
        return this.volume = 0;
    }
}
