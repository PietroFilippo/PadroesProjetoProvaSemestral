package Questao4;

public class ValorSuspeito extends FraudeCheck {

    @Override
    protected boolean check(Transacao transaction) {
        return transaction.getAmount() <= 5000; // Exemplo: acima disso é suspeito
    }
}