package animasimarquee;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author 1337
 */

public class RunningText extends JFrame implements Runnable {
    Thread th = new Thread(this);
    int x = 5;

    public RunningText() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 300);
        setLocation(500, 0);
        th.start();
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, 400, 300);
        g.drawString("AKU PASTI SUKSES", x, 125);
    }
    public void run() {
        int y = 0;
        boolean gerak = true;
        
        while (true) {
            try {
                th.sleep(100);
                
                if (gerak == true) {
                    x += 5;
                    if (x == 280) {
                        gerak = false;
                    }
                } else {
                    x -= 5;
                    if (x == 10) {
                        gerak = true;
                    }
                }
            } catch (Exception e) {}
            repaint();
        }
    }

    public static void main(String[] args) {
        new RunningText();
    }
}
