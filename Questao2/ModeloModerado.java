package Questao2;

public class ModeloModerado implements CalculadoraRisco{

    @Override
    public double calcularScoreRisco(double income, double assets, double debts){
        return (income * 0.15) + (assets * 0.3) - (debts * 0.2) + 15;
    }
    
}
