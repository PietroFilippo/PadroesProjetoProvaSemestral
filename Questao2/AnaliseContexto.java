package Questao2;

public class AnaliseContexto {
    
    private CalculadoraRisco calcular;

    public void setCalculadora(CalculadoraRisco calcular){
        this.calcular = calcular;
    }

    public double analise(double income, double assets, double debts){
        if (calcular == null){
            throw new IllegalStateException("Nenhum modelo de risco configurado");
        }
        return calcular.calcularScoreRisco(income, assets, debts);
    }      
}
