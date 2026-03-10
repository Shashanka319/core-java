class BellRunner {
	public static void main(String[] args) {
		BellType type = new BellType();
		BellMaterial material = new BellMaterial();
		BellSound sound = new BellSound();
		BellClapper clapper = new BellClapper();
		BellMount mount = new BellMount();

		Bell bell = new Bell("Golden Chime", 500.0, true, "Varanasi", 
		                     type, material, sound, clapper, mount);
		bell.getInfo();
	}
}