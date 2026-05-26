class Bird{
	static String getColorByName(String name){
		System.out.println("Executing get Color by name In Bird:"+name);
		if(name==null){
			System.out.println("name is not null");
			return "null";
		}
		if(name=="Northern Cardinal"){
			return "Vibrant Red";
		}
		if(name=="Blue Jay"){
			return "Bright Blue";
		}
		if(name=="American Robin"){
			return "Grey-Brown with an Orange-Red breast";
		}
		if(name=="Common Raven"){
			return "All-Black";
		}
		if(name=="Mountain Bluebird"){
			return "Sky blue";
		}
		if(name=="Scaiet macaw"){
			return "Red";
		}
		if(name=="Gold Fish"){
			return "Bright Yellow";
		}
		if(name=="Flamingo"){
			return "Pink";
		}
		if(name=="Mallard Duck"){
			return "Emerald Green";
		}
		if(name=="Bald Eagle"){
			return "Dark Brown";
		}
		if(name=="Great Horned Owl"){
			return "Mottled Brown";
		}
		if(name=="Ruby-Throated"){
			return "Metalic Green";
		}
		if(name=="Atlantic Puffin"){
			return "Black";
		}
		if(name=="baltimore Oriole"){
			return "Bright Orange";
		}
		if(name=="Kingfisher"){
			return "Deep Blue andf Rust-Orange";
		}
		if(name=="Barn Swallo"){
			return "Steel Blue";
		}
		if(name=="Mandarin Duck"){
			return "Multi Colored";
		}
		if(name=="Snowy Owl"){
			return "Pure White";
		}
		if(name=="European Robin"){
			return "Brown with an Orange-Red";
		}
		if(name=="Cuckoo Wasp"){
			return "Metallic Green";
		}
		System.out.println("Check the Bird name Once...");
		return "null";
	}
	static int liferSpan(String name){
		if(name==null){
			System.out.println("name is not null");
			return 0;
		}
		if(name=="Northern Cardinal"){
			return 20;
		}
		if(name=="Blue Jay"){
			return 29;
		}
		if(name=="American Robin"){
			return 92;
		}
		if(name=="Common Raven"){
			return 50;
		}
		if(name=="Mountain Bluebird"){
			return 45;
		}
		if(name=="Scaiet macaw"){
			return 39;
		}
		if(name=="Gold Fish"){
			return 29;
		}
		if(name=="Flamingo"){
			return 42;
		}
		if(name=="Mallard Duck"){
			return 92;
		}
		if(name=="Bald Eagle"){
			return 29;
		}
		if(name=="Great Horned Owl"){
			return 74;
		}
		if(name=="Ruby-Throated"){
			return 32;
		}
		if(name=="Atlantic Puffin"){
			return 32;
		}
		if(name=="baltimore Oriole"){
			return 32;
		}
		if(name=="Kingfisher"){
			return 87;
		}
		if(name=="Barn Swallo"){
			return 67;
		}
		if(name=="Mandarin Duck"){
			return 56;
		}
		if(name=="Snowy Owl"){
			return 89;
		}
		if(name=="European Robin"){
			return 67;
		}
		if(name=="Cuckoo Wasp"){
			return 34;
		}
		System.out.println("Check the Bird name Once...");
		return 0;
		
	}
}