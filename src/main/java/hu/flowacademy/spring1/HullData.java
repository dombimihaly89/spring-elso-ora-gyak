package hu.flowacademy.spring1;

public class HullData {

    private double volume;
    private double surface;

    public HullData(double volume, double surface) {
        this.volume = volume;
        this.surface = surface;
    }

    public HullData() {}

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    @Override
    public String toString() {
        return "HullData{" +
                "volume=" + volume +
                ", surface=" + surface +
                '}';
    }
}
