class SteelRunner
{
	public static void main(String[] args)
	{
		String[] steelNames = new String[10];
		Steel storeSteel = new Steel(steelNames);
		
		storeSteel.getSteelName("TATA Steel");
		storeSteel.getSteelName("JSW Steel");
		storeSteel.getSteelName("SAIL");
		storeSteel.getSteelName("Jindal Steel");
		storeSteel.getSteelName("Essar Steel");
		storeSteel.getSteelName("Bhushan Steel");
		storeSteel.getSteelName("Rashmi Steel");
		storeSteel.getSteelName("Mukand Steel");
		storeSteel.getSteelName("Visa Steel");
		storeSteel.getSteelName("Kirloskar Steel");
		
		System.out.println("Search Found");
        boolean found = storeSteel.searchSteelName("Jindal Steel");
        System.out.println("Result: " + found);

        System.out.println("Search Not Found");
        boolean notFound = storeSteel.searchSteelName("POSCO Steel"); 
        System.out.println("Result: " + notFound);

        System.out.println("Search Null");
        boolean nullCheck = storeSteel.searchSteelName(null);
        System.out.println("Result: " + nullCheck);
		
		System.out.println("UPDATING BY INDEX");
		boolean updatedByIndex = storeSteel.update(2, "ArcelorMittal Steel");
		System.out.println("Update by Index Result: " + updatedByIndex);

		System.out.println("UPDATING BY NAME");
		boolean updatedByName = storeSteel.update("Essar Steel", "Ispat Steel");
		System.out.println("Update by Name Result: " + updatedByName);
	
		System.out.println("DELETING BY INDEX");
		String deletedByIndex = storeSteel.delete(1);
		System.out.println("Deleted by Index Result: " + deletedByIndex);

		System.out.println("DELETING BY NAME");
		String deletedByName = storeSteel.delete("Visa Steel");
		System.out.println("Deleted by Name Result: " + deletedByName);
	}
}