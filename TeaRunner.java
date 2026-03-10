class TeaRunner {
	public static void main(String[] args) {
		TeaType type = new TeaType();
		TeaLeaves leaves = new TeaLeaves();
		TeaBrewing brewing = new TeaBrewing();
		TeaIngredients ingredients = new TeaIngredients();
		TeaPackaging packaging = new TeaPackaging();

		Tea myTea = new Tea("Tata Tea", 150.0, true, "Dark Brown",
		                    type, leaves, brewing, ingredients, packaging);
		myTea.getInfo();
	}
}