import javax.swing.*;
import java.awt.*;

public class SinusPlotter extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,420, 400);

        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);

        for (int i=20; i<400; i += 20) {
            g.drawLine(i, 198, i, 202);
            g.drawLine(198, i, 202, i);
        }

        g.drawLine(400, 200, 395, 195);
        g.drawLine(400, 200, 395, 205);
        g.drawLine(200, 0, 195, 5);
        g.drawLine(200, 0, 205, 5);

        g.setColor(Color.RED);
        g.drawString("y=sin(x)", 10, 45);

        double oldSinus = Math.sin(-10)*20;

        for(int i=0; i<400; i++) {
            g.setColor(Color.BLUE);

            double sinus = Math.sin((double) (i-200)/20);
            sinus *= 20;
            g.drawLine(i-1, 200 - (int)oldSinus, i, 200-(int)sinus);
            oldSinus = sinus;
        }
    }
}
