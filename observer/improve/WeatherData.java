package DesignPattern.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private float tempetature;

    private float pressure;

    private float humidity;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.tempetature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public WeatherData registerObserver(Observer o) {
        observers.add(o);
        return this;
    }

    @Override
    public WeatherData removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
        return this;
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.tempetature, this.pressure, this.tempetature);
        }
    }
}
