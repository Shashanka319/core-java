class Clip {
    String material;
    String color;
    float length;
    boolean isIndustrial;
    String type;

    Clip() {}

    Clip(String material, String color, float length, boolean isIndustrial, String type) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.isIndustrial = isIndustrial;
        this.type = type;
    }

    Clip(String material) {
        this.material = material;
    }

    Clip(float length, String color) {
        this.length = length;
        this.color = color;
    }
	Clip(String type,float length){
		this.type=type;
		this.length=length;
	}
	Clip(boolean isIndustrial){
		this.isIndustrial=isIndustrial;
	}
}