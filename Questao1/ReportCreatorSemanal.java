package Questao1;

public class ReportCreatorSemanal extends ReportCreator {

    @Override
    protected Report createReportInstance(){
        return new RelatorioSemanal();
    }
    
}
