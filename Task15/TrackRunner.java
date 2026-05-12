class TrackRunner{
	public static void main(String[] args){
		Track track= new Track();
		System.out.println("Track Name:"+track.name);
		System.out.println("Track distanceInMeters:"+track.distanceInMeters);
		System.out.println("Track surfaceType:"+track.surfaceType);
		System.out.println("Track laneCount:"+track.laneCount);
		System.out.println("Track isIndoor:"+track.isIndoor);
		
		Track track1= new Track("Junior College",400.0f,"Round",34,true);
		System.out.println("Track Name:"+track1.name);
		System.out.println("Track distanceInMeters:"+track1.distanceInMeters);
		System.out.println("Track surfaceType:"+track1.surfaceType);
		System.out.println("Track laneCount:"+track1.laneCount);
		System.out.println("Track isIndoor:"+track1.isIndoor);
		
		
		Track track2= new Track("Junior College");
		System.out.println("Track Name:"+track2.name);
		
		Track track3= new Track(200.0f,45);
		System.out.println("Track distanceInMeters:"+track3.distanceInMeters);
		System.out.println("Track laneCount:"+track3.laneCount);
		
		Track track4= new Track(400.0f);
		System.out.println("Track distanceInMeters:"+track4.distanceInMeters);
		
		Track track5= new Track(345);
		System.out.println("Track laneCount:"+track5.laneCount);
		
	}
}