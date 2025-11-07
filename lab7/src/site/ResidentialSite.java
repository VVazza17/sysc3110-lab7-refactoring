package site;

public class ResidentialSite extends Site {

    public ResidentialSite(int units, double rate) {
        super(units, rate);
    }

    @Override
    public double getBillableAmount() {
        double base = _units * _rate * 0.5;
        double tax  = base * Site.TAX_RATE;
        return base + tax;
    }
}
