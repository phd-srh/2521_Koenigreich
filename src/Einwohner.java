public class Einwohner {
    private String name;
    private int einkommen;

    public Einwohner(String name, int einkommen) {
        this.name = name;
        this.einkommen = einkommen;
    }

    public int zuVersteuern() {
        return einkommen;
    }

    public int steuer() {
        //int zuVersteuerndesEinkommen = einkommen; // BAD IDEA
        int zuVersteuerndesEinkommen = zuVersteuern(); // BESSER
        int zuEntrichten = zuVersteuerndesEinkommen * 10 / 100;
//        if (zuEntrichten < 1) zuEntrichten = 1;
//        return zuEntrichten;
        return (zuEntrichten > 1) ? zuEntrichten : 1; // tenärer Operator
    }
}
