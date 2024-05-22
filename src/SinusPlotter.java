import javax.swing.*;
import java.awt.*;

public class SinusPlotter extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);
    }
}
