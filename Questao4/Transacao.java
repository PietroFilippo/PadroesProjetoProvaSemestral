package Questao4;

public class Transacao {
    private double amount;
    private String location;
    private int userRiskScore;
    private String deviceId;

    public Transacao(double amount, String location, int userRiskScore, String deviceId) {
        this.amount = amount;
        this.location = location;
        this.userRiskScore = userRiskScore;
        this.deviceId = deviceId;
    }

    public double getAmount() { return amount; }
    public String getLocation() { return location; }
    public int getUserRiskScore() { return userRiskScore; }
    public String getDeviceId() { return deviceId; }
}
