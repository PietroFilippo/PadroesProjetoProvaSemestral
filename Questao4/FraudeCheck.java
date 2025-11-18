package Questao4;

public abstract class FraudeCheck {

    protected FraudeCheck next;

    public FraudeCheck setNext(FraudeCheck next) {
        this.next = next;
        return next;
    }

    public void execute(Transacao transaction) {
        if (!check(transaction)) {
            throw new RuntimeException("Transação bloqueada pela verificação: " + this.getClass().getSimpleName());
        }

        if (next != null) {
            next.execute(transaction);
        }
    }

    // Cada etapa implementa sua validação
    protected abstract boolean check(Transacao transaction);
}
