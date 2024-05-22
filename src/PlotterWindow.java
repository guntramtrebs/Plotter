import javax.swing.*;

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
