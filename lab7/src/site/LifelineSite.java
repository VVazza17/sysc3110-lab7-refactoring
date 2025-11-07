package site;

public class LifelineSite extends Site {

    public LifelineSite(int units, double rate) {
        super(units, rate);
    }

    @Override
    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }
}
