package com.mycompany.weatherapplication;


/**
 *
 * @author Neds
 */
public class WeatherApplication {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        System.out.println(weatherData.getObserverList().size());
        weatherData.registerObserver(currentConditionsDisplay);
        System.out.println(weatherData.getObserverList().size());
        weatherData.setTemperature(25.5);
    }
}
