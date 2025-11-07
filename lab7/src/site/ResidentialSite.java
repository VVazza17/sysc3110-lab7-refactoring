package site;

public class ResidentialSite extends Site {

    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
