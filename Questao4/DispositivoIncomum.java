package Questao4;

public class DispositivoIncomum extends FraudeCheck {
    
    @Override
    protected boolean check(Transacao transaction) {
        return !transaction.getDeviceId().equalsIgnoreCase("UNKNOWN");
    }
}
