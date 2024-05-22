import javax.swing.*;

/**
 * Trigonometrische Funktionen mit Java und Swing
 * <p>
 * Projekt im Rahmen der Umschulung zur/m Fachinformatiker/in Anwendungsentwicklung
 * <p>
 * Dozentin: Antje Osten
 * Erweiterungen ab Version 0.11: Guntram Trebs
 * <hr>
 * trigonometric functions in Java and Swing
 * <p>
 * project in the scope of reeducation to software engineering
 * <p>
 * docent: Antje Osten
 * enhancements starting with version 0.11: Guntram Trebs
 * <hr>
 *     class: PlotterWindow (JFrame)
 * <p>
 *     single window with JPanel for drawing some trigonometric functions
 */

public class PlotterWindow extends JFrame {

    private SinusPlotter plotti;

    public PlotterWindow() {
        super("Plotter für Sinus und Kosinus");

        plotti = new SinusPlotter();

        this.add(plotti);

        this.setSize(420, 420);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
