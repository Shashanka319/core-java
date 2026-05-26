class BirdRunner{
	public static void main(String[]vallues){
		String color=Bird.getColorByName("Northern Cardinal");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Cuckoo Wasp");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Parrot");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("European Robin");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Snowy Owl");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Mandarin Duck");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Barn Swallow");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Baltimore Oriole");
		System.out.println("Bird Color By name:"+color);
		
		color=Bird.getColorByName("Atlantic Puffin");
		System.out.println("Bird Color By name:"+color);
		
		
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Blue Jay"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("American"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Common Raven"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Mountain Bluebird"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Scarlet Macaw"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Gold Fish"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Flamingo"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Bald Egle"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Great Horned Owl"));
		
		System.out.println("Bird Color By name:"+Bird.getColorByName("Peckcock"));
		
		
		System.out.println("Bird Life Span:"+Bird.liferSpan("Blue Jay"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Peckcock"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Great Horned Owl"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Bald Egle"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Flamingo"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Scarlet Macaw"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Mountain Bluebird"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Common Raven"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("American"));
		System.out.println("Bird Life Span:"+Bird.liferSpan("Atlantic Puffiny"));
	}
}