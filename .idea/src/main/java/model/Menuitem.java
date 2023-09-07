package model;

public class Menuitem {
    int id;
    String menuName;
    boolean isVeg;
    double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public double getPrice() {
        return price;
    }
}
