import java.util.Scanner;

public class Königreich {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        while (true) {
            System.out.print("Name des Einwohners: ");
            String name = eingabe.nextLine();
            if (name.isBlank()) break;
            System.out.print("Bevölkerungsgruppe des Einwohners (K, A, B, L): ");
            char gruppe = eingabe.nextLine().toUpperCase().charAt(0);
            System.out.print("Einkommen des Einwohners: ");
            int einkommen = eingabe.nextInt();
            eingabe.nextLine(); // Eingabezeile konsumieren

            Einwohner einwohner = erzeugeEinwohner(name, gruppe, einkommen);
            if (einwohner != null) {
                System.out.println("Einwohner " + name + " muss " +
                        einwohner.steuer() + " Taler Steuern zahlen");
            }
        }
    }

    private static Einwohner erzeugeEinwohner(String name, char gruppe, int einkommen) {
        switch (gruppe) {
            case 'K':
                return new König(name, einkommen);
            case 'A':
                return new Adel(name, einkommen);
            case 'B':
                return new Bauer(name, einkommen);
            case 'L':
                return new Leibeigen(name, einkommen);
        }
        System.out.println("Ungültige Bevölkerungsgruppe!");
        return null;
    }
}
