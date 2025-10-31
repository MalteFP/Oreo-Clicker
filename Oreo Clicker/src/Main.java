import javax.swing.*;
import java.util.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Building> buildingList = new ArrayList<>();
    static JFrame frame;

    public static void main(String[] args) {
        // Initialize frame
        frame = new JFrame("Cookie Clicker");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Use absolute positioning

        // Add CookieButton panel
        CookieButton cookiePanel = new CookieButton();
        cookiePanel.setBounds(0, 0, 1000, 300); // Position and size the panel
        frame.add(cookiePanel);

        // Add buildings
        buildingList.add(new Building(15, 1, "Cursor", 1, 0, new JButton()));
        buildingList.add(new Building(100, 1, "Grandma", 2, 0, new JButton()));
        buildingList.add(new Building(1100, 8, "Farm", 3, 0, new JButton()));
        buildingList.add(new Building(12000, 47, "Mine", 4, 0, new JButton()));
        buildingList.add(new Building(130000, 260, "Factory", 5, 0, new JButton()));
        buildingList.add(new Building(1400000, 1400, "Bank", 6, 0, new JButton()));
        buildingList.add(new Building(20000000, 7800, "Temple", 7, 0, new JButton()));
        buildingList.add(new Building(330000000, 44000, "Wizard Tower", 8, 0, new JButton()));
        buildingList.add(new Building(5100000000L, 260000, "Shipment", 9, 0, new JButton()));
        buildingList.add(new Building(75000000000L, 1600000, "Alchemy Lab", 10, 0, new JButton()));

        // Add building visuals
        for (Building building : buildingList) {
            building.makeVisuals(frame.getContentPane());
        }

        // Start game loop
        Loop.startGameLoop();

        // Show frame
        frame.setVisible(true);


    }
}

