package dev.robertscott.springmavenexample;

public class TellerBaseballCoach extends BaseballCoach{

    private FortuneTeller fortuneTeller;

    public TellerBaseballCoach(FortuneTeller fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
    }

    public FortuneTeller getFortuneTeller() {
        return fortuneTeller;
    }

    public void setFortuneTeller(FortuneTeller fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
    }
}
