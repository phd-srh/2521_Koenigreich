public class Adel extends Einwohner {
    public Adel(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int steuer() {
        int zuEntrichten = super.steuer();
        return Math.max(zuEntrichten, 20);
    }
}
