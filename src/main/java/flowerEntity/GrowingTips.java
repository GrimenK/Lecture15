package flowerEntity;

public class GrowingTips {
    private String temp;

    private boolean light;

    public GrowingTips() {
    }

    @Override
    public String toString() {
        return "GrowingTips{" +
                "temp='" + temp + '\'' +
                ", light=" + light +
                '}';
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String getTemp() {
        return temp;
    }

    public boolean isLight() {
        return light;
    }
}
