package Questao3;

import java.util.ArrayList;
import java.util.List;

public class SensorConcreto implements Sensor {

    private List<SensorObservador> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pollutionIndex;

    @Override
    public void registerObservador(SensorObservador observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservador(SensorObservador observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservador() {
        for (SensorObservador obs : observers) {
            obs.update(temperature, humidity, pollutionIndex);
        }
    }

    // Quando um sensor atualiza seus valores
    public void setMeasurements(double temperature, double humidity, double pollutionIndex) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pollutionIndex = pollutionIndex;
        notifyObservador();
    }
}
