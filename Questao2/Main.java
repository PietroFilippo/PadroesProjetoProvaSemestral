package Questao2;

public class Main {
    public static void main(String[] args) {

        AnaliseContexto context = new AnaliseContexto();

        double renda = 8000;
        double bens = 120000;
        double dividas = 20000;

        System.out.println("== Modelo Agressivo ==");
        context.setCalculadora(new ModeloAgressivo());
        System.out.println("Score: " + context.analise(renda, bens, dividas));

        System.out.println("\n== Modelo Moderado ==");
        context.setCalculadora(new ModeloModerado());
        System.out.println("Score: " + context.analise(renda, bens, dividas));

        System.out.println("\n== Modelo Conservador ==");
        context.setCalculadora(new ModeloConservador());
        System.out.println("Score: " + context.analise(renda, bens, dividas));
    }
}
