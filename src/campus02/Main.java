package campus02;

public class Main {

    public static void main(String[] args) {
	// Impfen
        int jahr = naechsteZeckenImpfung(45,2009, false);
        System.out.println("Auffrischung ist in " + jahr + " Jahren nötig");


    }

    public static int naechsteZeckenImpfung (int alter, int letztesImpfungsjahr, boolean ersteAuffrischung) {
       int auffrischung;

        if (ersteAuffrischung || alter >= 60) {
            auffrischung = 3;
        }
        else {
            auffrischung = 5;
        }
        return auffrischung;
    }


}
