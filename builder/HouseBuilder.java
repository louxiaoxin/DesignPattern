package DesignPattern.builder;

public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
