package site;

public class Main {
    public static void main(String[] args) {
        Site res  = new ResidentialSite(100, 1.5);
        Site life = new LifelineSite(100, 1.5);

        System.out.println("Residential: " + res.getBillableAmount());
        System.out.println("Lifeline: " + life.getBillableAmount());
    }
}
