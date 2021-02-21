package DesignPattern.observer.improve;

public class BaiduSite implements Observer {
    private float temperature;

    private float pressure;

    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.print("百度温度: " + temperature);
        System.out.print(", 百度气压: " + pressure);
        System.out.println(", 百度湿度: " + humidity);
    }
}
