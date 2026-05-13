class TurbineRunner
{
	public static void main(String[] args)
	{
		String[] turbineNames = new String[10];
		Turbine storeTurbine = new Turbine(turbineNames);
		
		storeTurbine.getTurbineName("Steam Turbine");
		storeTurbine.getTurbineName("Gas Turbine");
		storeTurbine.getTurbineName("Wind Turbine");
		storeTurbine.getTurbineName("Hydraulic Turbine");
		storeTurbine.getTurbineName("Pelton Turbine");
		storeTurbine.getTurbineName("Kaplan Turbine");
		storeTurbine.getTurbineName("Francis Turbine");
		storeTurbine.getTurbineName("Impulse Turbine");
		storeTurbine.getTurbineName("Reaction Turbine");
		storeTurbine.getTurbineName("Turbo Generator");
		
		System.out.println("Search Found");
        boolean found = storeTurbine.searchTurbineName("Turbo Generator");
        System.out.println("Result: " + found);

        System.out.println("Search Not Found");
        boolean notFound = storeTurbine.searchTurbineName("Suzlon S88"); 
        System.out.println("Result: " + notFound);

        System.out.println("Search Null");
        boolean nullCheck = storeTurbine.searchTurbineName(null);
        System.out.println("Result: " + nullCheck);
		
		System.out.println("UPDATING BY INDEX");
        boolean updatedByIndex = storeTurbine.update(2, "Savonius Turbine");
        System.out.println("Update by Index Result: " + updatedByIndex);

        System.out.println("UPDATING BY NAME");
        boolean updatedByName = storeTurbine.update("Pelton Turbine", "Kaplan Modified");
        System.out.println("Update by Name Result: " + updatedByName);

        System.out.println("DELETING BY INDEX");
        String deletedByIndex = storeTurbine.delete(1);
        System.out.println("Deleted by Index Result: " + deletedByIndex);

        System.out.println("DELETING BY NAME");
        String deletedByName = storeTurbine.delete("Reaction Turbine");
        System.out.println("Deleted by Name Result: " + deletedByName);
       
	}
}