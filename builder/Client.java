package DesignPattern.builder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HighBuilding();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = houseDirector.constructHouse();
    }
}
