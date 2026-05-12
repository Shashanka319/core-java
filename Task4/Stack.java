class Shashank{
	static void run(){
		System.out.println("Shashank Every Day can Run for 2km");
		play();
	}
	static void play(){
		System.out.println("Shashank can Playing Shuttle Badminton");
		run();
	}
}
class StackOverflow{
	public static void main(String[] args){
		System.out.println("Stack Over flow......");
		Shashank.run();
	}
}