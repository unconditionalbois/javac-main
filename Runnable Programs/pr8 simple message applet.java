import java.awt.*;
import java.applet.*;

public class pr8 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        g.drawString("Welcome Hindusthan College of Arts & Science", 30, 150);
    }
}