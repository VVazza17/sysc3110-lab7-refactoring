package site;

public class LifelineSite extends Site {

    public LifelineSite(int units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = getBase();
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBase() {
        return _units * _rate;
    }
}
