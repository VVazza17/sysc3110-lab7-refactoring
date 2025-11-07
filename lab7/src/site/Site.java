package site;

public abstract class Site {
    protected int _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public Site(int units, double rate) {
        _units = units;
        _rate = rate;
    }

    public abstract double getBillableAmount();
}
