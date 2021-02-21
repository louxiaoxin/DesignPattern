package DesignPattern.observer.improve;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new BaiduSite())
                .registerObserver(new GoogleSite());
        weatherData.setData(1, 2, 3);
    }
}
