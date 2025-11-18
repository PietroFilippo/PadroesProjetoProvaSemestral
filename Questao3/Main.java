package Questao3;

public class Main {
    public static void main(String[] args) {

        SensorConcreto sensor = new SensorConcreto();

        SensorObservador panel = new PainelControle();
        SensorObservador alerts = new ModuloAlertas();
        SensorObservador history = new RegistroHistorico();

        sensor.registerObservador(panel);
        sensor.registerObservador(alerts);
        sensor.registerObservador(history);

        System.out.println("Nova Leitura");
        sensor.setMeasurements(33.5, 60, 72);

        System.out.println("\nNova Leitura");
        sensor.setMeasurements(37.2, 55, 90);
    }
}
