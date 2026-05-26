class Track {
    String name;
    float distanceInMeters;
    String surfaceType;
    int laneCount;
    boolean isIndoor;

    Track() {}

    Track(String name, float distanceInMeters, String surfaceType, int laneCount, boolean isIndoor) {
        this.name = name;
        this.distanceInMeters = distanceInMeters;
        this.surfaceType = surfaceType;
        this.laneCount = laneCount;
        this.isIndoor = isIndoor;
    }
	
    Track(String name) {
        this.name = name;
    }

    Track(float distanceInMeters, int laneCount) {
        this.distanceInMeters = distanceInMeters;
        this.laneCount = laneCount;
    }
	
	Track(float distanceInMeters){
		this.distanceInMeters=distanceInMeters;
	}
	
	Track(int laneCount){
		this.laneCount=laneCount;
	}
}