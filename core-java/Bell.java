class Bell {
	String name;
	double price;
	boolean isHandcrafted;
	String location;
	BellType type;
	BellMaterial material;
	BellSound sound;
	BellClapper clapper;
	BellMount mount;

	Bell(String name, double price, boolean isHandcrafted, String location, 
	     BellType type, BellMaterial material, BellSound sound, 
	     BellClapper clapper, BellMount mount) {
		this.name = name;
		this.price = price;
		this.isHandcrafted = isHandcrafted;
		this.location = location;
		this.type = type;
		this.material = material;
		this.sound = sound;
		this.clapper = clapper;
		this.mount = mount;
	}

	void getInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Handcrafted: " + this.isHandcrafted);
		System.out.println("Location: " + this.location);

		if (type != null) {
			type.getBellType("Temple Bell", "Dome");
		} else {
			System.out.println("Type is null");
		}

		if (material != null) {
			material.getMaterialInfo("Brass", 45.5);
		} else {
			System.out.println("Material is null");
		}

		if (sound != null) {
			sound.getSoundProfile("High", 95);
		} else {
			System.out.println("Sound is null");
		}

		if (clapper != null) {
			clapper.getClapperDetails("Iron", true);
		} else {
			System.out.println("Clapper is null");
		}

		if (mount != null) {
			mount.getMounting("Wood Beam", false);
		} else {
			System.out.println("Mount is null");
		}
	}
}

