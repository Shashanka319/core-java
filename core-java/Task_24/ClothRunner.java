class ClothRunner{
	public static void main(String[] args){
		Cloth[] clothes =new Cloth[10];
		ClothStore stores=new ClothStore(clothes);
		Cloth cloth1= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth2= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth3= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth4= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth5= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth6= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth7= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth8= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth9= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		Cloth cloth10= new Cloth("Full Slive","T-Shirt",500,1,true,true);
		
		cloth1.clothInfo();
		stores.storeCloth(cloth1);
		cloth2.clothInfo();
		stores.storeCloth(cloth2);
		cloth3.clothInfo();
		stores.storeCloth(cloth3);
		cloth4.clothInfo();
		stores.storeCloth(cloth4);
		cloth5.clothInfo();
		stores.storeCloth(cloth5);
		cloth6.clothInfo();
		stores.storeCloth(cloth6);
		cloth7.clothInfo();
		stores.storeCloth(cloth7);
		cloth8.clothInfo();
		stores.storeCloth(cloth8);
		cloth9.clothInfo();
		stores.storeCloth(cloth9);
		cloth10.clothInfo();
		stores.storeCloth(cloth10);
		
	}
}