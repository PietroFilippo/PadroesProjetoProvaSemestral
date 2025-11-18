package Questao1;

public class ReportCreatorDiario extends ReportCreator {

    @Override
    protected Report createReportInstance(){
        return new RelatorioDiario();
    }
    
}
