class SnowRunner{
	public static void main(String[] args){
		Snow snow=new Snow();
		System.out.println("Snow Snow Fall Depth: "+snow.snowFallDepth);
		System.out.println("Snow Is Powder:"+snow.isPowder);
		System.out.println("Snow Flake Type :"+snow.flakeType);
		System.out.println("Snow Water Wuivalent :"+snow.waterEqivalent);
		System.out.println("Snow Visibility Range:"+snow.visibilityRange);
		
		Snow snow1=new Snow(4.5f,true,"Deep",45.4,300);
		System.out.println("Snow Snow Fall Depth: "+snow1.snowFallDepth);
		System.out.println("Snow Is Powder:"+snow1.isPowder);
		System.out.println("Snow Flake Type :"+snow1.flakeType);
		System.out.println("Snow Water Wuivalent :"+snow1.waterEqivalent);
		System.out.println("Snow Visibility Range:"+snow1.visibilityRange);
		
		Snow snow2=new Snow(44.5f);
			System.out.println("Snow Snow Fall Depth"+snow2.snowFallDepth);
			
		Snow snow3=new Snow(true);
		System.out.println("Snow is Powder:"+snow3.isPowder);
		
		Snow snow4=new Snow("Deep");
		System.out.println("Snow is Powder:"+snow4.flakeType);
		
		Snow snow5=new Snow(44.3);
		System.out.println("Snow is Powder:"+snow5.waterEqivalent);
		
		
		
		
		
	}
}