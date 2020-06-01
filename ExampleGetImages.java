package contohgetimages;
import java.awt.*;  
import javax.swing.JFrame;  

/**
 *
 * @author CahyoDwi
 */
public class ContohGetImages extends Canvas {
   public void paint(Graphics g) {
      super.paint(g);
      Toolkit t = Toolkit.getDefaultToolkit();  
      Image i = t.getImage("C:/Pic.png");  
      g.drawImage(i, 1, 1, this);  
   }
 
   public static void main(String[] args) {
      ContohGetImages m = new ContohGetImages();
      JFrame f = new JFrame();  
      f.add(m);
      f.setSize(380, 530);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
