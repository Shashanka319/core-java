public class Spect {
    String brand;
    String model;
    double price;
    boolean isPolarized;
    int frameWidth; 
    String material;
	
    Spect() {
    }

   Spect(String brand) {
        this.brand = brand;
    }

	Spect(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
	
    Spect( double price) {
        this.price = price;
    }

    Spect(boolean isPolarized) {
      
        this.isPolarized = isPolarized;
    }
	
	
    Spect(int frameWidth) {
      
        this.isPolarized = isPolarized;

    }

}