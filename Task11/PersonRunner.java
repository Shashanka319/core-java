class PersonRunner{
	public static void main(String[] args){
		System.out.println("Person Information:");
		String name="Shashanka";
		String[] emails={"shashank@gmail.com","varun@gmail.com","kishu@gmail.com"};
		long[] mobilenos={9743873982l,9845590865l,76758493647l,8765463527l};
		String address="Hodigere";
		Person.contactInfo(name,emails,mobilenos,address);
		
		System.out.println("Fooddish Information:");
		name="Pannir Butter Masala";
		String[] ingredients={"Butter","Masala items","Pannir","Tamoto","Chilli","Cream","Spices"};
		Person.foodDish(name,ingredients);
		
		System.out.println("Laptop Information:");
		String brand="HP";
		String model="Pavillion";
		String[] ports={"HDMI","USB","Type-C"};
		String[] countries={"India","japan","Germani"};
		Person.laptop(brand,model,ports,countries);
	}
}