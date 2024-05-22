import javax.swing.*;
import java.awt.*;

public class SinusPlotter extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);

        for (int i=20; i<400; i += 20) {
            g.drawLine(i, 198, i, 202);
            g.drawLine(198, i, 202, i);
        }
    }
}
