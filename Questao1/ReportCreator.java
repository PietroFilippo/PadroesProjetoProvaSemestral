package Questao1;

public abstract class ReportCreator {
    
    public void createReport(){
        Report report = createReportInstance();
        report.collectData();
        report.formatReport();
        report.generateFile();
    }

    // Factory Method
    protected abstract Report createReportInstance();
}
