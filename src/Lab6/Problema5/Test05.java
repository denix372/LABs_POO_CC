/*
 * Programare orientata pe obiecte
 * Seria CC
 * Laboratorul 6
 */
package Lab6.Problema5;

/**
 *
 * @author Nan Mihai
 */
public class Test05 {
    public static void main(String[] args) {
        Tren t = new Tren();
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriA());
        t.addVagon(new CalatoriB());
        t.addVagon(new CalatoriB());
        t.addVagon(new Marfa());
        System.out.println(t);

        System.out.println("\n--- Servicii vagoane ---");
        for (Vagon v : t.getVagoane()) {
            v.deschideUsi();
            v.inchideUsi();
            v.blocheazaGeamuri();
            System.out.println("Capacitate colete: " + v.getCapacitateColete());
            System.out.println("Capacitate pasageri: " + v.getCapacitatePasageri());

            System.out.println();
        }
    }
}
