package project.CurrencyConverter;

public class Currency {
    private double rate;
    private String shortName;
    private String fullName;
    private double defaultRate;

    Currency(double defaultRate, String shortName, String fullName) {
        this.rate = defaultRate;
        this.shortName = shortName;
        this.fullName = fullName;
        this.defaultRate = defaultRate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setRateToDefault() {
        this.rate = this.defaultRate;
    }
    public double getDefaultRate() {
        return this.defaultRate;
    }
    public double getRate() {
        return this.rate;
    }
    public String getShortName() {
        return this.shortName;
    }
    public String getFullName() {
        return this.fullName;
    }
}
