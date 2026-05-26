class Carrom {
    String boardType;
    int thicknessMm;
    boolean includesCoins;
    String brand;
    double price;

    Carrom() {}

    Carrom(String boardType, int thicknessMm, boolean includesCoins, String brand, double price) {
        this.boardType = boardType;
        this.thicknessMm = thicknessMm;
        this.includesCoins = includesCoins;
        this.brand = brand;
        this.price = price;
    }

    Carrom(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Carrom(int thicknessMm) {
        this.thicknessMm = thicknessMm;
    }
	
	 Carrom(String brand) {
        this.brand = brand;
    }
	
	 Carrom(boolean includesCoins) {
        this.includesCoins = includesCoins;
    }
	
	
}