import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class GoldenCookie extends JPanel {


    public GoldenCookie() {
    }

    public static void spawnGoldenCookie() {
        Container container = Main.frame.getContentPane();
        container.setLayout(null); // only if not already set

        Random rand = new Random();
        ImageIcon largeGoldenCookie = new ImageIcon(
                Objects.requireNonNull(GoldenCookie.class.getResource("/goldenCookie.png"))
        );
        Image scaledCookie = largeGoldenCookie.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon cookieIcon = new ImageIcon(scaledCookie);

        JButton goldenButton = new JButton(cookieIcon);
        goldenButton.setBounds(rand.nextInt(901), rand.nextInt(901), 100, 100);

        // 🔧 Make the button display only the image
        goldenButton.setOpaque(false);
        goldenButton.setContentAreaFilled(false);
        goldenButton.setBorderPainted(false);
        goldenButton.setFocusPainted(false);

        container.add(goldenButton);
        container.setComponentZOrder(goldenButton, 0);
        container.repaint(); // refresh the UI

        goldenButton.addActionListener(e -> {
            container.remove(goldenButton);
            container.revalidate();
            container.repaint();

            CookieBuffs.randomBuff();
        });

        Timer timer = new Timer(13000, e -> {
            Main.frame.getContentPane().remove(goldenButton);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        timer.setRepeats(false);
        timer.start();
    }



}

