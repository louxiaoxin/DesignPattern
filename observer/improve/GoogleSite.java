package DesignPattern.observer.improve;

public class GoogleSite implements Observer {
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
        System.out.print("谷歌温度: " + temperature);
        System.out.print(", 谷歌气压: " + pressure);
        System.out.println(", 谷歌湿度: " + humidity);
    }
}
