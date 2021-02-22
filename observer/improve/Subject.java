package DesignPattern.observer.improve;

public interface Subject {
    WeatherData registerObserver(Observer o);

    WeatherData removeObserver(Observer o);

    void notifyObservers();
}
