package Questao5;

public class Main {
    public static void main(String[] args) {

        LoggerSingleton logger = LoggerSingleton.getInstance();

        logger.log("Aplicação iniciada.");
        logger.log("Usuário autenticado.");
        logger.log("Erro: falha ao carregar módulo X.");

        // Demonstração multi-thread
        Runnable task = () -> {
            LoggerSingleton.getInstance().log("Log de thread concorrente.");
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
