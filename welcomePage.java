import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class welcomePage extends JPanel {

    JButton HTML,
            CSS,
            exit;

    static boolean go = false;

    welcomePage(JFrame window) {

        setSize(1280, 720);
        setLayout(null);
        window.setContentPane(this);

        // Create game title label
        JLabel bg = new JLabel(
                new ImageIcon("./images/wall.png"));
        bg.setBounds(0, 0, getWidth(), getHeight());

        // Image Icon
        ImageIcon HTMLicon = new ImageIcon("./images/312603806_5810195625697814_3460389709640624253_n.jpg");
        HTML = new JButton("HTML", HTMLicon);
        HTML.setBounds(220, 50, 200, 50);
        add(HTML);

        ImageIcon CSSicon = new ImageIcon("./images/312603806_5810195625697814_3460389709640624253_n.jpg");
        CSS = new JButton("CSS", CSSicon);
        CSS.setBounds(420, 50, 200, 50);
        add(CSS);

        exit = new JButton("Exit");
        exit.setBackground(new Color(255, 255, 255));
        exit.setBounds(300, 350, 200, 50);
        add(exit);

        add(bg);
        window.setVisible(true);
    }

    void choose(int time) {

        HTML.addActionListener((ActionEvent e) -> {
            go = true;
            setVisible(false);
        });

        CSS.addActionListener((ActionEvent e) -> {
            go = true;
            setVisible(false);
        });

        exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        while (!go) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }

        go = false;

    }
}