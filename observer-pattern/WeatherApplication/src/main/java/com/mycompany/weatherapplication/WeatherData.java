package com.mycompany.weatherapplication;

import com.mycompany.weatherapplication.interfaces.Observer;
import com.mycompany.weatherapplication.interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neds
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private Double temperature;
    private Double humidity;
    private Double pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }
    
    public List<Observer> getObserverList() {
        return this.observers;
    }

    @Override
    public void registerObserver(Observer obs) {
        this.observers.add(obs);
        if (this.observers.contains(obs)) {
            System.out.println("The Observer -" + obs.getClass().getSimpleName() + "- was added!");
        }
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
        if (!this.observers.contains(obs)) {
            System.out.println("The Observer -" + obs.getClass().getSimpleName() + "- was removed!");
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("Updating Observers...");
        for(Observer observer: this.observers) {
            observer.update();
        }
        System.out.println("...finished updating Observers");
    }

    /*
        if any of the set methods are executed, call this method in them
        in this method, call notify observers
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }

    public String getTemperature() {
        return "Temperature: " + this.temperature + "C";
    }

    public String getHumidity() {
        return "Humidity: " + this.humidity + "%";
    }

    public String getPressure() {
        return "Pressure: " + this.pressure;
    }
}
