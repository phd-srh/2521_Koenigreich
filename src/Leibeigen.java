public class Leibeigen extends Bauer {
    public Leibeigen(String name, int einkommen) {
        super(name, einkommen);
    }

    @Override
    public int zuVersteuern() {
        int zuVersteuerndesEinkommen = super.zuVersteuern();
        zuVersteuerndesEinkommen -= 12;
        return Math.max(zuVersteuerndesEinkommen, 0);
    }
}
