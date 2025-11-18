package Questao1;

public class RelatorioSemanal implements Report {

    @Override
    public void collectData() {
        System.out.println("Coletando dados da semana (ordens processadas, entregas, falhas).");
    }

    @Override
    public void formatReport() {
        System.out.println("Formatando relatório semanais em PDF.");
    }

    @Override
    public void generateFile() {
        System.out.println("Gerando arquivo: relatorio_semanal.pdf");
    }
}