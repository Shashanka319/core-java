class Battery{
	float chargeLevel;
	boolean isCharging;
	float batteryTemparature;
	int cycleCount;
	String chemicalComposition;
	
	Battery(){
		
	}
	 
	Battery(float chargeLevel){
		this.chargeLevel=chargeLevel;
	}
	
	Battery(boolean isCharging){
		this.isCharging=isCharging;
	}
	
	Battery(float batteryTemparature,int cycleCount){
		this.batteryTemparature=batteryTemparature;
		this.cycleCount=cycleCount;
	}
	
	Battery(int cycleCount){
		this.cycleCount=cycleCount;
	}
	
	Battery(String chemicalComposition){
		this.chemicalComposition=chemicalComposition;
	}
}