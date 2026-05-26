class Runner{
	public static void main(String[]values){
		Bangle bangle=new Bangle("Green");
		System.out.println("Bangle Color:"+bangle.color);
			
		Anklet anklet=new Anklet(550);
		System.out.println("Anklet Price:"+anklet.price);
		
		Coffee coffee=new Coffee(80,"Cold Coffee");
		System.out.println("Coffee Type:"+coffee.type);
		System.out.println("Coffee Price:"+coffee.price);
		
		Ant ant=new Ant("Fire Ant","Reddish Brown",true);
		System.out.println("Ant Type:"+ant.type);
		System.out.println("Ant Color:"+ant.color);
		System.out.println("Ant Is Danger:"+ant.isDanger);
		
		Bucket bucket=new Bucket("House hold Cleaning","Red",150,2,true);
		System.out.println("Bucket Type:"+bucket.type);
		System.out.println("Bucket color:"+bucket.color);
		System.out.println("Bucket price:"+bucket.price);
		System.out.println("Bucket Quantity:"+bucket.quantity);
		System.out.println("Bucket Quality is Good:"+bucket.qualityIsGood);
		
		Pocket pocket=new Pocket(true,"Squere",3);
		System.out.println("Pocket having purse:"+pocket.havingPurse);
		System.out.println("Pocket having purse:"+pocket.type);
		System.out.println("Pocket having purse:"+pocket.numberOfPocket);
		
		Cricket cricket=new Cricket(16,17,"Virat Kohli","Anushka",2,"Royal Chalengers Bangalore","Bats Name",true,"Virat Kohli",false,"null",108,50,5,4500,true,false,true,10,6);
		System.out.println("Number Of Players In Cricket:"+cricket.noOfPlayer);
		System.out.println("Player Jercy Number:"+cricket.jercyNumber);
		System.out.println("Player Number:"+cricket.name);
		System.out.println("Player Wife Name:"+cricket.playerWifeName);
		System.out.println("Cricket Umpaire:"+cricket.umpaire);
		System.out.println("Cricket Team Name:"+cricket.teamName);
		System.out.println("Type OF Player:"+cricket.typeOfPlayer);
		System.out.println("Is Captain:"+cricket.isCaptain);
		System.out.println("Captain Name:"+cricket.captainName);
		System.out.println("Is Vise Captain:"+cricket.isViseCaptain);
		System.out.println("Vise Captain Name:"+cricket.viseCaptainName);
		System.out.println("Strike Rate:"+cricket.strikeRate);
		System.out.println("Boling Echonaomy:"+cricket.bolingEconomy);
		System.out.println("Number Of Wickets:"+cricket.numberOfWickets);
		System.out.println("Total Runs:"+cricket.totalRuns);
		System.out.println("BatsMan"+cricket.batsman);
		System.out.println("Boler"+cricket.boler);
		System.out.println("All Rounder"+cricket.allRounder);
		System.out.println("Winning Matchs:"+cricket.winningMatches);
		System.out.println("Loosing Matchs:"+cricket.loosingMatches);
		System.out.println("Loosing Matchs:"+cricket.loosingMatches);
		
		Racket racket= new Racket("Super-Heavy Vehicles","White","Falcon9","Bock5",69.85 ,true,"Satelights finding","USA","SpaceX Falcon9",549000);
		System.out.println("Racket Type:"+racket.type);
		System.out.println("Rocket Color:"+racket.color);
		System.out.println("Rocket Name:"+racket.name);
		System.out.println("Roclet Model:"+racket.model);
		System.out.println("Rocket Price:"+racket.price);
		System.out.println("Rocket Is Danger:"+racket.isDanger);
		System.out.println("Rocket Purpose:"+racket.purpose);
		System.out.println("Rocket Place:"+racket.place);
		System.out.println("Rocket Luncher name:"+racket.launcherName);
		System.out.println("Rocket Weight:"+racket.weight);
		
		Helmet helmet=new Helmet("Round","Black",1500);
		System.out.println("Helmet Type:"+helmet.type);
		System.out.println("Helmet Color:"+helmet.color);
		System.out.println("Helmet Cost:"+helmet.cost);
		
		Blanket blanket=new Blanket("Small","Yellow",2,true,1,750);
		System.out.println("Blanket Type:"+blanket.type);
		System.out.println("Blanket Color:"+blanket.color);
		System.out.println("Blanket quantity:"+blanket.quantity);
		System.out.println("Blanket Quality:"+blanket.qualityIsGood);
		System.out.println("Blanket Warrenty:"+blanket.warrenty);
		System.out.println("Blanket Cost:"+blanket.cost);
		
		Bracelet bracelet=new Bracelet("Classic",101,"Cuff","Silver",4500.0f,45,32f,23f,"Toggle","Torquise",44.4f,true,"Round","Golden Silver",455,"Used to make beautifull Hand",12f,55,true);
		System.out.println("Bracelet Name:"+bracelet.name);
		System.out.println("Bracelet Stock Keep Unit:"+bracelet.stockKeepingUnit);
		System.out.println("Bracelet Type:"+bracelet.type);
		System.out.println("Bracelet Material:"+bracelet.material);
		System.out.println(" Bracelet Retaile Price:"+bracelet.retailPrice);
		System.out.println("Bracelet Quantity:"+bracelet.quantityInStock);
		System.out.println("Bracelet Size:"+bracelet.size);
		System.out.println("Bracelet Weight:"+bracelet.weight);
		System.out.println("Bracelet claspType:"+bracelet.claspType);
		System.out.println("Bracelet GemstoneType:"+bracelet.gemstoneType);
		System.out.println("Bracelet Total Carat Weight:"+bracelet.totalCaratWeight);
		System.out.println("Bracelet Is Adjustable:"+bracelet.isAdjustable);
		System.out.println("Bracelet Chain Style:"+bracelet.chainStyle);
		System.out.println("Bracelet Color"+bracelet.color);
		System.out.println("Bracelet No Of Charms:"+bracelet.noOfCharms);
		System.out.println("Bracelet Description:"+bracelet.description);
		System.out.println("Bracelet Discount:"+bracelet.discountPer);
		System.out.println("Bracelet Supplier id:"+bracelet.supplierID);
		System.out.println("Bracelet Is Water proof:"+bracelet.isWaterProof);
		
		
	}

}