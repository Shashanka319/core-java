class BrokerRunner{
	public static void main(String[] values){
		String[] names={"Najunda","Nagarjun","Arjun"};
		
		BrokerSalary[] info=new BrokerSalary[3];
		info[1]=new BrokerSalary(true, "wedding");
		info[2]=new BrokerSalary(false, "Building Construction");
		info[0]=new BrokerSalary(true, "Job");
		
		Broker broker =new Broker(names,info);
		broker.getinfo();

		
		
	}
	
}