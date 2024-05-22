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
    }
}
