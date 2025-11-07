package site;

public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public Site(int units, double rate) {
        _units = units;
        _rate = rate;
    }

    public double getBillableAmount() {
        double base = getBaseAmount();
        double tax  = getTaxAmount(base);
        return base + tax;
    }

    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount(double base);

}
