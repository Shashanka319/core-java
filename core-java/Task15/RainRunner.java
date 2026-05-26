class RainRunner{
	public static void main(String[] args){
		Rain rain=new Rain();
		System.out.println("Rain precipitation:"+rain.precipitation);
		System.out.println("Rain is Acid:"+rain.isAcidRain);
		System.out.println("Rain Category:"+rain.category);
		System.out.println("Rain Origin City:"+rain.originCity);
		System.out.println("Rain Velocity:"+rain.velocity);
		
		Rain rain1=new Rain(2.5f,true,"Mist","Bangalore","Speed");
		System.out.println("Rain precipitation:"+rain1.precipitation);
		System.out.println("Rain is Acid:"+rain1.isAcidRain);
		System.out.println("Rain Category:"+rain1.category);
		System.out.println("Rain Origin City:"+rain1.originCity);
		System.out.println("Rain Velocity:"+rain1.velocity);
		
		Rain rain2=new Rain(2.6f);
			System.out.println("Rain precipitation:"+rain2.precipitation);
		
		Rain rain3=new Rain(true);
		System.out.println("Rain Is Acid Rain:"+rain3.isAcidRain);
		
		Rain rain4=new Rain("Mist");
		System.out.println("Rain Category:"+rain4.category);
			
		Rain rain5=new Rain("Bangalore","Mist");
		System.out.println("Rain Origin City:"+rain5.originCity);
		System.out.println("Rain Category"+rain5.category);
		
		
		
		
	}
}