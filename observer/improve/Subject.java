package DesignPattern.observer.improve;

import java.util.List;

public interface Subject {
    WeatherData registerObserver(Observer o);

    WeatherData removeObserver(Observer o);

    void notifyObservers();
}
