import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class pr4 extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";

    int mousex = 0;
    int mousey = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        mousex = 0;
        mousey = 10;
        msg = "Mouse clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mousex = 0;
        mousey = 10;
        msg = "Mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mousex = 0;
        mousey = 10;
        msg = "Mouse exited";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mousex = e.getX();
        mousey = e.getY();
        msg = "Mouse released";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        mousex = e.getX();
        mousey = e.getY();
        msg = "Mouse pressed";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mousex = e.getX();
        mousey = e.getY();
        msg = "Mouse dragged";
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        showStatus("Mouse Moved at X = " + e.getX() + ", Y = " + e.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mousex, mousey);
    }
}
