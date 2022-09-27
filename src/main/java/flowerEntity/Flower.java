package flowerEntity;

public class Flower {
    private GrowingTips growingTips;
    private VisualParams visualParams;

    private String soil;
    private String name;
    private String origin;
    private String multiplying;

    public void setGrowingTips(GrowingTips growingTips) {
        this.growingTips = growingTips;
    }

    public void setVisualParams(VisualParams visualParams) {
        this.visualParams = visualParams;
    }

    public void setSoil(String soil) {
        this.soil = soil;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setMultiplying(String multiplying) {
        this.multiplying = multiplying;
    }

    public GrowingTips getGrowingTips() {
        return growingTips;
    }

    public VisualParams getVisualParams() {
        return visualParams;
    }

    public String getSoil() {
        return soil;
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getMultiplying() {
        return multiplying;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "growingTips=" + growingTips +
                ", visualParams=" + visualParams +
                ", soil='" + soil + '\'' +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", multiplying='" + multiplying + '\'' +
                '}';
    }

    public Flower() {
    }
}
