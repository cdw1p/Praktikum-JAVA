package contohthread;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author CahyoDwi
 */
public class ContohThread extends Thread implements Runnable {
    private JLabel Tulisan;
    private JFrame Frm;
    private int X = 0;
    private int LebarTulisan, LebarFrame = 500;
    private boolean Kanan = true;
    private volatile boolean FrmPaused = true, FrmGotSuspend = false;
    private JButton BtnStart = new JButton("Start");
    private JButton BtnSuspend = new JButton("Suspend");
    private JButton BtnExit = new JButton("Exit");
    private Object FrmSuspend = new Object();

    ContohThread() {
        Tulisan = new JLabel("PEMROGRAMAN LANJUT");
        Tulisan.setFont(new Font("ARIAL", Font.BOLD, 36));
        Tulisan.setBounds(X, 100, 460, 50);
        LebarTulisan = Tulisan.getWidth();
        Frm = new JFrame("Menjalankan Teks dengan Thread");
        Frm.setLayout(null);
        Frm.setDefaultCloseOperation(Frm.EXIT_ON_CLOSE);
        Frm.setSize(800, 500);
        Frm.setVisible(true);
        Frm.setLocationRelativeTo(null);
        Frm.add(Tulisan);
        Frm.add(BtnStart);
        BtnStart.addActionListener(BtnListenerPauseResume);
        BtnStart.setLocation(200, 250);
        BtnStart.setSize(100, 40);
        Frm.add(BtnSuspend);
        BtnSuspend.addActionListener(BtnListenerSuspend);
        BtnSuspend.setLocation(310, 250);
        BtnSuspend.setSize(100, 40);
        Frm.add(BtnExit);
        BtnExit.addActionListener(BtnListenerExit);
        BtnExit.setLocation(420, 250);
        BtnExit.setSize(100, 40);
    }
    
    private java.awt.event.ActionListener BtnListenerPauseResume = new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            FrmPaused = !FrmPaused;
            BtnStart.setText(FrmPaused ? "Resume" : "Stop");
            synchronized(FrmSuspend) {
                FrmSuspend.notifyAll();
            }
        }
    };
    
    private java.awt.event.ActionListener BtnListenerSuspend = new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            FrmGotSuspend = !FrmGotSuspend;
            synchronized(FrmSuspend) {
                FrmSuspend.notifyAll();
            }
        }
    };
    
    private java.awt.event.ActionListener BtnListenerExit = new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.exit(0);
        }
    };
    
    private void checkAllActionForm() {
        synchronized(FrmSuspend) {
            while(FrmPaused) {
                try {
                    FrmSuspend.wait();
                } catch (Exception e) {}
            }
            while(FrmGotSuspend) {
                try {
                    showMessageDialog(null, "Will delayed for 5 seconds");
                    FrmSuspend.wait(5000);
                    FrmGotSuspend = !FrmGotSuspend;
                } catch (Exception e) {}
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            checkAllActionForm();
            LebarTulisan = Tulisan.getWidth();
            LebarFrame = Frm.getWidth();
            if (Kanan) {
                if (X + LebarTulisan < LebarFrame) {
                    Kanan = true;
                    X++;
                } else
                    Kanan = false;
            } else {
                if (X > 0) {
                    X--;
                    Kanan = false;
                } else
                    Kanan = true;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
            Tulisan.setBounds(X, 100, LebarTulisan, 50);
        }
    }
    
    public static void main(String Args[]) {
        Thread thread1 = new Thread(new ContohThread());
        thread1.start();
    }
}
