import javax.swing.*;
import java.awt.*;

public class StatMenu {

    public static void createStatMenuButton() {
        JButton statMenuButton = new JButton("STATS");
        statMenuButton.setBackground(Color.LIGHT_GRAY);
        statMenuButton.setBounds(20, 850, 100, 100);
        statMenuButton.addActionListener(e -> System.out.println("click"));

        Main.frame.add(statMenuButton);
    }





    //JPanel statBackground = new JPanel();
    //statBackground.setBackground(Color.LIGHT_GRAY);
}
