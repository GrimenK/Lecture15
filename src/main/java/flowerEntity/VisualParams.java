package flowerEntity;

public class VisualParams {
    private String color;
    private String leafColor;
    private String size;

    @Override
    public String toString() {
        return "VisualParams{" +
                "color='" + color + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public String getSize() {
        return size;
    }

    public VisualParams() {
    }
}
