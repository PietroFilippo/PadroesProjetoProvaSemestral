package Questao3;

public class PainelControle implements SensorObservador {

    @Override
    public void update(double temperature, double humidity, double pollutionIndex) {
        System.out.println("[Painel] Atualização recebida:");
        System.out.println("   Temperatura: " + temperature);
        System.out.println("   Umidade: " + humidity);
        System.out.println("   Poluição: " + pollutionIndex);
    }
}
