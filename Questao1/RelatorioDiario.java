package Questao1;

public class RelatorioDiario implements Report {

    @Override
    public void collectData() {
        System.out.println("Coletando dados do dia (ordens processadas, entregas, falhas).");
    }

    @Override
    public void formatReport() {
        System.out.println("Formatando relatório diário em PDF.");
    }

    @Override
    public void generateFile() {
        System.out.println("Gerando arquivo: relatorio_diario.pdf");
    }
}
