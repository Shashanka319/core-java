class CoachRunner {
	public static void main(String[] args) {
		CoachType type = new CoachType();
		CoachExperience experience = new CoachExperience();
		CoachSchedule schedule = new CoachSchedule();
		CoachPerformance performance = new CoachPerformance();
		CoachTeam team = new CoachTeam();

		Coach myCoach = new Coach("Rahul Dravid", 500000.0, true, "Indian",
		                          type, experience, schedule, performance, team);
		myCoach.getInfo();
	}
}