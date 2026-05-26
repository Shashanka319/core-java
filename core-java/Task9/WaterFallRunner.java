class WaterFallRunner{
	public static void main(String []args){
		System.out.println("WaterFall information");
		boolean trueValue=true;
		WaterFall.info("Angel Falls",979.0f,1.1,false,"Plunge");
		
		System.out.println("WaterFall information");
		WaterFall.info("Niagara Falls",51.8f,2400.0,trueValue,"Cataract");
		
		System.out.println("WaterFall information");
		WaterFall.info("Victoria Falls",108.7f,1088.828,trueValue,"Curtain");
		
		System.out.println("WaterFall information");
		WaterFall.info("Iguazu Falls",82.0f,1746.838,trueValue,"Tiered");
		
		System.out.println("WaterFall information");
		WaterFall.info("Jog Falls",253.9f,153.958,true,"Segmented");
		
		System.out.println("------------------>");
		System.out.println("State Owning Information:");
		WaterFall.stateOwninginfo("Maharashtra",12.5f,45.3,84.8f,false,27);
		
		System.out.println("State Owning Information:");
		WaterFall.stateOwninginfo("Karnataka",6.8f,28.8,77.2f,false,29);
		
		System.out.println("State Owning Information:");
		WaterFall.stateOwninginfo("Tamil Nadu",7.7f,31.2,82.9f,false,33);
		
		System.out.println("State Owning Information:");
		WaterFall.stateOwninginfo("Uttar Pradesh",24.1f,26.6,73.0f,true,9);
		
		System.out.println("State Owning Information:");
		WaterFall.stateOwninginfo("Bihar",13.1f,9.9,70.9f,true,10);
	}
}