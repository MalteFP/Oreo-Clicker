import javax.swing.*;
import java.awt.*;

public class Building extends JPanel {
    public long basePrice;
    public long baseProduction;
    public String name;
    public int buildingID;
    public int amountOwned;
    public JButton button;

    public Building(long basePrice, long baseProduction, String name, int buildingID, int amountOwned, JButton button) {
        this.basePrice = basePrice;
        this.baseProduction = baseProduction;
        this.name = name;
        this.buildingID = buildingID;
        this.amountOwned = amountOwned;
        this.button = button;
    }

    public void buyBuilding(JLabel ownedLabel){
        if(CookieManager.getCookies()>= basePrice*Math.pow(1.15, amountOwned)){
            CookieManager.add((int) (-basePrice*Math.pow(1.15, amountOwned)));
            this.amountOwned++;
            button.setText("Buy " + name + " for " + basePrice*Math.pow(1.15, amountOwned));
            ownedLabel.setText("You own " + amountOwned + " " + name);

        }

    }

    public void makeVisuals(Container panel) {

        button.setText("Buy " + name + " for " + basePrice*Math.pow(1.15, amountOwned));
        button.setBounds(600, 300 + (50 * buildingID), 400, 30);

        JLabel buildingLabel = new JLabel(name + " produces " + baseProduction + " cps");
        buildingLabel.setBounds(600, 320 + (50 * buildingID), 200, 30);

        JLabel ownedLabel = new JLabel("You own " + amountOwned + " " + name);
        ownedLabel.setBounds(800, 320 + (50 * buildingID), 200, 30);

        button.addActionListener(e -> buyBuilding(ownedLabel));

        panel.add(button);
        panel.add(buildingLabel);
        panel.add(ownedLabel);
    }

    public int getAmountOwned() {
        return amountOwned;
    }

    public long getBaseProduction() {
        return baseProduction;
    }
}
