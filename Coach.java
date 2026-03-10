class Coach {
	String name;
	double salary;
	boolean isHeadCoach;
	String nationality;
	CoachType type;
	CoachExperience experience;
	CoachSchedule schedule;
	CoachPerformance performance;
	CoachTeam team;

	Coach(String name, double salary, boolean isHeadCoach, String nationality,
	      CoachType type, CoachExperience experience, CoachSchedule schedule,
	      CoachPerformance performance, CoachTeam team) {
		this.name = name;
		this.salary = salary;
		this.isHeadCoach = isHeadCoach;
		this.nationality = nationality;
		this.type = type;
		this.experience = experience;
		this.schedule = schedule;
		this.performance = performance;
		this.team = team;
	}

	void getInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Head Coach: " + this.isHeadCoach);
		System.out.println("Nationality: " + this.nationality);

		if (type != null) {
			type.getCoachType("Cricket", "Batting");
		} else {
			System.out.println("Coach type is null");
		}

		if (experience != null) {
			experience.getExperience(15, "ICC Level 3");
		} else {
			System.out.println("Experience info is null");
		}

		if (schedule != null) {
			schedule.getSchedule("Morning 6AM - 10AM", true);
		} else {
			System.out.println("Schedule info is null");
		}

		if (performance != null) {
			performance.getPerformance(75.5, 4);
		} else {
			System.out.println("Performance info is null");
		}

		if (team != null) {
			team.getTeamDetails("Royal Challengers", 22);
		} else {
			System.out.println("Team info is null");
		}
	}
}