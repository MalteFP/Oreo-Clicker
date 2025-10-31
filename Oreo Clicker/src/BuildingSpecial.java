public class BuildingSpecial {
    public int buffDuration;
    public String name;
    public String splashText;
    public int buildingTypeID;
    public int buffTimer;
    public int startedBuildingAmount;

    public BuildingSpecial(int buffDuration, String name, String splashText, int buildingTypeID, int buffTimer, int startedBuildingAmount) {
        this.buffDuration = buffDuration;
        this.name = name;
        this.splashText = splashText;
        this.buildingTypeID = buildingTypeID;
        this.buffTimer = buffTimer;
        this.startedBuildingAmount = startedBuildingAmount;
    }

    public void buildingSpecial() {
        if (this.buffTimer == 0) {
            CookieManager.setMultiplier((int) (CookieManager.getMultiplier() * (1 + (Main.buildingList.get(buildingTypeID).amountOwned)* 0.1)));
            this.startedBuildingAmount = Main.buildingList.get(buildingTypeID).amountOwned;
        }
        this.buffTimer +=buffDuration ;

        CookieBuffs.buffText(this.splashText);
    }

    public void setBuffTimer(int buffTimer) {
        this.buffTimer = buffTimer;
    }
}
