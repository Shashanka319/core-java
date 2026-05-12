class Tea {
	String brand;
	double price;
	boolean isCaffeinated;
	String color;
	TeaType type;
	TeaLeaves leaves;
	TeaBrewing brewing;
	TeaIngredients ingredients;
	TeaPackaging packaging;

	Tea(String brand, double price, boolean isCaffeinated, String color,
	    TeaType type, TeaLeaves leaves, TeaBrewing brewing, 
	    TeaIngredients ingredients, TeaPackaging packaging) {
		this.brand = brand;
		this.price = price;
		this.isCaffeinated = isCaffeinated;
		this.color = color;
		this.type = type;
		this.leaves = leaves;
		this.brewing = brewing;
		this.ingredients = ingredients;
		this.packaging = packaging;
	}

	void getInfo() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Price: " + this.price);
		System.out.println("Caffeinated: " + this.isCaffeinated);
		System.out.println("Color: " + this.color);

		if (type != null) {
			type.getTeaType("Assam Black", "India");
		} else {
			System.out.println("Tea type is null");
		}

		if (leaves != null) {
			leaves.getLeafDetails("TGFOP", true);
		} else {
			System.out.println("Leaves info is null");
		}

		if (brewing != null) {
			brewing.getBrewingInstructions(95, 4);
		} else {
			System.out.println("Brewing info is null");
		}

		if (ingredients != null) {
			ingredients.getIngredients("Ginger", 5.0);
		} else {
			System.out.println("Ingredients info is null");
		}

		if (packaging != null) {
			packaging.getPackaging("Tin Can", true);
		} else {
			System.out.println("Packaging info is null");
		}
	}
}