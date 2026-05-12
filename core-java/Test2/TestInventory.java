public class TestInventory {
    public static void main(String[] args) {
        InventoryManager  inventoryManager1 = new InventoryManager(101, "Laptop", 15, 2, 1200.0, 5, false);
        InventoryManager inventoryManager2 = new InventoryManager(102, "Winter Jacket", 50, 8, 85.0, 10, true);
        InventoryManager inventoryManager3 = new InventoryManager(103, "Organic Milk", 5, 12, 4.5, 2, false);
        InventoryManager inventoryManager4 = new InventoryManager(104, "Smartphone", 100, 5, 800.0, 7, false);

        System.out.println("=== SMART INVENTORY STATUS REPORT ===");
        
        InventoryManager[] products = {inventoryManager1, inventoryManager2, inventoryManager3, inventoryManager4};

        for (InventoryManager p : products) {
            System.out.println("Product: " + p.productName);
            System.out.println(" - Status: " + p.checkStockStatus());
            System.out.println(" - Projected Weekly Revenue: $" + p.calculateWeeklyRevenue());
            System.out.println("-------------------------------------");
        }

        // 2. Show average inventory value
        System.out.printf("Average Inventory Value: $%.2f\n", InventoryManager.getAverageInventoryValue());
        System.out.println("-------------------------------------");

        // 3. Simulate restocking for one product
        System.out.println("Action: Restocking Product 103...");
        inventoryManager3.restock(50);
        System.out.println("New Status for " + inventoryManager3.productName + ": " + inventoryManager3.checkStockStatus());
        System.out.printf("Updated Global Average Value: $%.2f\n", InventoryManager.getAverageInventoryValue());
    }
}