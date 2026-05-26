class CylinderRunner
{
	public static void main(String[] args)
	{
		String[] cylinders= new String[10];
		Cylinder storeCylinder= new Cylinder(cylinders);
		
		storeCylinder.getCylinderName("HP");
		storeCylinder.getCylinderName("Indane");
		storeCylinder.getCylinderName("BharatGas");
		storeCylinder.getCylinderName("SuperGas");
		storeCylinder.getCylinderName("RelianceGas");
		storeCylinder.getCylinderName("GoGas");
		storeCylinder.getCylinderName("TotalGas");
		storeCylinder.getCylinderName("AegisGas");
		storeCylinder.getCylinderName("AdaniGas");
		storeCylinder.getCylinderName("MahanagarGas");
	  
		System.out.println("Search Found");
		boolean found = storeCylinder.searchCylinderName("HP");
		System.out.println("Result: " + found);
	
		System.out.println("Search Not Found");
		boolean notFound = storeCylinder.searchCylinderName("ShellGas");
		System.out.println("Result: " + notFound);
		
		System.out.println("Search Null");
		boolean nullCheck = storeCylinder.searchCylinderName(null);
		System.out.println("Result: " + nullCheck);
		
		System.out.println("doing update");
		boolean update = storeCylinder.update(3,"ShellGas");
		System.out.println("Result:"+update);
	
		System.out.println("updating newName by oldName");
		update= storeCylinder.update("ShellGas","Indane");
		System.out.println("Result:"+update);
		
		System.out.println("Deleting by index");
		String result1 = storeCylinder.delete(2);
		System.out.println("Result: " + result1);
		
		System.out.println("Deleting non-existing name");
        String result2 = storeCylinder.delete("Indane");
        System.out.println("Result: " + result2);
		
		System.out.println("Deleting by name");
        String result3 = storeCylinder.delete("ShellGas");
        System.out.println("Result: " + result3);
		
		System.out.println("Deleting null");
        String result4 = storeCylinder.delete(null);
        System.out.println("Result: " + result4);
	}
}