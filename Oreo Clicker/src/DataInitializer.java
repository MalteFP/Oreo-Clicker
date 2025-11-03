import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DataInitializer {


    public static ArrayList<Building> createBuildingList(){
        ArrayList<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building(15, 1, "Cursor", 0, 0, new JButton()));
        buildingList.add(new Building(100, 1, "Grandma", 1, 0, new JButton()));
        buildingList.add(new Building(1100, 8, "Farm", 2, 0, new JButton()));
        buildingList.add(new Building(12000, 47, "Mine", 3, 0, new JButton()));
        buildingList.add(new Building(130000, 260, "Factory", 4, 0, new JButton()));
        buildingList.add(new Building(1400000, 1400, "Bank", 5, 0, new JButton()));
        buildingList.add(new Building(20000000, 7800, "Temple", 6, 0, new JButton()));
        buildingList.add(new Building(330000000, 44000, "Wizard Tower", 7, 0, new JButton()));
        buildingList.add(new Building(5100000000L, 260000, "Shipment", 8, 0, new JButton()));
        buildingList.add(new Building(75000000000L, 1600000, "Alchemy Lab", 9, 0, new JButton()));
        buildingList.add(new Building(1000000000000L, 10000000, "Portal", 10, 0, new JButton()));
        buildingList.add(new Building(14000000000000L, 65000000, "Time Machine", 11, 0, new JButton()));
        return buildingList;
    }
    public static ArrayList<BuildingSpecial> createBuildingSpecialList(){
        ArrayList<BuildingSpecial> buildingSpecialList = new ArrayList<>();
        buildingSpecialList.add(new BuildingSpecial(30,"Cursor","HIGH FIVE!",0,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Grandma","CONGREGATION!",1,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Farm","LUXURIAN HARVEST!",2,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Mine","ORE VEIN!",3,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Factory","OILED-UP!",4,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Bank","JUICY PROFITS!",5,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Temple","FERVENT ADORATION!",6,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Wizard Tower","MANABLOOM!",7,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Shipment","DELICIOUS LIFEFORMS!",8,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Alchemy Lab","BREAKTHROUGH!",9,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Portal","RIGHTOEUS CATACLYSM!",10,0,0));
        buildingSpecialList.add(new BuildingSpecial(30,"Time Machine","EXTRA CYCLES!",11,0,0));
        return buildingSpecialList;
    }

    public static void addStartingVisuals() {
        Main.frame = new JFrame("Cookie Clicker");
        Main.frame.setSize(1000, 1000);
        Main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main.frame.setLayout(null);


        CookieButton cookieButton = new CookieButton();
        cookieButton.setBounds(0, 0, 1000, 300);
        Main.frame.add(cookieButton);


        for (Building building : Main.buildingList) {
            building.makeVisuals(Main.frame.getContentPane());
        }

        StatMenu.createStatMenuButton();



    }

    public static ArrayList<Stat> createStatList() {
        ArrayList<Stat> statList = new ArrayList<>();
        statList.add(new Stat("Oreo clicks",0,0));
        statList.add(new Stat("Oreos made by clicking",0,1));
        statList.add(new Stat("Total oreos made",0, 2));
        statList.add(new Stat("Golden Oreo clicks",0, 3));
        statList.add(new Stat("Different buildings owned",0, 4));
        statList.add(new Stat("",0, statList.size()));
        statList.add(new Stat("",0, statList.size()));
        statList.add(new Stat("",0, statList.size()));

        return statList;
    }
}
