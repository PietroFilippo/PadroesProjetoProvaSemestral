package Questao3;

public interface Sensor {
    void registerObservador(SensorObservador observador);
    void removeObservador(SensorObservador observador);
    void notifyObservador();
}
