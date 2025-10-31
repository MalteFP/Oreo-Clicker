import javax.swing.*;
import java.util.Random;

public class Loop {


    public static void startGameLoop() {
        int delay = 1000;
        Timer timer = new Timer(delay, e -> {
            CookieManager.add(CookieManager.getCPS());
            CookieButton.updateCookieLabels();
            CookieBuffs.tickDownBuffs();
            Random rand = new Random();
            if (rand.nextInt(2) == 0) { // 0 to 9 → 1/10 chance
                GoldenCookie.spawnGoldenCookie();
            }
        });
        timer.start();
    }

}
