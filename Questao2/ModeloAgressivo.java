package Questao2;

public class ModeloAgressivo implements CalculadoraRisco{

    @Override
    public double calcularScoreRisco(double income, double assets, double debts){
        return (income * 0.2) + (assets * 0.5) - (debts * 0.1) + 30;
    }
    
}
