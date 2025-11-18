package Questao4;

public class Historico extends FraudeCheck{
 
    @Override
    protected boolean check(Transacao transaction) {
        return transaction.getUserRiskScore() <= 70; // 0 = seguro, 100 = arriscado
    }
}
