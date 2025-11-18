package Questao1;

public class Main {
    public static void main(String[] args) {
        ReportCreator dailyCreator = new ReportCreatorDiario();
        ReportCreator weeklyCreator = new ReportCreatorSemanal();

        System.out.println("Criando relatóro diario");
        dailyCreator.createReport();

        System.out.println("Criando relatóro semanal");
        weeklyCreator.createReport();
    }
}
