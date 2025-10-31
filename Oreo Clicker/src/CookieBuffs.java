import javax.swing.*;
import java.util.List;
import java.util.Random;

public class CookieBuffs {
    public static int frenzyDuration = 0;
    public static int clickingFrenzyDuration = 0;

    public static void frenzy() {
        if (frenzyDuration == 0) {
            CookieManager.setMultiplier(CookieManager.getMultiplier() * 7);
        }
        buffText("FRENZY!");
        frenzyDuration += 77;
    }

    public static void clickingFrenzy() {
        if (clickingFrenzyDuration == 0) {
            CookieManager.setClickingMultiplier(CookieManager.getClickingMultiplier() * 777);
        }
        buffText("CLICKING FRENZY!");
        clickingFrenzyDuration += 13;
    }

    public static void lucky() {
        if (CookieManager.getCookies() * 0.1 + 13 > CookieManager.getCPS() * 1200) {
            CookieManager.add((int) (CookieManager.getCookies() * 0.1 + 13));
        } else {
            CookieManager.add(CookieManager.getCPS() * 1200L);
        }
        buffText("LUCKY!");
    }

    public static void buildingSpecial() {
        if(Main.playerStats.getDifferentBuildingsOwned()>=10){
            Random rand = new Random();
            Main.buildingSpecialList.get(rand.nextInt(Main.buildingSpecialList.size())).buildingSpecial();

        }else {
            frenzy();
        }

    }

    public static void randomBuff() {
        List<Runnable> buffs = List.of(
               /* CookieBuffs::frenzy,
                CookieBuffs::clickingFrenzy,
                CookieBuffs::lucky,*/
                CookieBuffs::buildingSpecial
        );

        Random rand = new Random();
        buffs.get(rand.nextInt(buffs.size())).run(); // Run a random buff
    }

    public static void buffText(String type) {
        JLabel tempLabel = new JLabel(type);
        tempLabel.setBounds(0, 300, 1000, 30); // x, y, width, height
        tempLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tempLabel.setVerticalAlignment(SwingConstants.CENTER);

        Main.frame.getContentPane().add(tempLabel);
        Main.frame.repaint();

        Timer timer = new Timer(2000, e -> {
            Main.frame.getContentPane().remove(tempLabel);
            Main.frame.revalidate();
            Main.frame.repaint();
        });
        timer.setRepeats(false);
        timer.start();


    }

    public static void tickDownBuffs() {
        if (frenzyDuration > 1) {
            frenzyDuration--;
        } else if (frenzyDuration == 1) {
            CookieManager.setMultiplier(CookieManager.getMultiplier() / 7);
            frenzyDuration--;
        }
        if (clickingFrenzyDuration > 1) {
            clickingFrenzyDuration--;
        } else if (clickingFrenzyDuration == 1) {
            CookieManager.setClickingMultiplier(CookieManager.getClickingMultiplier() / 777);
            clickingFrenzyDuration--;
        }
        for(int i = 0; i < Main.buildingSpecialList.size();i++) {
            if(Main.buildingSpecialList.get(i).buffTimer > 1) {
                Main.buildingSpecialList.get(i).setBuffTimer(Main.buildingSpecialList.get(i).buffDuration-1);
            } else if (Main.buildingSpecialList.get(i).buffTimer == 1) {
                CookieManager.setMultiplier((int) (CookieManager.getMultiplier()/(1+0.1*Main.buildingSpecialList.get(i).startedBuildingAmount)));
            }
        }
    }
}
