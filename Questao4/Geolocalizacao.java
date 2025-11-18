package Questao4;

public class Geolocalizacao extends FraudeCheck{
    
   @Override
    protected boolean check(Transacao transaction) {
        // Local válido para exemplo
        return transaction.getLocation().equalsIgnoreCase("BR");
    }
}
