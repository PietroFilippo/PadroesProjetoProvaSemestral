package Questao4;

public class ProcessadorTransacao {
    
    private FraudeCheck chain;

    public ProcessadorTransacao(FraudeCheck chain) {
        this.chain = chain;
    }

    public void process(Transacao transaction) {
        chain.execute(transaction);
        System.out.println("Transação aprovada.");
    }
}