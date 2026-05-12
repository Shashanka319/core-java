class Tollgate{
	String location;
	double charge;
	String vechelesName;
	boolean gate;
	boolean chargeToBike;
	String tollManager;
	
	Tollgate(String location, double charge, String vechelesName, boolean gate, boolean chargeToBike, String tollManager){
		this.location=location;
		this.charge=charge;
		this.vechelesName=vechelesName;
		this.gate=gate;
		this.chargeToBike=chargeToBike;
		this.tollManager=tollManager;
	}
	void info(){
		System.out.println("location:"+this.location);
		System.out.println("charge:"+this.charge);
		System.out.println("vechelesName:"+this.vechelesName);
		System.out.println("gate:"+this.gate);
		System.out.println("chargeToBike"+this.chargeToBike);
		System.out.println("TollManager:"+this.tollManager);
	}
}