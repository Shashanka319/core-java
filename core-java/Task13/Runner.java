class Runner{
	public static void main(String[] args){
		Fiber fiber=new Fiber();
		fiber.name="Optical Fiber";
		fiber.length=2;
		System.out.println("Fiber Name:"+fiber.name);
		System.out.println("Fiber Length In KM:"+fiber.length);
		fiber.vendors=new String[]{"USA","Italy","Japan","China"} ;
		for(int index=0;index<fiber.vendors.length;index++){
			System.out.println("Vendorers Of the Fibour:"+fiber.vendors[index]);
		}
		
		Labour labour=new Labour();
		labour.name="Shashank";
		System.out.println("labour Name:"+labour.name);
		labour.salary=30000;
		System.out.println("labour Salary:"+labour.salary);
		labour.idProofs=new String[]{"Adhar Card","SSLC Marks Card","Cast Income"};
		for(int index=0;index<labour.idProofs.length;index++){
			System.out.println("Id Poofs Of Labour:"+labour.idProofs[index]);
		}
		
		
		AirConditioner airConditioner=new AirConditioner();
		airConditioner.brand="LG";
		airConditioner.model="TS-Q19HNXE";
		airConditioner.price=35990;
		airConditioner.type="Split Inverter";
		airConditioner.weight=11.5;
		airConditioner.warrenty=1;
		airConditioner.working=true;
		System.out.println("AirConditioner Brand:"+airConditioner.brand);
		System.out.println("AirConditioner Model:"+airConditioner.model);
		System.out.println("AirConditioner Price:"+airConditioner.price);
		System.out.println("AirConditioner Type :"+airConditioner.type);
		System.out.println("AirConditioner Weight:"+airConditioner.weight);
		System.out.println("AirConditioner Warrenty:"+airConditioner.warrenty);
		System.out.println("AirConditioner Working:"+airConditioner.working);
		
		airConditioner.colors=new String[]{"High Glass White","White with Silver","Mirror Block"};
		for(int index=0;index<airConditioner.colors.length;index++){
			System.out.println("Colores Of the Ait Conditioner:"+airConditioner.colors[index]);
		}
		
		Bread bread=new Bread();
		bread.type="Milk Bread";
		System.out.println("Bread Type:"+bread.type);
		bread.outletNames=new String[]{"VV Puram","Variar Beery","Vasavi bekery","SLVB Bekery"};
		for(int index=0;index<bread.outletNames.length;index++){
			System.out.println("Bread Outlet Names:"+bread.outletNames[index]);
		}
		bread.ingredeints=new String[]{"Maida","Milk","Sugar","Yeast"};
		for(int index=0;index<bread.ingredeints.length;index++){
			System.out.println("Bread Ingredeints:"+bread.ingredeints[index]);
		}
		bread.shape="Round";
		System.out.println("Bread Shape:"+bread.shape);
		
		Bun bun=new Bun();
		bun.shape="Triangle";
		bun.brandNames="Britania";
		bun.type="Sweet";
		bun.sugar=true;
		bun.quantities=2;
		bun.cost=35;
		bun.isvegiterian=true;
		bun.nonvegiterian=false;
		System.out.println("Bun Shape:"+bun.shape);
		System.out.println("Bun Brand Name:"+bun.brandNames);
		System.out.println("Bun Type:"+bun.type);
		System.out.println("Bun Sugar:"+bun.sugar);
		System.out.println("Bun Quantity:"+bun.quantities);
		System.out.println("Bun Cost:"+bun.cost);
		System.out.println("Bun Is Vegitiriean:"+bun.isvegiterian);
		System.out.println("Bun Non Vegitiriean:"+bun.nonvegiterian);
		bun.colors=new String[]{"White","Yellow","Orange","Cream"};
		for(int index=0;index<bun.colors.length;index++){
			System.out.println("Bun Colors:"+bun.colors[index]);
		}
		bun.ingredeints=new String[]{"Milk","Maida","Sugar"};
		for(int index=0;index<bun.ingredeints.length;index++){
			System.out.println("Bun Ingradeints:"+bun.ingredeints[index]);
		}

		
		PenDrive penDrive=new PenDrive();
		penDrive.brands=new String[]{"San Disk","Samsung","Kingston"};
		for(int index=0;index<penDrive.brands.length;index++){
			System.out.println("Pendrive Brands:"+penDrive.brands[index]);
		}
		penDrive.models=new String[]{"Ultra Flair","Ultra  Dual Divice"};
		for(int index=0;index<penDrive.models.length;index++){
			System.out.println("Pendrive Models:"+penDrive.models[index]);
		}
		penDrive.amounts=new double[]{500.5,450,309,1500};
		for(int index=0;index<penDrive.amounts.length;index++){
			System.out.println("Pendrive Amountns:"+penDrive.amounts[index]);
		}
		penDrive.totalCapacity=88;
		System.out.println("Pendrive Capacity:"+penDrive.totalCapacity);
		penDrive.connectorType="USB-A";
		System.out.println("Pendrive Connector Type:"+penDrive.connectorType);
		penDrive.usbVerssion=3.14f;
		System.out.println("Pendrive USB Verssion:"+penDrive.usbVerssion);
		penDrive.readSpeedMBps=66;
		System.out.println("Pendrive Read Speed MBps:"+penDrive.readSpeedMBps);
		penDrive.writeSpeedMBps=76;
		System.out.println("Pendrive Write Speed MBps:"+penDrive.writeSpeedMBps);
		penDrive.color="Black";
		System.out.println("Pendrive Color:"+penDrive.color);
		penDrive.vollumeName="MY DATA";
		System.out.println("Pendrive Vollume Name:"+penDrive.vollumeName);
		penDrive.hasLED=true;
		System.out.println("Pendrive hasLED:"+penDrive.hasLED);
		penDrive.fileSystem="NTFS";
		System.out.println("Pendrive File System:"+penDrive.fileSystem);
		penDrive.usedSpeedGB=878.78;
		System.out.println("Pendrive Used Speed GB:"+penDrive.usedSpeedGB);
		penDrive.isWriteProtected=true;
		System.out.println("Pendrive isWriteProtected:"+penDrive.isWriteProtected);
		penDrive.isEncrypted=true;
		System.out.println("Pendrive isEncrypted:"+penDrive.isEncrypted);
		penDrive.isBootable=false;
		System.out.println("Pendrive isBootable:"+penDrive.isBootable);
		penDrive.serialNumber=103;
		System.out.println("Pendrive Serial Number:"+penDrive.serialNumber);
		penDrive.material="Plastic";
		System.out.println("Pendrive Meterial:"+penDrive.material);
		penDrive.warrentyYears=2;
		System.out.println("Pendrive Warrenty Years:"+penDrive.warrentyYears);
		penDrive.writeCycleslimit=10023920;
		System.out.println("Pendrive write Cycles Limit:"+penDrive.writeCycleslimit);
		
		HappyDent happyDent=new HappyDent();
		happyDent.shapes=new String[]{"Round","Squere","RectAngle"};
		happyDent.flovors=new String[]{"Straberry","Pinaple","Lessy"};
		happyDent.brandName="HappyDent";
		happyDent.productVariant="Bubble Gum";
		happyDent.barcode=8624545;
		happyDent.Manufacture="Asia";
		happyDent.color="White";
		happyDent.weightPerPiece=2;
		happyDent.piecesPerPack=5;
		happyDent.packagingType="Cover";
		happyDent.packWidth=2;
		happyDent.packheight=4;
		happyDent.isCenterFilled=true;
		happyDent.isSugarFree=true;
		happyDent.isVegitiriean=true;
		happyDent.caloriCount=1098.2;
		happyDent.coatingType="lenght cover";
		happyDent.allergens="Bright the teeths";
		happyDent.containsActiveCorbon=true;
		happyDent.mrp=80;
		happyDent.wholesalePrice=65;
		happyDent.currency="535735";
		happyDent.stackQuantity=50;
		happyDent.shelfLocation="Asia";
		happyDent.discountPer=10;
		happyDent.lifeMonth=10;
		happyDent.lifeYear=2;
		happyDent.quality="Good";
		happyDent.isHealthy=true;
	
	}
}