package Questao4;

public class Main {
    public static void main(String[] args) {

        // Montando a cadeia de verificações
        FraudeCheck chain = new ValorSuspeito();
        chain.setNext(new Geolocalizacao())
             .setNext(new Historico())
             .setNext(new DispositivoIncomum());

       ProcessadorTransacao processor = new ProcessadorTransacao(chain);

        Transacao tx = new Transacao(
                3500,
                "BR",
                40,
                "DEVICE123"
        );

        processor.process(tx);

        System.out.println("\nTestando transação suspeita");
        Transacao tx2 = new Transacao(
                9000,
                "BR",
                10,
                "DEVICE123"
        );

        try {
            processor.process(tx2);
        } catch (RuntimeException e) {
            System.out.println("Falhou: " + e.getMessage());
        }
    }
}
