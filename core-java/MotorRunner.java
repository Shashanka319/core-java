class MotorRunner{
	public static void main(String... values){
		MotorModel model=new MotorModel();
		MotorType type = new MotorType();
		MotorColor color=new MotorColor();
		Bike bike = new Bike();
		Bore bore =new Bore();
		Motor motor = new Motor("Sai Motor",2,true,"Green",20000,model,type,color,bike,bore);
	}
}