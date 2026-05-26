public class TowerRunner {
    public static void main(String[] args) {
        int[] heights = {54, 82, 110};

        TowerType[] towerList = new TowerType[3];
        towerList[0] = new TowerType("Residential", "USA");
        towerList[1] = new TowerType("Observation", "India");
        towerList[2] = new TowerType("Communication", "Rasia");

        Tower tower = new Tower(heights, towerList);
        tower.displayTowerSpecs();
    }
}