package com.mycompany.weatherapplication.interfaces;

/**
 *
 * @author Neds
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
