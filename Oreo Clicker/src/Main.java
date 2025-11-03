import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Building> buildingList = DataInitializer.createBuildingList();
    static ArrayList<BuildingSpecial> buildingSpecialList = DataInitializer.createBuildingSpecialList();
    static ArrayList<Stat> statList = DataInitializer.createStatList();
    static JFrame frame;


    public static void main(String[] args) {
        // Initialize frame
       DataInitializer.addStartingVisuals();


        // Start game loop
        Loop.startGameLoop();

        // Show frame
        frame.setVisible(true);






    }
}

