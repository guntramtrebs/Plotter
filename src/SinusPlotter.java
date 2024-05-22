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
 * class: SinusPlotter (JPanel)
 * <p>
 * paints a coordinate system and some trigonometric functions
 */

public class SinusPlotter extends JPanel {

    @Override
    public void paint(Graphics g) {
        // arrows of coordinate axes
        final int arrowLength = 18;
        final int arrowWidth = 7;

        final int pixelPerUnit = 20;

        final int panelHeight = this.getHeight();
        final int panelWidth = this.getWidth();

        // calculate some fix ui values
        final int arrowHalfWidth = (arrowWidth - 1) / 2;
        final int originX = panelWidth / 2;
        final int originY = panelHeight / 2;

        // yellow background
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, panelWidth, panelHeight);

        // black y axis
        g.setColor(Color.BLACK);
        g.drawLine(originX, 0, originX, panelHeight);

        g.drawLine(originX, 0, originX - arrowHalfWidth, arrowLength);
        g.drawLine(originX, 0, originX + arrowHalfWidth, arrowLength);

        final int leftUnit = -originX / pixelPerUnit;
        final int rightUnit = originX / pixelPerUnit;
        final int topUnit = originY / pixelPerUnit;
        final int bottomUnit = -originY / pixelPerUnit;


        for (int i = bottomUnit; i < topUnit; i++) {
            g.drawLine(originX - 2, originY - i * pixelPerUnit, originX + 2, originY - i * pixelPerUnit);
        }

        // black x axis
        g.setColor(Color.BLACK);
        g.drawLine(0, originY, panelWidth, originY);
        g.drawLine(panelWidth, originY, panelWidth - arrowLength, originY - arrowHalfWidth);
        g.drawLine(panelWidth, originY, panelWidth - arrowLength, originY + arrowHalfWidth);
        for (int i = leftUnit; i < rightUnit; i++) {
            g.drawLine(originX + i * pixelPerUnit, originY - 2, originX + i * pixelPerUnit, originY + 2);
        }

        g.setColor(Color.RED);
        g.drawString("y=sin(x)", 10, 45);

        // blue sinus function
        g.setColor(Color.BLUE);

        int oldX = 0;
        double oldY = originY - Math.sin((oldX - originX) / (double) pixelPerUnit) * pixelPerUnit;
        for (int x = 1; x < panelWidth; x++) {
            double y = originY - Math.sin((x - originX) / (double) pixelPerUnit) * pixelPerUnit;
            g.drawLine(oldX, (int) oldY, x, (int) y);
            oldY = y;
            oldX = x;
        }
    }
}