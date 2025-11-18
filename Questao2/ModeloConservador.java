package Questao2;

public class ModeloConservador implements CalculadoraRisco{

    @Override
    public double calcularScoreRisco(double income, double assets, double debts){
        return (income * 0.1) + (assets * 0.1) - (debts * 0.3) + 7.5;
    }
    
}
