package site;

public class LifelineSite extends Site {

    public LifelineSite(int units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }
}
