import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CookieButton extends JPanel {
    private static JLabel cookieAmountLabel = null;
    private static JLabel CPS = null;

    public CookieButton() {
        setLayout(null);

        ImageIcon largeCookie = new ImageIcon(
                Objects.requireNonNull(getClass().getResource("/cookie.png"))
        );
        Image scaledCookie = largeCookie.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon cookieIcon = new ImageIcon(scaledCookie);

        JButton cookieButton = new JButton(cookieIcon);
        cookieButton.setBounds(450, 100, 100, 100);

        cookieButton.setOpaque(false);
        cookieButton.setContentAreaFilled(false);
        cookieButton.setBorderPainted(false);
        cookieButton.setFocusPainted(false);

        cookieAmountLabel = new JLabel("You have " + CookieManager.getCookies() + " cookies");
        cookieAmountLabel.setBounds(0, 200, 1000, 30);
        cookieAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cookieAmountLabel.setVerticalAlignment(SwingConstants.CENTER);

        CPS = new JLabel(CookieManager.getCPS() + " Cookies Per Sec");
        CPS.setBounds(0, 230, 1000, 30);
        CPS.setHorizontalAlignment(SwingConstants.CENTER);
        CPS.setVerticalAlignment(SwingConstants.CENTER);

        cookieButton.addActionListener(e -> {
            long newCount = CookieManager.add(CookieManager.getMultiplier() * CookieManager.getClickingMultiplier());
            cookieAmountLabel.setText("You have " + newCount + " cookies");
        });

        add(cookieButton);
        add(cookieAmountLabel);
        add(CPS);
    }

    public static void updateCookieLabels() {
        cookieAmountLabel.setText("You have " + CookieManager.getCookies() + " cookies");
        CPS.setText(CookieManager.getCPS() + " Cookies Per Sec");
    }
}
