package DesignPattern.observer.simple;

/**
 * 缺点：1、无法动态添加第三方，新加一个接入方，需要在weatherData中新加一个对象，违反OCR原则
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(1, 2, 3);
        weatherData.setData(2, 3, 4);
    }
}
