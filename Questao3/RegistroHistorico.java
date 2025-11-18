package Questao3;

public class RegistroHistorico implements SensorObservador {

    @Override
    public void update(double temperature, double humidity, double pollutionIndex) {
        System.out.println("[Histórico] Registrando nova leitura no banco de dados...");
    }
}
