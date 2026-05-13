class Broker{
	String[] names;
	BrokerSalary[] salary;
	
	Broker(String[] names,BrokerSalary[] salary){
		this.names=names;
		this.salary=salary;
	}
	void getinfo(){
		System.out.println("Broker Information");
		if(names!=null){
			System.out.println("Broker Names...");
			for(String brokerName:this.names){
				System.out.println("Name:"+brokerName);
			}
		}
		else{
			System.out.println("data is Invalid...");
		}
		if(salary!=null){
			for(BrokerSalary info:this.salary){
				System.out.println("Is Good:"+info.good);
				System.out.println("Is Type:"+info.type);
			}
		}
		else{
			System.out.println("Data is Invalid");
		}
		
	}
}