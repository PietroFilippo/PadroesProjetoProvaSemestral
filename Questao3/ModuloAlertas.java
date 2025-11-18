package Questao3;

public class ModuloAlertas implements SensorObservador {

    @Override
    public void update(double temperature, double humidity, double pollutionIndex) {
        if (temperature > 35) {
            System.out.println("[Alertas] Alerta: Temperatura muito alta!");
        }
        if (pollutionIndex > 80) {
            System.out.println("[Alertas] Alerta: Nível de poluição crítico!");
        }
    }
}
