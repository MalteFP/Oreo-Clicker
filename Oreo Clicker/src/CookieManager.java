
import java.util.concurrent.atomic.AtomicLong;

public class CookieManager {
    private static final AtomicLong cookies = new AtomicLong();
    private static int multiplier=1;
    private static int clickingMultiplier=1;

    public static long getCookies() {
        return cookies.get();
    }

    public static long add(long amount) {
        return cookies.addAndGet(amount);

    }

    public static long getCPS() {
        long totalProduction = 0;

        for (int i = 0; i < Main.buildingList.size(); i++) {
            totalProduction += (long) (Main.buildingList.get(i).getAmountOwned() * Main.buildingList.get(i).getBaseProduction()*multiplier);
        }
        return totalProduction;
    }

    public static int getMultiplier() {
        return multiplier;
    }

    public static void setMultiplier(int newMultiplier) {
        multiplier = newMultiplier;
    }

    public static int getClickingMultiplier() {
        return clickingMultiplier;
    }

    public static void setClickingMultiplier(int clickingMultiplier) {
        CookieManager.clickingMultiplier = clickingMultiplier;
    }
}
