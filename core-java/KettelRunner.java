class KettelRunner
{
	public static void main(String[] args)
	{
		String[] kettleNames = new String[10];
		Kettle storeKettle = new Kettle(kettleNames);
		
		storeKettle.getKettleName("Prestige");
		storeKettle.getKettleName("Pigeon");
		storeKettle.getKettleName("Butterfly");
		storeKettle.getKettleName("Philips");
		storeKettle.getKettleName("Bajaj");
		storeKettle.getKettleName("Havells");
		storeKettle.getKettleName("Usha");
		storeKettle.getKettleName("Orpat");
		storeKettle.getKettleName("Inalsa");
		storeKettle.getKettleName("MorphyRichards");
		
		System.out.println("Search Found");
		boolean found = storeKettle.searchKettleName("Bajaj");
		System.out.println("Result: " + found);
	
		System.out.println("Search Not Found");
		boolean notFound = storeKettle.searchKettleName("Milton");
		System.out.println("Result: " + notFound);

		System.out.println("Search Null");
		boolean nullCheck = storeKettle.searchKettleName(null);
		System.out.println("Result: " + nullCheck);
		
		System.out.println("Update by index");
        boolean update1 = storeKettle.update(2, "Milton");
        System.out.println("Result: " + update1);
		
		System.out.println("Update by name");
        boolean update2 = storeKettle.update("Havells", "Pigeon");
        System.out.println("Result: " + update2);
		
		System.out.println("Delete by index");
        String deleted1 = storeKettle.delete(1);
        System.out.println("Result: " + deleted1);
		
		System.out.println("Delete by name");
        String deleted2 = storeKettle.delete("Bajaj");
        System.out.println("Result: " + deleted2);
		
		System.out.println("Delete not found");
        String deleted3 = storeKettle.delete("BUTTERFLY");
        System.out.println("Result: " + deleted3);
	}
}
