package com.mycompany.weatherapplication;

import com.mycompany.weatherapplication.interfaces.DisplayElement;
import com.mycompany.weatherapplication.interfaces.Observer;

/**
 *
 * @author Neds
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    
    private WeatherData weatherData;
    
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Temperature: " + weatherData.getTemperature());
        System.out.println("Humidity: " + weatherData.getHumidity());
        System.out.println("Pressure: " + weatherData.getPressure());
    }

}
