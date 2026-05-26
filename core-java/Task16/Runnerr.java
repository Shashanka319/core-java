class Runner{
	public static void main(String [] args){
		MuseumCreator.getMusem();
		MuseumCreator.getMusem("visvesvarayya industrial technological museum");
		MuseumCreator.getMusem(100);
		
		ZooCreator.getZoo();
		ZooCreator.getZoo("Mysore Zoo");
		ZooCreator.getZoo(150);
		
		StadiumCreator.getStadium();
		StadiumCreator.getStadium("Chinnaswami Stadium");
		StadiumCreator.getStadium(false);
		
	}
}