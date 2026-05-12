class InventoryManager {
   
    static int totalProductsTracked = 0;
    static double totalInventoryValue = 0.0;

    int productId;
    String productName;
    int currentStock;
    int dailySalesRate;
    double unitPrice;
    int leadTimeDays;
    boolean isSeasonal;
	
     InventoryManager(int productId, String productName, int currentStock, 
                            int dailySalesRate, double unitPrice, int leadTimeDays, boolean isSeasonal) {
        this.productId = productId;
        this.productName = productName;
        this.currentStock = currentStock;
        this.dailySalesRate = dailySalesRate;
        this.unitPrice = unitPrice;
        this.leadTimeDays = leadTimeDays;
        this.isSeasonal = isSeasonal;

       
        totalProductsTracked++;
        totalInventoryValue += (currentStock * unitPrice);
    }

 
     static double getAverageInventoryValue() {
        if (totalProductsTracked == 0) return 0.0;
        return totalInventoryValue / totalProductsTracked;
    }

    
     int calculateReorderPoint() {

        double reorderPoint = dailySalesRate * leadTimeDays * 1.5;

        if (isSeasonal) {
            reorderPoint *= 1.3;
        }

        int finalPoint = (int) Math.ceil(reorderPoint);

        if (currentStock < 20) {
            finalPoint += 10;
        }

        return finalPoint;
    }

     String checkStockStatus() {
        int reorderPoint = calculateReorderPoint();

        if (currentStock <= 0) {
            return "OUT OF STOCK - URGENT";
        } else if (currentStock <= reorderPoint) {
            
            int orderQuantity = (reorderPoint * 2) - currentStock;
            return "REORDER NEEDED - Order " + orderQuantity + " units";
        } else if (currentStock <= (reorderPoint * 1.5)) {
            return "LOW STOCK - Monitor closely";
        } else {
            return "HEALTHY STOCK";
        }
    }

     double calculateWeeklyRevenue() {
        int workingDays = 7;
        int day = 1;
        int totalUnitsSold = 0;
        int tempStock = this.currentStock;

        while (day <= workingDays) {
            if (tempStock >= dailySalesRate) {
                totalUnitsSold += dailySalesRate;
                tempStock -= dailySalesRate;
            } else {
                totalUnitsSold += tempStock;
                tempStock = 0; 
            }
            day++;
        }
        return totalUnitsSold * unitPrice;
    }

     void restock(int unitsReceived) {
        this.currentStock += unitsReceived;
        totalInventoryValue += (unitsReceived * unitPrice);
        System.out.println("Restocked: " + unitsReceived + " units of " + productName);
    }
}