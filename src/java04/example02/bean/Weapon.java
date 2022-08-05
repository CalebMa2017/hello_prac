package java04.example02.bean;

public class Weapon {
    private String name;
    private String color;
    private Legend legend;

    public Weapon(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Weapon() {
    }

    public Weapon(String name, String color, Legend legend) {
        this.name = name;
        this.color = color;
        this.legend = legend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

//    @Override
//    public String toString() {
//        return "Weapon{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", legend=" + legend +
//                '}';
//    }
}
