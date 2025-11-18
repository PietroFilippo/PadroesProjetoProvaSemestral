package Questao5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerSingleton {

    private static volatile LoggerSingleton instance;

    private FileWriter writer;

    // Construtor privado para evitar instanciação externa
    private LoggerSingleton() {
        try {
            writer = new FileWriter("logs.txt", true);
        } catch (IOException e) {
            throw new RuntimeException("Falha ao criar arquivo de log");
        }
    }

    // Double-checked locking
    public static LoggerSingleton getInstance() {
        if (instance == null) {  
            synchronized (LoggerSingleton.class) {
                if (instance == null) {  
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

    // Método para registrar logs
    public synchronized void log(String message) {
        try {
            String entry = LocalDateTime.now() + " | " + message + "\n";
            writer.write(entry);
            writer.flush();

            // Simulação de envio para servidor externo
            sendToMonitoringServer(message);

        } catch (IOException e) {
            throw new RuntimeException("Erro ao registrar log");
        }
    }

    // Simulação de envio externo
    private void sendToMonitoringServer(String message) {
        System.out.println("[Servidor Externo] Log enviado: " + message);
    }
}
