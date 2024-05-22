import javax.swing.*;
import java.awt.*;
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
 *     class: SinusPlotter (JPanel)
 * <p>
 *     paints a coordinate system and some trigonometric functions
 */

public class SinusPlotter extends JPanel {

    @Override
    public void paint(Graphics g) {

        // yellow background
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,420, 400);

        // black y axis
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 400);
        g.drawLine(200, 0, 195, 5);
        g.drawLine(200, 0, 205, 5);
        for (int i=20; i<400; i += 20) {
            g.drawLine(198, i, 202, i);
        }

        // black x axis
        g.setColor(Color.BLACK);
        g.drawLine(0, 200, 400, 200);
        g.drawLine(400, 200, 395, 195);
        g.drawLine(400, 200, 395, 205);
        for (int i=20; i<400; i += 20) {
            g.drawLine(i, 198, i, 202);
        }

        g.setColor(Color.RED);
        g.drawString("y=sin(x)", 10, 45);

        // blue sinus function
        g.setColor(Color.BLUE);

        double oldSinus = Math.sin(-10)*20;
        for(int i=0; i<400; i++) {

            double sinus = Math.sin((double) (i-200)/20);
            sinus *= 20;
            g.drawLine(i-1, 200 - (int)oldSinus, i, 200-(int)sinus);
            oldSinus = sinus;
        }
    }
}