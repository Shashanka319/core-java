class Strawberry {
    String variety;
    String size;
    float weight;
    boolean isOrganic;
    String originCountry;

    Strawberry() {}

    Strawberry(String variety, String size, float weight, boolean isOrganic, String originCountry) {
        this.variety = variety;
        this.size = size;
        this.weight = weight;
        this.isOrganic = isOrganic;
        this.originCountry = originCountry;
    }

    Strawberry(String variety) {
        this.variety = variety;
    }

    Strawberry(float weight, boolean isOrganic) {
        this.weight = weight;
        this.isOrganic = isOrganic;
    }
	
	
    Strawberry(float weight) {
        this.weight = weight;
    }
	
	
    Strawberry(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }
	
	
}