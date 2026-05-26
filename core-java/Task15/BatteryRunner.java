class BatteryRunner{
	public static void main(String[] args){
		Battery battery=new Battery();
		System.out.println("Battery:"+battery.chargeLevel);
		System.out.println("Battery:"+battery.isCharging);
		System.out.println("Battery:"+battery.batteryTemparature);
		System.out.println("Battery:"+battery.cycleCount);
		System.out.println("Battery:"+battery.chemicalComposition);
		
		Battery battery2=new Battery(56.5f);
		System.out.println("Battery:"+battery2.chargeLevel);
		
		Battery battery3=new Battery(true);
		System.out.println("Battery:"+battery3.isCharging);
		
		Battery battery4=new Battery(54.4f,34);
		System.out.println("Battery:"+battery4.batteryTemparature);
		System.out.println("Battery:"+battery4.cycleCount);
		
		Battery battery5=new Battery(45);
		System.out.println("Battery:"+battery5.cycleCount);
		
		Battery battery6=new Battery("Li-on");
		System.out.println("Battery:"+battery6.chemicalComposition);
		
		
		
	}
}